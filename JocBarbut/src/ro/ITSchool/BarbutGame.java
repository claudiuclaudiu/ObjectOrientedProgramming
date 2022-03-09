package ro.ITSchool;

import java.util.Locale;
import java.util.Scanner;

public class BarbutGame {

    private BarbutPlayer barbutPlayer1;
    private BarbutPlayer barbutPlayer2;

    public BarbutGame() {
        this.barbutPlayer1 = new BarbutPlayer();
        this.barbutPlayer2 = new BarbutPlayer();
    }

    public void StartGame() {
        askPlayerIfReady("1");
        barbutPlayer1.rollDice();
        printResult("1", barbutPlayer1);

        askPlayerIfReady("2");
        barbutPlayer2.rollDice();
        printResult("2", barbutPlayer2);

        checkWinner(barbutPlayer1, barbutPlayer2);
    }

    private void askPlayerIfReady(String player) {
        System.out.println("Player " + player + " ready? y/n");
        Scanner scan = new Scanner(System.in);
        String answer = scan.nextLine();
        if (answer.toLowerCase().contains("n")) {
            askPlayerIfReady(player);
        }
    }

    private void printResult(String playerNumber, BarbutPlayer barbutPlayer) {
        System.out.println("Player " + playerNumber + " rolled: << " + barbutPlayer.getDiceResult() + " >>");
    }

    private void checkWinner(BarbutPlayer barbutPlayer1, BarbutPlayer barbutPlayer2) {
        int player1Result = barbutPlayer1.getDiceResult();
        int player2Result = barbutPlayer2.getDiceResult();

        if (player1Result > player2Result) {
            System.out.println("Player 1 won");
        } else if (player2Result > player1Result) {
            System.out.println("P:ayer 2 won");
        }else{
            System.out.println("It's a draw");
        }
    }

}

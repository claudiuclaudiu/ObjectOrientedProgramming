package ro.ITSchool;

public class BarbutPlayer {

    private int diceResult;

    private Dice dice1;
    private Dice dice2;

    public BarbutPlayer (){
        this.dice1 = new Dice();
        this.dice2 = new Dice();
    }

    public int getDiceResult() {
        return diceResult;
    }

    public int getRandomValue() {
        double random = Math.random() * 6;
        return (int) random;
    }

    public void rollDice() {
        int randomResult1 = getRandomValue();
        int randomResult2 = getRandomValue();
        int dice1Value = dice1.getdiceValue(randomResult1);
        int dice2Value = dice2.getdiceValue(randomResult2);
        diceResult = dice1Value + dice2Value;

    }
}

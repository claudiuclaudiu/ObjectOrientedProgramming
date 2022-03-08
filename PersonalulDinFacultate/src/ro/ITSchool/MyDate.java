package ro.ITSchool;


/**
* câmpurile an, lună și zi. => 3 variable de clasa de tip int: an luna si zi
*/
public class MyDate {

    private int an;

    private int luna;
    
    private int zi;

    //TODO adauga getteri si setteri

     @Override
    public String toString() {
        return "Anul: " + an + ", luna: " + luna + ", ziua: " + zi;
    }

}

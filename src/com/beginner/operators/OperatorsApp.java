package com.beginner.operators;

public class OperatorsApp {

    public static void main(String[] args) {

        String carModel = "Dodge Challenger SRT 392";
        int price = 14999;
        int moneyInTheBank = 100000;
        boolean isDamaged = true;

        System.out.println("Price of a " + carModel + ": $" + price);
        int increasedPrice = price + 1000;
        System.out.println("The increased price of a " + carModel + ": $" + increasedPrice);
        int decreasedPrice = price - 1000;
        System.out.println("The decreased price of a " + carModel + ": $" + decreasedPrice);
        int twoCarsPrice = price * 2;
        System.out.println("Two " + carModel + ": $" + twoCarsPrice);
        int dodgesYouCanBuy = moneyInTheBank / price;
        System.out.println("From the money we have in the bank we can buy : " + dodgesYouCanBuy + " " + carModel);
        int moneyRemaining = moneyInTheBank % price;
        System.out.println("Money we would remain after buying " + dodgesYouCanBuy + " " + carModel + "" + ": $" + moneyRemaining);
        System.out.println();
        int priceNegative = 14999;
        int priceNegativeWithPlusSign = +priceNegative;
        System.out.println("Negative price with plus sign: $" + priceNegativeWithPlusSign);
        int priceNegativeWithMinusSign = -priceNegative;
        System.out.println("Negative sign with minus sign: $" + priceNegativeWithMinusSign);


    }
}





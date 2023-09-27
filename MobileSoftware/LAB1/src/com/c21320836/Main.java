package com.c21320836;

public class Main {
    public static void main(String[] args) {

        SportsPlayer sportsPlayer1 = new SportsPlayer(
                2002,
                "Women's",
                "Canada");
        SportsPlayer sportsPlayer2 = new SportsPlayer(
                1996,
                "Men's",
                "Russia");

        TennisPlayer tennisPlayer1 = new TennisPlayer(
                1990, 
                "Singles",
                "USA",
                1.85,
                new BirthPlace("Los Angeles", "USA"),
                "John Smith",
                1,
                1000000,
                "Right"
        );
        TennisPlayer tennisPlayer2 = new TennisPlayer(
                2003,
                "Singles", // Category
                "Japan", // Country
                1.85, // Height in meters
                new BirthPlace("Osaka", "Japan"),
                "Itto Sawayama",
                1,
                1000000,
                "Right"
        );

        System.out.println("\nTENNIS PLAYES: ");
        System.out.println("\n");
        System.out.println(tennisPlayer1.toString());
        tennisPlayer1.showNationality();
        tennisPlayer1.showAge(2023);

        System.out.println("\n");
        System.out.println(tennisPlayer2.toString());
        tennisPlayer2.showNationality();
        tennisPlayer2.showAge(2023);

        SportsPlayer.displayPlayerCount();

        System.out.println("\nSPORTS PLAYES: ");
        System.out.println("\n");
        System.out.println(sportsPlayer1.toString());
        sportsPlayer1.showNationality();
        sportsPlayer1.showAge(2023);

        System.out.println("\n");
        System.out.println(sportsPlayer2.toString());
        sportsPlayer2.showNationality();
        sportsPlayer2.showAge(2023);

        SportsPlayer.displayPlayerCount();
    }
}
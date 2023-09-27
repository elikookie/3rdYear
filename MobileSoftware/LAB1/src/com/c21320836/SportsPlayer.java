package com.c21320836;

public class SportsPlayer implements PrintValues {

    private int yearOfBirth;
    private String category;
    private String country;

    private static int playerCount = 0;

    public SportsPlayer(int yearOfBirth, String category, String country) {
        this.yearOfBirth = yearOfBirth;
        this.category = category;
        this.country = country;
        playerCount++;
    }

    public SportsPlayer() {
        // Default constructor
    }

    public void showNationality() {
        System.out.println("Country: " + getCountry());
    }

    public void showAge(int currentYear) {
        int age = currentYear - getYearOfBirth();
        System.out.println("Age: " + age + " years");
    }

    public static void displayPlayerCount() {
        System.out.println("Total Players: " + playerCount);
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    @Override
    public String toString() {
        return "Year of Birth: " + yearOfBirth +
                "\nCategory: " + category +
                "\nNationality: " + country;
    }

}

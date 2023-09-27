package com.c21320836;

public class TennisPlayer extends SportsPlayer {
    private double heightMeters;
    private BirthPlace POB;
    private String coachName;
    private int bestATP;
    private double prizeMoney;
    private String hand;

    public TennisPlayer(int yearOfBirth, String category, String country, double heightMeters, BirthPlace pOB,
            String coachName, int bestATP, double prizeMoney, String hand) {
        super(yearOfBirth, category, country);
        this.heightMeters = heightMeters;
        POB = pOB;
        this.coachName = coachName;
        this.bestATP = bestATP;
        this.prizeMoney = prizeMoney;
        this.hand = hand;
    }

    public TennisPlayer() {
        // Default constructor
    }

    public double getHeightMeters() {
        return heightMeters;
    }

    public void setHeightMeters(double heightMeters) {
        this.heightMeters = heightMeters;
    }

    public BirthPlace getPOB() {
        return POB;
    }

    public void setPOB(BirthPlace pOB) {
        POB = pOB;
    }

    public String getCoachName() {
        return coachName;
    }

    public void setCoachName(String coachName) {
        this.coachName = coachName;
    }

    public int getBestATP() {
        return bestATP;
    }

    public void setBestATP(int bestATP) {
        this.bestATP = bestATP;
    }

    public double getPrizeMoney() {
        return prizeMoney;
    }

    public void setPrizeMoney(int prizeMoney) {
        this.prizeMoney = prizeMoney;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nHeight: " + heightMeters + " meters" +
                "\nPlace of Birth: " + POB +
                "\nBest ATP Ranking: " + bestATP +
                "\nCoach's Name: " + coachName +
                "\nPlaying Hand: " + hand +
                "\nPrize Money: US$" + prizeMoney;

    }

}

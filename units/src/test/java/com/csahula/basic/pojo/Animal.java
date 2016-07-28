package com.csahula.basic.pojo;

/**
 * It is my preparation for Java certification and codes do not have purpose.
 */
public class Animal {

    private int necksCount = countNecks();
    private int legsCount = 0;
    private int headsCount = 1;
    private int eyesCount = 0;
    private int tailsCount = 0;
    private int earsCount = 0;

    {
        legsCount = 2;

        if (headsCount == 0) {
            headsCount = 100;
        }
    }

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// CONSTRUCTOR ///////////////////////
    //////////////////////////////////////////////////////////////////

    public Animal() {

        if (necksCount == 0) {
            necksCount = 30;
        }
        if (legsCount == 0) {
            legsCount = 5;
        }
        if (headsCount == 0) {
            headsCount = 3;
        }
        if (eyesCount == 0) {
            eyesCount = 10;
        }
        if (tailsCount == 0) {
            tailsCount = 10;
        }
        if (earsCount == 0) {
            earsCount = 15;
        }
    }

    {
        earsCount = 5;
    }

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// BEHAVIOR //////////////////////////
    //////////////////////////////////////////////////////////////////

    public int countNecks() {
        return 2;
    }

    public void countTails() {
        if (tailsCount == 0) {
            tailsCount = 4;
        }
    }

    //////////////////////////////////////////////////////////////////
    ////////////////////////////// ACCESSORS /////////////////////////
    //////////////////////////////////////////////////////////////////

    public int getNecksCount() {
        return necksCount;
    }

    public void setNecksCount(int necksCount) {
        this.necksCount = necksCount;
    }

    public int getLegsCount() {
        return legsCount;
    }

    public void setLegsCount(int legsCount) {
        this.legsCount = legsCount;
    }

    public int getHeadsCount() {
        return headsCount;
    }

    public void setHeadsCount(int headsCount) {
        this.headsCount = headsCount;
    }

    public int getEyesCount() {
        return eyesCount;
    }

    public void setEyesCount(int eyesCount) {
        this.eyesCount = eyesCount;
    }

    public int getTailsCount() {
        return tailsCount;
    }

    public void setTailsCount(int tailsCount) {
        this.tailsCount = tailsCount;
    }

    public int getEarsCount() {
        return earsCount;
    }

    public void setEarsCount(int earsCount) {
        this.earsCount = earsCount;
    }
}

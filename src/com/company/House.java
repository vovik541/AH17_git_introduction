package com.company;

public class House {

    private String houseName;

    public int numberOfDoors;
    public int numberOfWindows;
    public boolean isOpen;

    public House(String houseName1, int numberOfDoors1, int numberOfWindows1, boolean isOpen1){
        houseName = houseName1;
        numberOfDoors = numberOfDoors1;
        numberOfWindows = numberOfWindows1;
        isOpen = isOpen1;
    }

    public String toString(){
        return "Name: " + houseName + ", numberOfDoors:" + numberOfDoors + ", numberOfWindows: " + numberOfWindows;
    }

    public String getHouseName(){
        return houseName;
    }
}

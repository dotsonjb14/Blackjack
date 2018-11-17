package com.tht.blackjack.models;

public class Card {
    private String face;

    public int getValue() {
        if(face.equalsIgnoreCase("1")) {
            return 1;
        }
        if(face.equalsIgnoreCase("2")) {
            return 2;
        }
        if(face.equalsIgnoreCase("3")) {
            return 3;
        }
        if(face.equalsIgnoreCase("4")) {
            return 4;
        }
        if(face.equalsIgnoreCase("5")) {
            return 5;
        }
        if(face.equalsIgnoreCase("6")) {
            return 6;
        }
        if(face.equalsIgnoreCase("7")) {
            return 7;
        }
        if(face.equalsIgnoreCase("8")) {
            return 8;
        }
        if(face.equalsIgnoreCase("9")) {
            return 9;
        }
        if(face.equalsIgnoreCase("10")) {
            return 10;
        }

        if(face.equalsIgnoreCase("J")) {
            return 10;
        }
        if(face.equalsIgnoreCase("Q")) {
            return 10;
        }
        if(face.equalsIgnoreCase("K")) {
            return 10;
        }
        if(face.equalsIgnoreCase("A")) {
            return 11;
        }

        return 0;
    }

    public String getFace() {
        return face;
    }

    public void setFace(String face) {
        this.face = face;
    }
}

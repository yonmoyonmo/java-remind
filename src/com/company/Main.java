package com.company;

public class Main {

    public static void main(String[] args) {
        RandomMaker randomMaker = new RandomMaker(99999);
        System.out.println(randomMaker.getRandomThree().toString());
    }
}

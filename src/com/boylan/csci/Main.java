package com.boylan.csci;

public class Main {

    public static void main(String[] args) {
        person me = new person("The Joker", "thejoker@talismania.com");
        System.out.println(me.toString());
        businesscontact alsoMe = new businesscontact("Phineas Joker", "pjoker56@gmail.com", "614-666-6627");
        System.out.println(alsoMe.toString());
    }
}
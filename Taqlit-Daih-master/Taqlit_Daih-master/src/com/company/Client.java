package com.company;

public class Client {

    public static void main(String[] args) {
	// write your code here
        Terre T1 =new Terre().getInstance();
        Terre T2 = new Terre().getInstance();
        Terre T3 = new Terre();
        Terre T4 = new Terre().getInstance();
        T3.afficher();


    }
}

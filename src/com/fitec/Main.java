package com.fitec;

public class Main {
    // exo1: palandrome en java pour une String

    boolean isPalindrome(String mot) {
        if(mot == null || mot.length() <= 1) return true;
        int i = 0;
        int length = mot.length() - 1;
        while (i < length / 2) {
            if (mot.charAt(i) != mot.charAt(length - i)) {
                return false;
            }
            i++;
        }
        return true;
    }

    public static void main(String[] args) {
        /*
        int a = 5; // int ne peut pas etre null
        Integer b= a; //
        b.toString(); // on peut transformer Integer en string ( integer c une class donc elle a des methodes...)
        */
    Main main = new Main();
    main.isPalindrome("aaabaaa");

    System.out.println("Result " + main.isPalindrome("ab"));
    }
}

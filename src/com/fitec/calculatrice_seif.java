package com.fitec;

import java.util.Scanner;

public class calculatrice_seif {

    long add(long x, long y) {
        return x + y;
    }

    long multiply(long x, long y) {
        return x * y;
    }

    long substract(long x, long y) {
        return x - y;
    }

    float divideFloat(float x, float y) { //   5/2 = 2.5;     5 % 2 = 1
        if (y == 0) throw new RuntimeException("WE can't divide by ZERO");
        return x / y;
    }


    long divideEntier(long x, long y) {
        if (y == 0) throw new RuntimeException("WE can't divide by ZERO");
        return x / y;
    }

    long power(long x, long pow) {// power = 0; x^pow = x * (x ^(pow-1))
        if (pow == 0) return 1;
        return x * power(x, pow - 1);
    }

    long powerIterative(long x, long pow) {
        long result = 1;
        for (long j = pow; j > 0; j--) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("quelle operation vous voulez faire? (ADD, MULTIPLY, SUBSTRACT, DIVIDE, POWER)");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        System.out.println("Vous voulez faire l'operation : " + operation);
        System.out.println("entrez X");
        long x = scanner.nextLong();
        System.out.println("entrez Y");
        long y = scanner.nextLong();

        long result = 0;
        Calculatrice calculatrice = new Calculatrice();

        if (operation.equals("ADD")) {
            result = calculatrice.add(x, y);
        } else if (operation.equals("MULTIPLY")) {
            result = calculatrice.multiply(x, y);
        } else if (operation.equals("SUBSTRACT")) {
            result = calculatrice.substract(x, y);
        } else if (operation.equals("DIVIDE")) {
            result = calculatrice.divideEntier(x, y);
        }

        System.out.println("le resultat de " + x + " " + operation + " "+ y +  " = " + result);
    }
}

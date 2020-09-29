package com.fitec;

import java.util.Scanner;

public class Calculatrice {

    long add(long x, long y){
        return x+y;
    }
    long multiply(long x, long y){
        return x*y;
    }
    long substract(long x, long y){
        return x-y;
    }
    float divideFloat(float x, float y){
        if(y==0) throw new RuntimeException(" we can't divide by ZERO");
        return x/y;

    }

    long divideEntier(long x, long y){
        if(y==0) throw new RuntimeException(" we can't divide by ZERO");
        return x/y;
    }

    long power (long x, long pow){
        //return Math.pow(x, y);
        if(pow==0) return 1;
        return x * power( x, pow-1);
    }

    long powerIterative(int x, int pow) {
        long result = 1;
        for (int j = pow; j > 0; j--) {
            result *= x;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println("quelle operation voulez vous faire  , division, addition, multiplication...??");
        Scanner scanner = new Scanner(System.in);
        String operation = scanner.nextLine();
        System.out.println("vous voulez faire cette operation : " + operation);
        System.out.println("entrez x votre premiere valeur ");
        long x  = scanner.nextLong();
        System.out.println("vous avez saisi : " + x);

        System.out.println("entrez y deuxeme valeur ");

        long y  = scanner.nextLong();
        System.out.println("vous avez saisi : " + y);


        long result = 0;

        Calculatrice calculatrice = new Calculatrice();


        if ("ADD".equals(operation)) {
            result = calculatrice.add(x, y);
        } else if ("MULTIPLY".equals(operation)) {
            result = calculatrice.multiply(x, y);
        } else if ("SUBSTRACT".equals(operation)) {
            result = calculatrice.substract(x, y);
        } else if ("DIVIDE".equals(operation)) {
            result = calculatrice.divideEntier(x, y);
        } else {
            System.out.println(" arong operation");
        }

        System.out.println("le resultat de " + x + " " + operation + " "+ y +  " = " + result);


        // transformer en swith
        switch (operation){
            case "ADD":
                result = calculatrice.add(x,y);
                break;
            case "MULTIPLY":
                result = calculatrice.multiply(x, y);

            case "SUBSTRACT":
                result = calculatrice.substract(x, y);

            case "DIVIDE":
                result = calculatrice.divideEntier(x, y);
                break;
            case "power":
                result = calculatrice.power(x,y);
                break;
            default:
                System.out.println(" arong operation");
        }

        //nouvelle facon sans mettre de break
        switch (operation) {
            case "ADD" -> result = calculatrice.add(x, y);
            case "MULTIPLY" -> result = calculatrice.multiply(x, y);
            case "SUBSTRACT" -> result = calculatrice.substract(x, y);
            case "DIVIDE" -> result = calculatrice.divideEntier(x, y);
            default -> System.out.println(" arong operation");
        }


        // facon 3 en creant un enum ( cree une classe enum Operations )
        // pour appeler les ; ici (operation) c'est la valeur saisie dans le scanner
        Operations myOperation = Operations.valueOf(operation);
        switch (myOperation){
            case ADD :
                result = calculatrice.add(x,y);
                break;
            case MULTIPLY:
                result = calculatrice.multiply(x,y);
                break;
            case power:
                result = calculatrice.power(x,y);

                //.......
            default:
                System.out.println(" arong operation");

        }


    }
}

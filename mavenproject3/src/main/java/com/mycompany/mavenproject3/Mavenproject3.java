package com.mycompany.mavenproject3;
 import java.util.Scanner;

public class Mavenproject3{

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cuadrado, cubo, numero;
        System.out.print("Ingresa el número: ");
        numero = in.nextDouble();
        in.nextLine();
        cuadrado= numero * numero;
        cubo= 2cuadrado * numero;
        System.out.println("Valor de cuadrado: " + cuadrado);
        System.out.println("Valor de cubo: " + cubo);
    }

}



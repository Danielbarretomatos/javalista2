package com.unama;
import java.util.Scanner;
public class Lista2qD {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        double LaA,LaB,LaC;
        System.out.println("informe o lado A: ");
        LaA = sc.nextDouble();
        System.out.println("informe o lado B : ");
        LaB = sc.nextDouble();
        System.out.println("Informe o lado C: ");
        LaC = sc.nextDouble();
        if  ((LaA != LaB )&&(LaB != LaC)&&(LaA != LaC)){
        System.out.println("Seu triângulo é Escaleno");
        }
        if ((LaA == LaB)&&(LaB == LaC)){
            System.out.println("Seu triãngulo é Equilatero");
        }
        if ((LaA == LaB)&&(LaA != LaC)){
            System.out.println("Seu triângulo é Isósceles");
        }

    }
}

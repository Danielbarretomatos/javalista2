package com.unama;

import java.util.Scanner;

public class lista2qA {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int folhas;
        double totalp;
        System.out.println("informe a quantidade de cópias que você deseja: ");
        folhas = sc.nextInt();
       if(folhas>100) {
           totalp = folhas * 0.2;
           System.out.println("O preço em R$ é: "+totalp);
       }else{
               totalp = folhas * 0.25;
               System.out.println("O preço em R$ é: "+totalp);

       }
    }
}

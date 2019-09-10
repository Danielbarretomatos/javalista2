package com.unama;
import java.util.Scanner;
public class Lista2qB {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);

        int pecasproduzidas, pecasdefeituosas;
        System.out.println("informe a quantidade de peças produzidas: ");
        pecasproduzidas = sc.nextInt();
        System.out.println("informe a quantidade de peças defeituosas: ");
        pecasdefeituosas = sc.nextInt();
        if(pecasdefeituosas > (pecasproduzidas * 0.1)){
            System.out.println("Máquina PRECISA de reparos!!!!!0-0");
        }else{
            System.out.println("Máquina NÃO precisa de manutenção!!!!!");
        }
    }
    }


package com.unama;
import java.util.Scanner;
public class Lista2qC {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int idade;
        System.out.println("Informe a sua idade: ");
        idade = sc.nextInt();
        if (idade<=10){
            System.out.println("Sua categoria é INFANTIL");
        }else {if (idade<=17){
                System.out.println("Sua categoria é JUVENIL");
            }else{

                    System.out.println("Sua categoria é SENIOR ");
                }
            }

        }
    }


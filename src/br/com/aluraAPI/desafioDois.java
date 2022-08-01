package br.com.aluraAPI;
import java.util.*;

public class desafioDois {
            public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            double total = 0 ,media = 0;
            int casos = input.nextInt();
            int cont = 0;
            while (cont < casos){
            double a = input.nextDouble();
            double b = input.nextDouble();
            double c = input.nextDouble();
            total = a*3.0 + b*2.0 + c*5.0;
            media = total / 10.0;
            cont++;
            }
            System.out.println(media);
        }
    }


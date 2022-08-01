package br.com.aluraAPI;

import java.util.Scanner;

public class desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
// TODO: complete os espaços em branco com sua solução para o problema
        String[] nomes = new String[10];

        for(int i=0 ; i<10 ; i++){
            nomes[i] = sc.nextLine();
            if (nomes[i].contains(" ")) {
                nomes[i] = nomes[i].replaceAll("\\s+", "");  // replaceAll ele troca pelo o que vo~e quer
            }



        }
        System.out.println(nomes[2]);
        System.out.println(nomes[6]);
        System.out.println(nomes[8]);

    }
}

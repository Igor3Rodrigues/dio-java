package edu.igor.operadores;

public class Operadores5 {
    public static void main(String[] args){
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("numeroUm é igual a numeroDois? " + simNao);

        simNao = numero1 != numero2;

        System.out.println("numeroUm é diferente a numeroDois? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("numeroUm é maior a numeroDois? " + simNao);

        simNao = numero1 < numero2;

        System.out.println("numeroUm é menor a numeroDois? " + simNao);
    }
}

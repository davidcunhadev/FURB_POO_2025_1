package com.questao1;

public class Main {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.altura = 1.75;
        pessoa.peso = 78;

        System.out.println("O IMC da pessoa é de: " + pessoa.calcularImc());
    }
}
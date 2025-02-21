package com.questao3;

import java.util.Scanner;

public class Pessoa {
  Scanner scanner = new Scanner(System.in);
  double altura;
  double peso;


  public double calcularImcInput() {
    System.out.println("Digite a altura: ");
    altura = scanner.nextDouble();

    System.out.println("Digite o peso: ");
    peso = scanner.nextDouble();

    double imc = peso / (altura * 2);

    return imc;
  }
}

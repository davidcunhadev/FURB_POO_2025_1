package com.questao2;

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

    double imc = peso / (altura * altura);

    return imc;
  }
}

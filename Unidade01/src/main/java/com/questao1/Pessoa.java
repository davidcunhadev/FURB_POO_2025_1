package com.questao1;

public class Pessoa {
  double altura;
  double peso;

  public double calcularImc() {
    double imc = peso / (altura * 2);

    return imc;
  }
}

package com.questao1;

public class Pessoa {
  double altura;
  double peso;

  public double calcularImc() {
    double imc = peso / (altura * altura);

    return imc;
  }
}

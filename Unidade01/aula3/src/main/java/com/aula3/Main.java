package com.aula3;

import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Funcionario[] funcionarios = new Funcionario[2];

        for (int i = 0; i < funcionarios.length; i++) {
            funcionarios[i] = criaFuncionario();
        }

        for (int i = 0; i < funcionarios.length; i++) {
            exibirFuncionario(funcionarios[i]);
        }

        scanner.close();
    }

    public static Funcionario criaFuncionario() {
        System.out.println("Qual o nome do funcionário?");
        String nome = scanner.nextLine();
        
        System.out.println("Qual o salário do funcionário?");
        double salario = scanner.nextDouble();
        scanner.nextLine();

        Funcionario funcionario = new Funcionario(nome, salario);

        return funcionario;
    }

    public static void exibirFuncionario(Funcionario funcionario) {
        System.out.println("Nome: " + funcionario.getNome() + "\n" + "Salário: R$" + funcionario.getSalario() + "\n" + "IRPF: R$" + funcionario.calcularIrpf() );
    }
}
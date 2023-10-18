package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {
    public void startMenu(){
        Scanner scanner = new Scanner(System.in);

        boolean continuar = true;

        while (continuar) {
            System.out.println("Escolha uma opção:");
            System.out.println("1. Criar um círculo");
            System.out.println("2. Criar um retângulo");
            System.out.println("3. Sair");
            int opcao = scanner.nextInt();

            switch (opcao){
                case 1:
                    System.out.print("Informe o raio do círculo: ");
                    double raio = scanner.nextDouble();
                    Circulo circulo = new Circulo(raio);
                    System.out.println("Área do círculo: " + circulo.calcularArea());
                    System.out.println("Perímetro do círculo: " + circulo.calcularPerimetro());
                    break;

                case 2:
                    System.out.print("Informe o comprimento do retângulo: ");
                    double comprimento = scanner.nextDouble();
                    System.out.print("Informe a largura do retângulo: ");
                    double largura = scanner.nextDouble();
                    Retangulo retangulo = new Retangulo(comprimento, largura);
                    System.out.println("Área do retângulo: " + retangulo.calcularArea());
                    System.out.println("Perímetro do retângulo: " + retangulo.calcularPerimetro());
                    break;

                case 3:
                    continuar = false;
                    break;
            }
    }
    }
}

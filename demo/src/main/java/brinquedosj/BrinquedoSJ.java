package brinquedosj;

import java.util.Scanner;

public class BrinquedoSJ {

    public static void main(String[] args) {

        Robo Robo = new Robo();
        System.out.println(Robo.getNome() + "-" + Robo.getBateria()); //Ativação do brinquedo;
        System.out.println(Robo.getDat_fab());

        Calculadora calc = new Calculadora(new Robo()); //Função calculadora;
        Scanner sc = new Scanner (System.in);
        int escolha; float numero1, numero2;

        System.out.println("Ola, sou o " + calc.getRobo().getNome());
        System.out.println("Estou com " + calc.getRobo().getBateria() + " de bateria");
        System.out.println("\n --- Menu ---");
        System.out.println("|1 - Somar");
        System.out.println("|2 - Subtrair");
        System.out.println("|3 - Multiplicar");
        System.out.println("|4 - Dividir");
        System.out.println("|5 - Fim");
        System.out.println(""); escolha = sc.nextInt();

        if (escolha == 1) { //função de soma;
            System.out.println("Digite o numero para a soma: "); numero1 = sc.nextFloat();
            System.out.println("Digite o numero para a soma: "); numero2 = sc.nextFloat();
            System.out.println("|Resultado da soma = " + calc.Somar(numero1, numero2));
            calc.getRobo().setBateria(calc.getRobo().getBateria() - 1); //Diminuição de bateria após função executada
        }else if (escolha == 2){ //função de subtração
            System.out.println("Digite o numero para a subtração: "); numero1 = sc.nextFloat();
            System.out.println("Digite o numero para a subtração: "); numero2 = sc.nextFloat();
            System.out.println("|Resultado da subtração = " + calc.Subtrair(numero1, numero2));
            calc.getRobo().setBateria(calc.getRobo().getBateria() - 1);
        }else if (escolha == 3) { //função de multiplicação
            System.out.println("Digite o numero para a multiplicação: "); numero1 = sc.nextFloat();
            System.out.println("Digite o numero para a multiplicação: "); numero2 = sc.nextFloat();
            System.out.println("|Resultado da soma = " + calc.Multiplicar(numero1, numero2));
            calc.getRobo().setBateria(calc.getRobo().getBateria() - 1);
        }else if (escolha == 4) { //função de divisão
            System.out.println("Digite o numero para a divisão: "); numero1 = sc.nextFloat();
            System.out.println("Digite o numero para a divisão: "); numero2 = sc.nextFloat();
            System.out.println("|Resultado da soma = " + calc.Dividir(numero1, numero2));
            calc.getRobo().setBateria(calc.getRobo().getBateria() - 1);
        }else if (escolha == 5) { //função de saida
            System.out.println("Saída do sistema");
        }else {
            System.out.println("Escolha invalida");
        }
        System.out.println("Bateria restante: " + calc.getRobo().getBateria());
    }
}
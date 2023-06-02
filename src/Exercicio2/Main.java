package Exercicio2;

import Exercicio1.Empregado;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Empregado> empregados;
        empregados = new HashMap<String,Empregado>();

        int idade,salario,op,i;
        String cpf;
        op = 0;
        i=0;


        while (op!=6){


            System.out.println("Digite uma das opcoes abaixo: \n");
            System.out.println("1 - Cadastrar Empregado:");
            System.out.println("2 - Busca Funcionario:");
            System.out.println("3 - Filtra Salario:");
            System.out.println("4 - Mostra Dados :");
            System.out.println("5 - Mostra Dados Maior e Menor Salario:");
            System.out.println("6 - Sair :");


            op = sc.nextInt();

            switch (op){
                case 1 :
                    System.out.println("Digite o Cpf do Empregado: ");
                    cpf = sc.next();
                    System.out.println("Idade: ");
                    idade = sc.nextInt();
                    System.out.println("Salario: ");
                    salario = sc.nextInt();
                    empregados.put(cpf,new Empregado(cpf,idade,salario));
                    break;

                case 2:
                    System.out.println("Cpf: ");
                    cpf = sc.next();
                    Empregado a  = new Empregado();
                    System.out.println(a.busca(cpf, (HashMap) empregados));
                    break;

                case 3:
                    System.out.println("Salario Maior que: ");
                    salario = sc.nextInt();
                    for (String key: empregados.keySet() ) {
                        if (empregados.get(key).getSalario() > salario){
                            System.out.println(empregados.get(key).toString());
                        }
                    }
                    break;

                case 4:

                    for (String key: empregados.keySet() ) {
                        System.out.println(empregados.get(key).toString());
                    }
                    break;

                case 5:
                    Empregado c  = new Empregado();

                    System.out.println(c.maiorEmenor(empregados));
                    break;

                case 6:
                    System.out.println("Finalizando...");

            }
        }




    }


}

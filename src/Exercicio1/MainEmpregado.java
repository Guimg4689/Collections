package Exercicio1;



import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class MainEmpregado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Empregado> empregados = new ArrayList<>();
        int idade,salario,op,i;
        String cpf;
        op = 0;
        i=0;


        while (op!=6){


            System.out.println("Digite uma das opcoes abaixo: \n");
            System.out.println("1 - Cadastrar Empregado:");
            System.out.println("2 - Busca Funcionario:");
            System.out.println("3 - Filtra Salario:");
            System.out.println("4 - Mostra Dados Ordenados Idade:");
            System.out.println("5 - Mostra Dados:");


            op = sc.nextInt();

            switch (op){
                case 1 :
                    System.out.println("Digite o Cpf do Empregado: ");
                    cpf = sc.next();
                    System.out.println("Idade: ");
                    idade = sc.nextInt();
                    System.out.println("Salario: ");
                    salario = sc.nextInt();
                    empregados.add(new Empregado(cpf,idade,salario));
                    break;

                case 2:
                    System.out.println("Cpf: ");
                    cpf = sc.next();
                    Empregado a  = new Empregado();
                    System.out.println(a.busca(cpf, (ArrayList<Empregado>) empregados));
                    break;

                case 3:
                    System.out.println("Salario Maior que: ");
                    salario = sc.nextInt();
                    for (Empregado empregado: empregados ) {
                        if (empregado.getSalario() > salario){
                            System.out.println(empregado.toString());
                        }
                    }
                    break;

                case 4:
                    Collections.sort(empregados);
                    for (Empregado empregado: empregados ) {
                        System.out.println(empregado.toString());
                        }
                    break;

                case 5:
                    for (Empregado empregado: empregados ) {
                        System.out.println(empregado.toString());
                    }
                    break;

                case 6:
                    System.out.println("Finalizando...");

            }
        }




        }


    }

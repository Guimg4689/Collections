package Exercicio1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Empregado implements Comparable<Empregado> {
    private String cpf;
    private int idade;
    private int salario;

    public Empregado() {
    }

    public Empregado(String cpf, int idade, int salario) {
        this.cpf = cpf;
        this.idade = idade;
        this.salario = salario;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empregado{" +
                "cpf='" + cpf + '\'' +
                ", idade=" + idade +
                ", salario=" + salario +
                '}';
    }

    @Override
    public int compareTo(Empregado empregado) {

        if (this.idade < empregado.getIdade()) {
            return -1;
        }
        if (this.getIdade() > empregado.getIdade()) {
            return 1;
        }
        return 0;

    }

    public String busca(String cpf, ArrayList<Empregado> a) {
        for (Empregado empregados : a) {
            if (cpf.equals(empregados.getCpf())) {
                return a.toString();
            }

        }
        return "Nao Encontrado\n";
    }

    public String busca(String cpf, HashMap<String, Empregado> a) {
        for (String key : a.keySet()) {
            if (a.get(key).getCpf().equals(cpf)) {
                return a.toString();
            }

        }
        return "Nao Encontrado\n";
    }

    public String maiorEmenor(HashMap<String,Empregado> a){


        Empregado maior = Collections.max(a.values());
        Empregado menor = Collections.min(a.values());
        return "Maior: \n" + maior.toString() + "\nMenor: \n" + menor.toString();
    }
}

package DioExercicio;

import java.util.*;

public class Linguagem implements Comparable<Linguagem> {
    private String nome;
    private int anoCriacao;
    private String ide;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoCriacao() {
        return anoCriacao;
    }

    public void setAnoCriacao(int anoCriacao) {
        this.anoCriacao = anoCriacao;
    }

    public String getIde() {
        return ide;
    }

    public void setIde(String ide) {
        this.ide = ide;
    }

    public Linguagem(String nome, int anoCriacao, String ide) {
        this.nome = nome;
        this.anoCriacao = anoCriacao;
        this.ide = ide;
    }

    @Override
    public String toString() {
        return "Linguagem{" +
                "nome='" + nome + '\'' +
                ", anoCriacao=" + anoCriacao +
                ", ide='" + ide + '\'' +
                '}';
    }

    public static void main(String[] args) {


       Set<Linguagem> linguagens = new HashSet<>();
        linguagens.add(new Linguagem("Pyton",2022,"VsCode"));
        linguagens.add(new Linguagem("Java",2000,"NetBeans"));
        linguagens.add(new Linguagem("JavaScript",2018,"Google"));
        linguagens.add(new Linguagem("Ruby",2022,"vscode"));

        for(Linguagem a: linguagens){
            System.out.println(" nome:" + a.getNome() + " AnoCriacao:" + a.getAnoCriacao() + " Ide:" + a.getIde());
        }

        Set<Linguagem> linguagems2 = new TreeSet<>(linguagens);
        System.out.println("\n " + linguagems2);







    }

    @Override
    public int compareTo(Linguagem o) {
        int a  = Integer.compare(this.getAnoCriacao(),o.getAnoCriacao());
        return a;



    }

}


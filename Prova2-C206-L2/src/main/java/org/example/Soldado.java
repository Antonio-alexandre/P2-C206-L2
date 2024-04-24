package org.example;

public abstract class Soldado {
    static int qtdSoldado;
    private String nome;
    private long cpf;
    ItemEspecial item;

    //Construtor para autoincrementar o contador de soldados
    Soldado(){
        qtdSoldado++;
    }

    public String getNome() {
        return this.nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    void mostraInfo(){
        System.out.println();
        System.out.println("Nome: " +this.nome);
        System.out.println("Cpf: " + this.cpf);
    }

    //Funcao abstrata para usar o item
    public abstract void usandoItem();
}

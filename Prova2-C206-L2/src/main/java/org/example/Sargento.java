package org.example;

import org.example.Interfaces.Defesa;

public class Sargento extends Soldado implements Defesa {
    private String especializacao;
    private int experienciaCombate;

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
    }

    public void setExperienciaCombate(int experienciaCombate) {
        this.experienciaCombate = experienciaCombate;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Especializacao: " +this.especializacao);
        System.out.println("Experiencia em combate: " +this.experienciaCombate);
    }

    @Override
    public void usandoItem(){
        if(this.item == null){
            System.out.println(this.getNome() +" não tem item especial para usar!");
        }
        else{
            System.out.println(this.getNome() +" utilizando item especial!");
        }
    }

    //Defende caso a experiencia em combate for maior que 650
    public void defender(){
        if(this.experienciaCombate > 650)
            System.out.println("Soldado defendendo!");
        else
            System.out.println("Não é possível se defender!");
    }
}

package org.example;

import org.example.Interfaces.Defesa;

public class Oficial extends Soldado implements Defesa {
    private String patente;

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Patente: " +this.patente);
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

    //Defende caso o oficial tenha algum item especial
    public void defender(){
        if(item != null){
            System.out.println("Soldado defendendo!");
        }
        else
            System.out.println("Não é possível se defender!");
    }
}

package org.example;

import org.example.Interfaces.Curar;

public class MedicoMilitar extends Soldado implements Curar {
    private int anosExperiencia;

    private int capacidadeEmergencia;

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void setCapacidadeEmergencia(int capacidadeEmergencia) {
        this.capacidadeEmergencia = capacidadeEmergencia;
    }

    @Override
    public void mostraInfo(){
        super.mostraInfo();
        System.out.println("Anos de experiência: " +this.anosExperiencia);
        System.out.println("Capacidade de emergência: " + this.capacidadeEmergencia);
    }

    //Caso tenha algum item, exibe que esta usando e adiciona 100 pontos a capacidade de emergencia do medico
    @Override
    public void usandoItem(){
        if(this.item == null){
            System.out.println(this.getNome() +" não tem item especial para usar!");
        }
        else{
            System.out.println(this.getNome() +" utilizando item especial!");
            this.capacidadeEmergencia += 100;
        }
    }

    //Cura caso a capacidade de emergencia do medico for maior que 920
    public void curar(){
        if(this.capacidadeEmergencia > 920)
            System.out.println("Soldado curando!");
        else
            System.out.println("Não é possível curar!");
    }
}

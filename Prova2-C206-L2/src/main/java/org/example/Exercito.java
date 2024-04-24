package org.example;

public class Exercito {
    private String nome;
    private Soldado soldados[] = new Soldado[10];


    //Adiciona o soldado no array caso a posicao i for nula
    public void addSoldado(Soldado soldado){
        for(int i = 0; i < this.soldados.length; i++){
            if(this.soldados[i] == null){
                this.soldados[i] = soldado;
                break;
            }
        }
    }

    //Mostra as informacoes completas do exercito e de cada soldado
    public void mostraInfo(){
        System.out.println();
        System.out.println("Nome do exército: " + this.nome);
        System.out.println("Quantidade de soldados: " +Soldado.qtdSoldado);
        System.out.println("Soldados: ");
        for(int i = 0; i < soldados.length; i++){
            if(this.soldados[i] != null){
                if(this.soldados[i] instanceof Sargento){
                    Sargento sargento = (Sargento) this.soldados[i];
                    sargento.mostraInfo();
                    sargento.defender();
                    sargento.usandoItem();
                }
                else if(this.soldados[i] instanceof Oficial){
                    Oficial oficial = (Oficial) this.soldados[i];
                    oficial.mostraInfo();
                    oficial.defender();
                    oficial.usandoItem();
                }
                else if(this.soldados[i] instanceof MedicoMilitar){
                    MedicoMilitar medico = (MedicoMilitar) this.soldados[i];
                    medico.mostraInfo();
                    medico.curar();
                    medico.usandoItem();
                }
            }
        }
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

package org.example;

public class Main {
    public static void main(String[] args) {
        Exercito exercito = new Exercito();
        exercito.setNome("Exército Brasileiro");

        //Definicao dos itens
        ItemEspecial item1 = new ItemEspecial();
        item1.tipo = "Kit Médico";

        ItemEspecial item2 = new ItemEspecial();
        item2.tipo = "Granada";

        //Definicao dos soldados
        Sargento sargento = new Sargento();
        sargento.setNome("João");
        sargento.setEspecializacao("Marinha");
        sargento.setCpf(123456789);
        sargento.setExperienciaCombate(640);

        Oficial oficial = new Oficial();
        oficial.item = item2;
        oficial.setNome("José");
        oficial.setCpf(987654321);
        oficial.setPatente("Tenente");

        MedicoMilitar medico = new MedicoMilitar();
        medico.item = item1;
        medico.setNome("Diego");
        medico.setCpf(192837465);
        medico.setAnosExperiencia(12);
        medico.setCapacidadeEmergencia(830);

        //Adiciona os soldados no array
        exercito.addSoldado(sargento);
        exercito.addSoldado(oficial);
        exercito.addSoldado(medico);

        //Mostra as informacoes do exercito
        exercito.mostraInfo();
    }
}
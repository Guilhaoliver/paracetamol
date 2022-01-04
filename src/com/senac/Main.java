package com.senac;

public class Main {

    public static void main(String[] args) {

        boolean temAnsiedade = true;
        boolean estaNervoso = false;
        boolean desordensPsiquiatricas = false;
        boolean espasmoMuscular = true;
        boolean paralisiaCerebral = true;
        boolean remedioRecomendado = true;
        boolean sensibilidadeAoBenodiazepinicos = false;
        boolean insufienciaRespiratoria = true;
        boolean insuficienciaHepatica = true;


        if (temAnsiedade || estaNervoso
                || desordensPsiquiatricas || espasmoMuscular){
            remedioRecomendado = true;
        }

        if (sensibilidadeAoBenodiazepinicos || insufienciaRespiratoria
        || insuficienciaHepatica) {
            remedioRecomendado = false;
        }

    }
}

package CursoJava.Orientação_A_Objetos;

import CursoJava.Orientação_A_Objetos.Carros;

public class TesteCarros {
    public static void main(String[] args) {
        
        Carros van = new Carros();

        van.marca = "Fiat";
        van.modelo = "Ducato";
        van.numPassageiros = 10;
        van.capacidadeCombustivel = 100;
        van.consumoCombustivel = 0.2;

        System.out.println(van.marca);
    }
}

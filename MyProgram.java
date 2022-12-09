package edu.lucas;

public class MyProgram {
    public static void main (String[] args){
        Calculadora c1 = new Calculadora("Casio");
        Calculadora c2 = new Calculadora("HP");
        c1.valores(4.5f, 2.8f);
        c1.ligar();
        c1.somar();
        c1.subtrair();
        c1.multiplicar();
        c1.dividir();
        c1.desligar();
        c1.somar();
        c2.ligar();
        c2.valores(2, 4);
        c2.somar();


    }
}
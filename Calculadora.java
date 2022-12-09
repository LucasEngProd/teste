package edu.lucas;

public class Calculadora implements Controlador{

    private boolean ligado;
    private String marca;
    private float valor1 = 0;
    private float valor2 = 0;
    public Calculadora(String m){
        this.setLigado(false);
        this.setMarca(m);
    }

    private float getValor1(){
        return this.valor1;
    }
    private void setValor1(float v1){
        this.valor1 = v1;
    }
    private void setValor2(float v2){
        this.valor2 = v2;
    }
    private float getValor2(){
        return this.valor2;
    }
    private boolean isLigado(){
        return this.ligado;
    }
    private void setLigado(boolean l){
        this.ligado = l;
    }


    private void setMarca(String m){
        this.marca = m;
    }
    private String getMarca(){
        return this.marca;
    }

    @Override
    public void ligar() {
        if (!this.isLigado()) {
            this.setLigado(true);
            System.out.println("Calculadora " + this.getMarca() + " está ligada.");
        }
    }
    @Override
    public void desligar() {
        if (this.isLigado()){
            this.setLigado(false);
            System.out.println("Calculadora " + this.getMarca() + " está desligada.");
        }
    }

    @Override
    public void marca() {
        if (this.isLigado()){
            System.out.println(this.getMarca());
        }
    }

    @Override
    public void somar() {
        if (this.isLigado()){
            System.out.println(this.getValor1() + this.getValor2());
        }
    }

    @Override
    public void subtrair() {
        if (this.isLigado()){
            System.out.println(this.getValor1() - this.getValor2());
        }
    }

    @Override
    public void multiplicar() {
        if (this.isLigado()){
            System.out.println(this.getValor1() * this.getValor2());
        }
    }

    @Override
    public void dividir() {
        if (this.isLigado()){
            System.out.println(this.getValor1() / this.getValor2());
        }
    }


    @Override
    public void valores(float v1, float v2) {
        this.setValor1(v1);
        this.setValor2(v2);
    }
}
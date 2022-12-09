package edu.lucas;

public interface Controlador {
    void ligar();
    void desligar();
    public abstract void marca();
    void somar();
    public abstract void subtrair();
    public abstract void multiplicar();
    public abstract void dividir();
    public abstract void valores(float v1, float v2);

}

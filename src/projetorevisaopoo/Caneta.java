package projetorevisaopoo;

public class Caneta {

    private String cor;
    private boolean tampada;
    private float tamanhoPonta;

    public Caneta(String cor, boolean tampada, float tamanhoPonta) {
        this.cor = cor;
        this.tampada = tampada;
        this.tamanhoPonta = tamanhoPonta;
    }

    public Caneta() {
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public boolean isTampada() {
        return tampada;
    }

    public void setTampada(boolean tampada) {
        this.tampada = tampada;
    }

    public float getTamanhoPonta() {
        return tamanhoPonta;
    }

    public void setTamanhoPonta(float tamanhoPonta) {
        this.tamanhoPonta = tamanhoPonta;
    }

    public void escrever() {
        System.out.println("Escrevendo!!!");
    }
}
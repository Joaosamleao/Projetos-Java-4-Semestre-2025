package Cardapio;

import Interfaces.Item;

public class Bebida implements Item {

    private String sabor;
    private char tamanho;
    private String tipo;
    private double preco;
    
    public Bebida (String sabor, char tamanho, String tipo, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.preco = preco;
    }
    public String getSabor() {
        return sabor;
    }
    public char getTamanho() {
        return tamanho;
    }
    public String getTipo() {
        return tipo;
    }
    public double getPreco() {
        return preco;
    }
    public void setSabor(String sabor) {
        this.sabor = sabor;
    }
    public void setTamanho(char tamanho) {
        this.tamanho = tamanho;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
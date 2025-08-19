package Cardapio;

import Interfaces.Item;

public class Pizza implements Item {

    private String sabor;
    private char tamanho;
    private double preco;

    public Pizza (String sabor, char tamanho, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.preco = preco;
    }
    public String getSabor() {
        return sabor;
    }
    public char getTamanho() {
        return tamanho;
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
    public void setPreco(double preco) {
        this.preco = preco;
    }

}
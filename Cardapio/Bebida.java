package Cardapio;

public class Bebida {

    private String sabor;
    private String tamanho;
    private String tipo;
    private double preco;
    
    public Bebida (String sabor, String tamanho, String tipo, double preco) {
        this.sabor = sabor;
        this.tamanho = tamanho;
        this.tipo = tipo;
        this.preco = preco;
    }
    public String getSabor() {
        return sabor;
    }
    public String getTamanho() {
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
    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

}
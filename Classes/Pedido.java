package Classes;

import Cardapio.Bebida;
import Cardapio.Pizza;

public class Pedido {

    private String nomeCliente;
    private String enderecoEntrega;
    private double precoTotal;

    public Pedido(Cliente cliente, Pizza pizza, Bebida bebida) {
        nomeCliente = cliente.getNome();
        enderecoEntrega = cliente.getEndereco();
        precoTotal = pizza.getPreco() + bebida.getPreco();
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    public double getPrecoTotal() {
        return precoTotal;
    }

}

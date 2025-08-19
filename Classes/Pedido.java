package Classes;

import Interfaces.Item;

public class Pedido {

    private String nomeCliente;
    private String enderecoEntrega;
    private double precoTotal;

    public Pedido(Cliente cliente, Item item1, Item item2) {
        nomeCliente = cliente.getNome();
        enderecoEntrega = cliente.getEndereco();
        precoTotal = item1.getPreco() + item2.getPreco();
    }

    public void exibirPedido() {
        System.out.println("Nome do Cliente: " + getNomeCliente() + " Endereço: " + getEnderecoEntrega() + " Preço Total: " + String.format("%.2f", getPrecoTotal()));

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

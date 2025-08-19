package Managers;

import java.util.ArrayList;
import Classes.Cliente;
import Classes.Pedido;
import Interfaces.Item;

public class PedidoManager {
    private ArrayList<Pedido> pedidos;
    
    public PedidoManager() {
        this.pedidos = new ArrayList<Pedido>();
    }
    
    public void criarPedido(Cliente cliente, Item item1, Item item2) {
        Pedido novoPedido = new Pedido(cliente, item1, item2);
        pedidos.add(novoPedido);
    }
    
    public void listarPedidos() {
        if (pedidos.isEmpty()) {
            System.out.println("Não há pedidos registrados.");
            return;
        }
        
        for (int i = 0; i < pedidos.size(); i++) {
            System.out.print(i+1 + " - ");
            pedidos.get(i).exibirPedido();
        }
    }
    
    public Pedido getPedido(int index) {
        if (index >= 0 && index < pedidos.size()) {
            return pedidos.get(index);
        }
        return null;
    }
    
    public int getQuantidadePedidos() {
        return pedidos.size();
    }
}
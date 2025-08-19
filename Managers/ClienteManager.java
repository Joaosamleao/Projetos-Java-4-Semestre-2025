package Managers;

import java.util.ArrayList;
import Classes.Cliente;

public class ClienteManager {
    private ArrayList<Cliente> clientes;
    
    public ClienteManager() {
        this.clientes = new ArrayList<Cliente>();
    }
    
    public void adicionarCliente(String nome, String endereco, String telefone) {
        Cliente cliente = new Cliente(nome, endereco, telefone);
        clientes.add(cliente);
    }
    
    public boolean removerCliente(String nome) {
        for (Cliente c : clientes) {
            if (c.getNome().equals(nome)) {
                clientes.remove(c);
                return true;
            }
        }
        return false;
    }
    
    public void listarClientes() {
        if (clientes.isEmpty()) {
            System.out.println("Não há clientes cadastrados.");
            return;
        }
        
        for (int i = 0; i < clientes.size(); i++) {
            System.out.print(i+1 + " - ");
            clientes.get(i).exibirInformações();
        }
    }
    
    public void exibirCliente(int index) {
        if (index >= 0 && index < clientes.size()) {
            clientes.get(index).exibirInformações();
        } else {
            System.out.println("Índice de cliente inválido.");
        }
    }
    
    public Cliente getCliente(int index) {
        if (index >= 0 && index < clientes.size()) {
            return clientes.get(index);
        }
        return null;
    }
    
    public int getQuantidadeClientes() {
        return clientes.size();
    }
}
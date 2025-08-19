package UI;

import java.util.Scanner;

import Cardapio.CardapioBebida;
import Cardapio.CardapioPizza;
import Interfaces.Item;
import Interfaces.ItemManagement;
import Interfaces.ItemDisplay;
import Interfaces.ItemRetrieval;
import Managers.ClienteManager;
import Managers.PedidoManager;

public class PizzariaUI {
    private Scanner sc;
    private ClienteManager clienteManager;
    private PedidoManager pedidoManager;
    private ItemManagement pizzaManager;
    private ItemDisplay pizzaDisplay;
    private ItemRetrieval pizzaRetrieval;
    private ItemManagement bebidaManager;
    private ItemDisplay bebidaDisplay;
    private ItemRetrieval bebidaRetrieval;
    
    public PizzariaUI(ClienteManager clienteManager, PedidoManager pedidoManager, CardapioPizza cardapioPizza, CardapioBebida cardapioBebida) {
        this.sc = new Scanner(System.in);
        this.clienteManager = clienteManager;
        this.pedidoManager = pedidoManager;

        this.pizzaManager = (ItemManagement) cardapioPizza;
        this.pizzaDisplay = (ItemDisplay) cardapioPizza;
        this.pizzaRetrieval = (ItemRetrieval) cardapioPizza;
        this.bebidaManager = (ItemManagement) cardapioBebida;
        this.bebidaDisplay = (ItemDisplay) cardapioBebida;
        this.bebidaRetrieval = (ItemRetrieval) cardapioBebida;
    }
    
    public void iniciar() {
        int opcao = 0;

        
        while (opcao != 12) {
            exibirMenu();
            System.out.print("Ação: ");
            opcao = sc.nextInt();
            sc.nextLine();
            System.out.println("-----------------");
            
            processarOpcao(opcao);
        }
        
        sc.close();
    }
    
    private void exibirMenu() {
        System.out.print("SOLID - Pizzaria Ver 0.2\n");
        System.out.print("1 - Cardápio de Pizzas\n");
        System.out.print("2 - Cardápio de Bebidas\n");
        System.out.print("3 - Fazer um Pedido\n\n");

        System.out.print("Menu - Funcionário:\n");

        System.out.print("4 - Listar Pedidos\n");
        System.out.print("5 - Listar Clientes\n");
        System.out.print("6 - Adicionar Cliente\n");
        System.out.print("7 - Remover Cliente\n");
        System.out.print("8 - Adicionar Pizza ao Cardápio\n");
        System.out.print("9 - Remover Pizza do Cardápio\n");
        System.out.print("10 - Adicionar Bebida ao Cardápio\n");
        System.out.print("11 - Remover Bebida do Cardápio\n");
        System.out.print("12 - Sair\n\n");
    }
    
    private void processarOpcao(int opcao) {
        switch (opcao) {
            case 1:
                pizzaDisplay.listarItens();
                break;
            case 2:
                bebidaDisplay.listarItens();
                break;
            case 3:
                fazerPedido();
                break;
            case 4:
                listarPedidos();
                break;
            case 5:
                listarClientes();
                break;
            case 6:
                adicionarCliente();
                break;
            case 7:
                removerCliente();
                break;
            case 8:
                pizzaManager.adicionarItem();
                break;
            case 9:
                pizzaManager.removerItem();
                break;
            case 10:
                bebidaManager.adicionarItem();
                break;
            case 11:
                bebidaManager.removerItem();
                break;
            case 12:
                System.out.println("Saindo do sistema...");
                break;
            default:
                System.out.print("Opção inválida\n");
        }
    }
    
    private void fazerPedido() {
        if (clienteManager.getQuantidadeClientes() == 0) {
            System.out.println("Não há clientes cadastrados. Por favor, cadastre um cliente primeiro.");
            return;
        }
        
        clienteManager.listarClientes();
        System.out.print("Selecionar um cliente: "); 
        int clienteSelecionado = sc.nextInt();
        sc.nextLine();
        System.out.print("Cliente Selecionado: ");
        clienteManager.exibirCliente(clienteSelecionado);
        System.out.println("-----------------");

        pizzaDisplay.listarItens();
        System.out.print("Selecionar uma pizza: "); 
        int pizzaSelecionada = sc.nextInt();
        sc.nextLine();
        System.out.print("Pizza Selecionada: ");
        pizzaDisplay.printItem(pizzaSelecionada);
        System.out.println("-----------------");
        
        bebidaDisplay.listarItens();
        System.out.print("Selecionar uma bebida: "); 
        int bebidaSelecionada = sc.nextInt();
        sc.nextLine();
        System.out.print("Bebida Selecionada: ");
        bebidaDisplay.printItem(bebidaSelecionada);
        System.out.println("-----------------");
        
        Item pizzaItem = (Item) pizzaRetrieval.getItem(pizzaSelecionada);
        Item bebidaItem = (Item) bebidaRetrieval.getItem(bebidaSelecionada);

        
        pedidoManager.criarPedido(clienteManager.getCliente(clienteSelecionado), pizzaItem, bebidaItem);
        System.out.println("Pedido criado com sucesso!");
        System.out.println("-----------------");
    }
    
    private void listarPedidos() {
        System.out.print("Lista de Pedidos:\n");
        pedidoManager.listarPedidos();
        System.out.println("-----------------");
    }
    
    private void listarClientes() {
        System.out.print("Lista de Clientes:\n");
        clienteManager.listarClientes();
        System.out.println("-----------------");
    }
    
    private void adicionarCliente() {
        System.out.print("Nome do Cliente: "); 
        String nomeCliente = sc.nextLine();
        System.out.print("Endereço do Cliente: "); 
        String enderecoCliente = sc.nextLine();
        System.out.print("Telefone do Cliente: "); 
        String telefoneCliente = sc.nextLine();
        
        clienteManager.adicionarCliente(nomeCliente, enderecoCliente, telefoneCliente);
        System.out.println("Cliente adicionado com sucesso!");
        System.out.println("-----------------");
    }
    
    private void removerCliente() {
        System.out.print("Nome do Cliente: "); 
        String nomeClienteRemover = sc.nextLine();
        
        boolean removido = clienteManager.removerCliente(nomeClienteRemover);
        if (removido) {
            System.out.println("Cliente removido com sucesso!");
            System.out.println("-----------------");
        } else {
            System.out.println("Cliente não encontrado!");
            System.out.println("-----------------");
        }
    }
}
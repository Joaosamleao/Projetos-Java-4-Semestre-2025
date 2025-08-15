import Classes.Cliente;
import Classes.Pedido;
import Cardapio.CardapioBebida;
import Cardapio.CardapioPizza;

import Cardapio.Pizza;
import Cardapio.Bebida;


import java.util.Scanner;
import java.util.ArrayList;

public class Pizzaria {
    public static void main(String[] args) {

    ArrayList<Pedido> pedidos = new ArrayList<Pedido>();
    ArrayList<Cliente> clientes = new ArrayList<Cliente>();
    CardapioPizza cardapioPizza = new CardapioPizza("Cardápio de Pizzas");
    CardapioBebida cardapioBebida = new CardapioBebida("Cardápio de Bebidas");


    System.out.print("SOLID - Pizzaria Ver 0.1\n");
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
    System.out.print("12 - Sair\n");

    Scanner sc = new Scanner(System.in);
    int opcao = sc.nextInt();

    while (opcao != 12) {
        switch (opcao) {
            case 1:
                //TO-DO
            case 2:
                //TO-DO
            case 3:
                //TO-DO
            case 4:
                System.out.print("Lista de Pedidos:\n");
                for (Pedido p : pedidos) {
                    System.out.println(p.getNomeCliente() + " " + p.getEnderecoEntrega() + " " + p.getPrecoTotal());
                }

            case 5:
                System.out.print("Lista de Clientes:\n");
                for (Cliente c : clientes) {
                    System.out.println(c.getNome() + " " + c.getEndereco() + " " + c.getTelefone());
                }

            case 6:
                System.out.print("Nome do Cliente: "); String nomeCliente = sc.nextLine();
                System.out.print("Endereço do Cliente: "); String enderecoCliente = sc.nextLine();
                System.out.print("Telefone do Cliente: "); String telefoneCliente = sc.nextLine();
                Cliente cliente = new Cliente(nomeCliente, enderecoCliente, telefoneCliente);
                clientes.add(cliente);

            case 7:
                System.out.print("Nome do Cliente: "); String nomeClienteRemover = sc.nextLine();
                for (Cliente c : clientes) {
                    if (c.getNome().equals(nomeClienteRemover)) {
                        clientes.remove(c);
                    }
                }
                System.out.print("Cliente removido com sucesso\n");

            case 8:
                System.out.print("Sabor da Pizza: "); String saborPizza = sc.nextLine();
                System.out.print("Tamanho da Pizza: "); char tamanhoPizza = sc.nextLine().charAt(0);
                System.out.print("Preço da Pizza: "); double precoPizza = sc.nextDouble();

                Pizza pizza = new Pizza(saborPizza, tamanhoPizza, precoPizza);
                cardapioPizza.adicionarItem(pizza);

            case 9:
                //TO-DO
            case 10:
                System.out.print("Tipo da Bebida: "); String tipoBebida = sc.nextLine();
                System.out.print("Nome da Bebida: "); String nomeBebida = sc.nextLine();
                System.out.print("Tamanho da Bebida: "); String tamanhoBebida = sc.nextLine();
                System.out.print("Preço da Bebida: "); double precoBebida = sc.nextDouble();

                Bebida bebida = new Bebida(tipoBebida, nomeBebida, tamanhoBebida, precoBebida);
                cardapioBebida.adicionarItem(bebida);

            case 11:
                //TO-DO
            case 12:
                //TO-DO
            default:
                System.out.print("Opção inválida\n");
            }
        }
    }
}

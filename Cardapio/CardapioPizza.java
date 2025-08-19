package Cardapio;

import Interfaces.ItemDisplay;
import Interfaces.ItemManagement;
import Interfaces.ItemRetrieval;
import java.util.ArrayList;
import java.util.Scanner;

public class CardapioPizza extends Cardapio implements ItemManagement, ItemDisplay, ItemRetrieval {

    private ArrayList<Pizza> pizzas = new ArrayList<Pizza>();
    private Scanner sc = new Scanner(System.in);


    public CardapioPizza(String nome) {
        super(nome);
    }

    @Override
    public void adicionarItem() {
        System.out.print("Sabor da Pizza: "); String saborPizza = sc.nextLine();
        System.out.print("Tamanho da Pizza: "); char tamanhoPizza = sc.nextLine().charAt(0);
        System.out.print("Preço da Pizza: "); double precoPizza = sc.nextDouble();
        pizzas.add(new Pizza(saborPizza, tamanhoPizza, precoPizza));
        System.out.println("Pizza adicionada com sucesso!");
    }

    @Override
    public void removerItem() {
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.println(i+1 + " - " + pizzas.get(i).getSabor() + " " + pizzas.get(i).getPreco() + " " + pizzas.get(i).getTamanho());
        }
        System.out.print("Pizza a ser removida (Indice): "); int indice = sc.nextInt();
        indice = indice-1;
        if (pizzas.get(indice) instanceof Pizza) {
            pizzas.remove(indice);
            System.out.println("Pizza removida com sucesso!");
        }
    }

    @Override
    public void listarItens() {
        for (int i = 0; i < pizzas.size(); i++) {
            System.out.print(i+1 + " - ");
            System.out.println(pizzas.get(i).getSabor() + " " + pizzas.get(i).getPreco() + " " + pizzas.get(i).getTamanho());
        }
    }

    @Override
    public void printItem(int i) {
        System.out.println(pizzas.get(i).getSabor() + " " + pizzas.get(i).getPreco() + " " + pizzas.get(i).getTamanho());

    }

    @Override
    public Pizza getItem(int i) {
        return pizzas.get(i);
    }
}

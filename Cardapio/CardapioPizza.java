package Cardapio;

import Interfaces.AdicionarItem;
import java.util.ArrayList;

public class CardapioPizza extends Cardapio implements AdicionarItem {

    private ArrayList<Pizza> pizzas;


    public CardapioPizza(String nome) {
        super(nome);
    }

    @Override
    public void adicionarItem(Object item) {
        if (item instanceof Pizza) {
            pizzas.add((Pizza) item);
        }
    }

    @Override
    public void removerItem(Object pizza) {
        if (pizza instanceof Pizza) {
            pizzas.remove((Pizza) pizza);
        }
    }

    @Override
    public void listarItens() {
        for (Pizza pizza : pizzas) {
            System.out.println(pizza.getSabor() + " " + pizza.getPreco() + " " + pizza.getTamanho());
        }
    }
}

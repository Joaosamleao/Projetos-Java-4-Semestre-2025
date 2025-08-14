package Cardapio;

import java.util.ArrayList;

import Interfaces.AdicionarItem;

public class CardapioBebida extends Cardapio implements AdicionarItem {
    
    private ArrayList<Bebida> bebidas;

    public CardapioBebida(String nome) {
        super(nome);
    }

    @Override
    public void adicionarItem(Bebida bebida) {
        bebidas.add(bebida);
    }

    @Override
    public void adicionarItem(Object item) {
    }

    @Override
    public void removerItem() {
    }

    @Override
    public void listarItens() {
    }

}


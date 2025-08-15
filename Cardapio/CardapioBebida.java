package Cardapio;

import java.util.ArrayList;

import Interfaces.AdicionarItem;

public class CardapioBebida extends Cardapio implements AdicionarItem {
    
    private ArrayList<Bebida> bebidas;

    public CardapioBebida(String nome) {
        super(nome);
    }

    @Override
    public void removerItem(Object bebida) {
        if (bebida instanceof Bebida) {
            bebidas.remove((Bebida) bebida);
        }
    }

    @Override
    public void listarItens() {
        for (Bebida bebida : bebidas) {
            System.out.println(bebida.getSabor() + " " + bebida.getTamanho() + " " + bebida.getTipo() + " " + bebida.getPreco());
        }
    }

    @Override
    public void adicionarItem(Object bebida) {
        if (bebida instanceof Bebida) {
            bebidas.add((Bebida) bebida);
        }
    }

}


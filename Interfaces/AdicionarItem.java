package Interfaces;

import Cardapio.Bebida;

public interface AdicionarItem {
    void adicionarItem(Object item);
    void removerItem();
    void listarItens();
    void adicionarItem(Bebida bebida);
}
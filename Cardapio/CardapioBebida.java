package Cardapio;

import java.util.ArrayList;
import java.util.Scanner;

import Interfaces.ItemDisplay;
import Interfaces.ItemManagement;
import Interfaces.ItemRetrieval;

public class CardapioBebida extends Cardapio implements ItemManagement, ItemDisplay, ItemRetrieval {
    
    private ArrayList<Bebida> bebidas = new ArrayList<Bebida>();
    private Scanner sc = new Scanner(System.in);

    public CardapioBebida(String nome) {
        super(nome);
    }

    @Override
    public void removerItem() {
        for (int i = 0; i < bebidas.size(); i++) {
            System.out.println(i+1 + " - " + bebidas.get(i).getSabor() + " " + bebidas.get(i).getTamanho() + " " + bebidas.get(i).getTipo() + " " + bebidas.get(i).getPreco());
        }
        System.out.print("Bebida a ser removida (Indice): "); int indice = sc.nextInt();
        indice = indice-1;
        if (bebidas.get(indice) instanceof Bebida) {
            bebidas.remove(indice);
            System.out.println("Bebida removida com sucesso!");
        }
    }

    @Override
    public void listarItens() {
        for (int i = 0; i < bebidas.size(); i++) {
            System.out.print(i+1 + " - ");
            System.out.println(bebidas.get(i).getSabor() + " " + bebidas.get(i).getTamanho() + " " + bebidas.get(i).getTipo() + " " + bebidas.get(i).getPreco());
        }
    }

    @Override
    public void adicionarItem() {
        System.out.print("Sabor da Bebida: "); String nomeBebida = sc.nextLine();
        System.out.print("Tamanho da Bebida: "); char tamanhoBebida = sc.nextLine().charAt(0);
        System.out.print("Tipo da Bebida: "); String tipoBebida = sc.nextLine();
        System.out.print("Preço da Bebida: "); double precoBebida = sc.nextDouble();
        bebidas.add(new Bebida(nomeBebida, tamanhoBebida, tipoBebida, precoBebida));
        System.out.println("Bebida adicionada com sucesso!");
    }

    @Override
    public void printItem(int i) {
        System.out.println(bebidas.get(i).getSabor() + " " + bebidas.get(i).getTamanho() + " " + bebidas.get(i).getTipo() + " " + bebidas.get(i).getPreco());
    }

    @Override
    public Bebida getItem(int i) {
        return bebidas.get(i);
    }
}
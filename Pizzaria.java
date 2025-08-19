
import Cardapio.CardapioBebida;
import Cardapio.CardapioPizza;
import Managers.ClienteManager;
import Managers.PedidoManager;
import UI.PizzariaUI;

public class Pizzaria {
    public static void main(String[] args) {

    ClienteManager clienteManager = new ClienteManager();
    PedidoManager pedidoManager = new PedidoManager();
    CardapioPizza cardapioPizza = new CardapioPizza("Cardápio de Pizzas");
    CardapioBebida cardapioBebida = new CardapioBebida("Cardápio de Bebidas");
    
    PizzariaUI pizzariaUI = new PizzariaUI(clienteManager, pedidoManager, cardapioPizza, cardapioBebida);
    pizzariaUI.iniciar();
    }
}

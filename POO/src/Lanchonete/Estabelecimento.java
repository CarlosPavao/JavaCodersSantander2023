package Lanchonete;

import Lanchonete.area.cliente.Cliente;
import Lanchonete.atendimento.Atendente;
import Lanchonete.atendimento.cozinha.Almoxarife;
import Lanchonete.atendimento.cozinha.Cozinheiro;

public class Estabelecimento {
    public static void main(String[] args) {
		Cozinheiro cozinheiro = new Cozinheiro();
	
        System.out.println("-------------------------------------------------------------");
		
        //ações que estabelecimento precisa ter ciência
		cozinheiro.adicionarSucoNoBalcao();;
		cozinheiro.adicionarLancheNoBalcao();
		cozinheiro.adicionarComboNoBalcao();
		System.out.println("-------------------------------------------------------------");
		        	
        Atendente atendente = new Atendente();
		atendente.servindoMesa();
        atendente.receberPagamento();
		
        System.out.println("-------------------------------------------------------------");
		
		Cliente cliente = new Cliente();
		cliente.escolherLanche();
		cliente.fazerPedido();
		cliente.pagarConta();
		
        System.out.println("-------------------------------------------------------------");
	}
}

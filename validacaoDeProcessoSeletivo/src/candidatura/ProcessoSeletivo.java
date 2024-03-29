package candidatura;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
    public static void main(String[] args) {
        System.out.println("Processo Seletivo!");

        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        
        for(int i=0; i<candidatos.length; i++){
            entrandoEmContato(candidatos[i]);
        }
        

        System.out.println("--------------------------------------------------");



        analisarCandidato(1900.0);
        analisarCandidato(2200.0);
        analisarCandidato(2000.0);
        System.out.println("--------------------------------------------------");
        selecaoDeCandidatos();
        System.out.println("--------------------------------------------------");
        imprimirSelecionados();
        System.out.println("--------------------------------------------------");

    }
    
	static boolean atender() {
		return new Random().nextInt(3)==1;	
	}

    static void entrandoEmContato(String candidato) {
		
		int tentativasRealizadas = 1;
		boolean continuarTentando = true;
		boolean atendeu=false;
		do {
			atendeu= atender();
			continuarTentando = !atendeu;
			if(continuarTentando)
				tentativasRealizadas++;
			else
				System.out.println("CONTATO REALIZADO COM SUCESSO");
			
		}while(continuarTentando && tentativasRealizadas<3);
		
		if(atendeu)
			System.out.println("CONSEGUIMOS CONTATO COM " + candidato +" NA " + tentativasRealizadas + " TENTATIVA");
		else
			System.out.println("NÃO CONSEGUIMOS CONTATO COM " + candidato +", NÚMERO MAXIMO TENTATIVAS " + tentativasRealizadas + " REALIZADA");
		
		
	}
    static void selecaoDeCandidatos(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto", "Monica", "Fabricio","Mirella","Daniela","Carlos"};

        int candidatosSelecionados = 0;
        int candidatoAtual = 0;
        double salarioBase = 2000.0;
        while(candidatosSelecionados < 5 && candidatoAtual < candidatos.length){
            String candidato = candidatos[candidatoAtual];
            double salarioPretendido = valorPretendido();

            System.out.println("O candidato " + candidato + " solicitou este valor de salário " + salarioPretendido);
            if(salarioBase >= salarioPretendido){
                System.out.println("O candidato "+ candidato+" foi selecionado para a vaga");
                candidatosSelecionados++;
            }
            candidatoAtual++;
        }

    }
    static double valorPretendido(){
        return ThreadLocalRandom.current().nextDouble(1800,2200);
    }
    static void analisarCandidato(double salarioPretendido){
        double salarioBase=2000.0;
        if(salarioBase > salarioPretendido){
            System.out.println("Ligar para o candidato");
        }else if(salarioBase == salarioPretendido){
            System.out.println("Ligar para o candidato com contra proposta");
        }
        else{
            System.out.println("Aguardando o resultado demais candidatos");

        }
    }

    static void imprimirSelecionados(){
        String [] candidatos = {"Felipe","Marcia","Julia","Paulo","Augusto"};
        System.out.println("Imprimindo lista de candidatos informando o indice do elemento");

        for(int i=0; i<candidatos.length; i++){
            System.out.println("O candidato de nº " + (i+1) + " é "+candidatos[i]);
        }

        System.out.println("FORMA ABREVIADA DE INTERAÇÂO FOR EACH");

        for(String candidato: candidatos){
            System.out.println("O candidato selecionado foi "+ candidato );
        }

    }
}

package Pilares.Encapsulamento;

public class ComputadorPedrinho {
    public static void main(String[] args) {
		//abrindo MSN Messenger
		System.out.println("====================MSN====================");
		MSNMessenger msn = new MSNMessenger();
		msn.enviarMensagem();
		msn.receberMensagem();
		System.out.println("====================FABEBOOK====================");
		FacebookMessenger face = new FacebookMessenger();
		face.enviarMensagem();
		face.receberMensagem();
		System.out.println("====================TELEGRAM====================");
		Telegram telegram = new Telegram();
		telegram.enviarMensagem();
		telegram.receberMensagem();
		System.out.println("====================ALEÁTORIO====================");
		ServicoMensagemInstantanea smi = null;
		String appEscolhido="msn"; 
		
		if(appEscolhido.equals("msn"))
			smi = new MSNMessenger();
		else if(appEscolhido.equals("fbm"))
			smi = new FacebookMessenger();
		else if(appEscolhido.equals("tlg"))
			smi = new Telegram();
		
			
		smi.enviarMensagem();
		smi.receberMensagem();
	}
}

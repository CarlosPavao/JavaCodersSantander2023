import java.util.Scanner;

public class contaTerminal {
    public static void main(String[] args) {
        //TODO: Conhecer e importar a classe Scanner
        
        //Exibir as mensagens para o nosso usuario

        //obter pela scanner os valores digitados pelo terminal

        //Exibir a mensagem conta criada

        Scanner entrada = new Scanner(System.in);
                
        int conta;
        String agencia;
        String nome;
        double saldo;

        System.out.println("Por favor, digite o seu nome!");
        nome = entrada.nextLine();
        
        System.out.println("Por favor, digite o número da Agência !");
        agencia = entrada.nextLine();

        System.out.println("Por favor, digite o número da Conta !");
        conta = entrada.nextInt();

        System.out.println("Por favor, digite o seu saldo!");
        saldo = entrada.nextDouble();

        

        System.out.println("Olá "+nome+ ", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+ ", conta "+conta+ " e seu saldo "+saldo+ " já está disponível para saque.");
        




    }
}

import java.util.Scanner;


public class BancoApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
          
        double valorInicial = scanner.nextDouble();
        double taxaJuros = scanner.nextDouble();
        int periodo = scanner.nextInt();
        double valorFinal = valorInicial;
        //TODO: Iterar, baseado no período em anos, para calculo do valorFinal com os juros.

        
        taxaJuros = 1+taxaJuros;
        valorFinal = valorInicial*Math.pow(taxaJuros,periodo);

        String resultado = String.format("%.2f", valorFinal);

        System.out.println("Valor final do investimento: R$ " +  resultado);
        
        scanner.close();
    }
}


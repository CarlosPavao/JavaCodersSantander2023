package Pilares;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("589545451");
        jeep.ligar();
        System.out.println("=========================");
        Moto z400 = new Moto();
        z400.setChassi("97654521854");
        z400.ligar();
        System.out.println("=========================");
        Veiculo coringa = jeep;

        coringa.ligar();
    }
}

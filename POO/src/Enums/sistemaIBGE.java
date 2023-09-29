package Enums;

public class sistemaIBGE {
    public static void main(String[] args) {
        for(EstadoBrasileiro e: EstadoBrasileiro.values()){
            System.out.println(e.getSigla() + " - " + e.getNome());
        }
        System.out.println("--------------------------");
        EstadoBrasileiro eb = EstadoBrasileiro.SAO_PAULO;

        System.out.println(eb.getSigla()+ " - " + eb.getNome());
        System.out.println(eb.getNomeMaiusculo());
        System.out.println(eb.getIbge());
    }
    
}

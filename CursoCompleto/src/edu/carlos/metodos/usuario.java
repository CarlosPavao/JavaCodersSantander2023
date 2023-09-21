package edu.carlos.metodos;

public class usuario {
    public static void main(String[] args) {
        
        smartTv smartTv = new smartTv();

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canala atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);
        
        smartTv.ligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);


        smartTv.desligar();
        System.out.println("Novo status -> TV Ligada? " + smartTv.ligada);

        smartTv.aumentarVolume();
        
        smartTv.aumentarVolume();
        
        smartTv.aumentarVolume();
        
        smartTv.aumentarVolume();
        
        smartTv.diminuirVolume();
        
        smartTv.diminuirVolume();
        
        smartTv.diminuirVolume();
        

        smartTv.mudarCanal(22);
        System.out.println("Canala atual: " + smartTv.canal);



    }
}

package edu.carlos.anatomiaDasClasses;

public class boletimDeNotas {
    public static void main(String[] args) {
        double nota = 7;
        
        if(nota < 6){
            System.out.println("REPROVADO");
        }else if(nota == 6){
            System.out.println("PROVA MINERVA");
        }else{
            System.out.println("APROVADO");
        }
    }
}

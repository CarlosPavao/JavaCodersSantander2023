package edu.carlos.Operadores;

public class Operadores {

    public static void main(String[] args) {
        double numero1 = 188.5;
        double numero2 = 21.2;

        double soma = numero1 + numero2;
        System.out.println("SOMA: "+numero1+"+"+numero2+"= "+soma);
        
        double subtracao = numero1 - numero2;
        System.out.println("SUBTRAÇÃO: "+numero1+"-"+numero2+"= "+subtracao);

        double multiplicacao = numero1 * numero2;
        System.out.println("MULTIPLICAÇÃO: "+numero1+"*"+numero2+"= "+multiplicacao);

        double divisao = numero1 / numero2;
        System.out.println("DIVISÃO: "+numero1+"/"+numero2+"= "+divisao);

        double modulo = numero1 % numero2;
        System.out.println("MODULO: "+numero1+"%"+numero2+"= "+modulo);

        double resultado = (numero1*subtracao) + (numero2/divisao);
        System.out.println("1º Grau: ("+numero1+"*"+subtracao+")+("+numero2+"/"+divisao+ ")="+resultado);

    }
    
}

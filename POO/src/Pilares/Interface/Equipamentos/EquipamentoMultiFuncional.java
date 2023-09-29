package Pilares.Interface.Equipamentos;

import Pilares.Interface.Equipamentos.Copiadora.Copiadora;
import Pilares.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Pilares.Interface.Equipamentos.Impressora.Impressora;

public class EquipamentoMultiFuncional implements Copiadora,Impressora,Digitalizadora {

    @Override
    public void copiar() {
        // TODO Auto-generated method stub
        System.out.println("COPIANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
        
    }

    @Override
    public void imprimir() {
        // TODO Auto-generated method stub
        System.out.println("IMPRIMINDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }

    @Override
    public void digitalizar() {
        // TODO Auto-generated method stub
        System.out.println("DIGITALIZANDO VIA EQUIPAMENTO MULTIFUNCIONAL");
    }
    
    
}

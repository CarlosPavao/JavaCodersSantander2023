package Pilares.Interface.Estabelecimento;

import Pilares.Interface.Equipamentos.EquipamentoMultiFuncional;
import Pilares.Interface.Equipamentos.Copiadora.Copiadora;
import Pilares.Interface.Equipamentos.Digitalizadora.Digitalizadora;
import Pilares.Interface.Equipamentos.Impressora.Deskjet;
import Pilares.Interface.Equipamentos.Impressora.Impressora;
import Pilares.Interface.Equipamentos.Impressora.Laserjet;

public class Fabrica {
    public static void main(String[] args) {
        Impressora desk = new Deskjet();
        desk.imprimir();

        Impressora laser = new Laserjet();
        laser.imprimir();

        EquipamentoMultiFuncional em = new EquipamentoMultiFuncional();
        Impressora impressora = em;
        Digitalizadora digitalizadora = em;
        Copiadora copiadora = em;

        digitalizadora.digitalizar();
        impressora.imprimir();
        copiadora.copiar();




    }
}



import java.util.ArrayList;
import java.util.List;

public class Tributo {

    private List<Tributavel> lista;


    public Tributo() {
        lista = new ArrayList<Tributavel>();
    }


    public void adicionaTributavel(Tributavel tributo) {
        lista.add(tributo);
    }


    public void exibeTodos() {
        System.out.println("Lista dos itens tributáveis:");
        for (Tributavel tributo : lista) {
            System.out.println(tributo);
        }
    }

    public Double calculaTotalTributo() {
        Double total=0.0;
        for(Tributavel tributo : lista) {
            total += tributo.getValorTributo();
        }
        return total;
    }

}

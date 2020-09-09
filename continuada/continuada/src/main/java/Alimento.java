/* Classe Alimento - herdeira de Produto
   Essa classe deve implementar o método abstrato da interface Tributavel
 */

public class Alimento extends Produto {

    // Atributos
    private Integer calorias;

    // Construtor
    public Alimento(Integer codigo, String descricao, Double preco, Integer calorias) {
        super(codigo, descricao, preco);
        this.calorias = calorias;
    }

    // Métodos

    // Implementação do método abstrato getValorTributo()
    public Double getValorTributo() {
        return getPreco() * 0.15;
    }

    // Método toString()

    @Override
    public String toString() {
        return "Alimento{" +
                "calorias=" + calorias +
                ", imposto=" + String.format("R$ %.2f",getValorTributo()) +
                "} " + super.toString();
    }
}

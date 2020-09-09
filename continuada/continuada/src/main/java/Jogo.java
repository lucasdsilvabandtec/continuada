/* Classe Perfume - herdeira de Produto
   Essa classe deve implementar o método getValorTributo() - da interface
 */

public class Jogo extends Produto {

    // Atributo
    private String nome;
    private String genero;

    // Construtor
    public Perfume(Integer codigo, String  nome, Double preco, String genero) {
        super(codigo, preco);

    }

    // Métodos

    // Implementação do método abstrato getValorTributo()
    public Double getValorTributo() {
        return getPreco() * 0.27;
    }

    // Método toString()


    @Override
    public String toString() {
        return
    }
}

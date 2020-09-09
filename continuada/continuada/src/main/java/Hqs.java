

public class Hqs extends Produto {


    private String nome;
    private String autor;
    private String isbn;

    public Alimento(Integer codigo, String descricao, Double preco, Integer quantVitamina) {
        super(codigo, descricao, preco);
        this.calorias = calorias;
    }

    public Double getValorTributo() {
        return getPreco() * 0.15;
    }


    @Override
    public String toString() {
        return "nome{" +
                "autor=" + autor +
                ", imposto=" + String.format("R$ %.2f",getValorTributo()) +
                "} " + super.toString();
    }
}

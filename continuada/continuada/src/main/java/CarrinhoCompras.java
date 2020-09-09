public class TestaTributo {

    public static void main(String[] args) {

        // Criação de objetos das classes concretas
        Alimento combogod = new Alimento(123,"Comobo de hamburguer com direito a batatas e jogar qualuqer jogo durante a refeição",
                                       15.0,10);
                                    "amadeirado");
        Servico carregarJogos = new Servico("Carregar jogos durante a refeição",90.0);


        System.out.println(combogod);

        System.out.println(carregarJogos);

        Tributo trib = new Tributo();


        trib.adicionaTributavel(combogod);

        trib.adicionaTributavel(carregarJogos);


        trib.exibeTodos();

        System.out.println("Total de impostos: " +
                           String.format("R$ %.2f",trib.calculaTotalTributo()));

    }
}

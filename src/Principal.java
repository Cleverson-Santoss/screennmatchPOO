import br.com.alura.screenmatch.modelos.Filme;

public class Principal {
    public static void main(String[] args) {
        //Instanciando um objeto da Classe br.com.alura.screenmatch.modelos.Filme
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso Chefão");
        meuFilme.setAnoDeLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();
        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);
        System.out.println(meuFilme.pegaMedia());

        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
    }
}

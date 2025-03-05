public class Filme {
    /* Abstração: Ex: (Todo Filme tem) Abaixo são os atributos do filme */
    //Atributos:
    String nome;
    int anoDeLancamento;
    boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    int duracaoEmMinutos;

    //Metodo Acessor: Como o atributo está como Private, é criado um método para retornar o valor, mas sem poder altera-lo

    int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    //Método sem retorno

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //metodo sem retorno com argumentos

    void avalia(double nota){
        //está somando as avaliações cada vez que receber um valor
        somaDasAvaliacoes += nota;
        //Esta contanto o número de avaliações
        totalDeAvaliacoes++;
    }

    //Método com um retorno

    double  pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}

package br.com.alura.screenmatch.modelos;

public class Filme {
    /* Abstração: Ex: (Todo br.com.alura.screenmatch.modelos.Filme tem) Abaixo são os atributos do filme */
    //Atributos:
    private String nome;
    private int anoDeLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    //Metodo getter permite que seja lido o atributo privado
    public String getNome() {
        return nome;
    }

    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    //Metodo Acessor: Como o atributo está como Private, é criado um método para retornar o valor, mas sem poder altera-lo
    // Metodo Setter para permitir que seja alterado o atributo privado
    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }
    // O setter permite modificar o valor de forma controlada.
    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    //Método sem retorno

    public void exibeFichaTecnica(){
        System.out.println("Nome do br.com.alura.screenmatch.modelos.Filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);
    }

    //metodo sem retorno com argumentos

    public void avalia(double nota){
        //está somando as avaliações cada vez que receber um valor
        somaDasAvaliacoes += nota;
        //Esta contanto o número de avaliações
        totalDeAvaliacoes++;
    }

    //Método com um retorno

    public double  pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }
}

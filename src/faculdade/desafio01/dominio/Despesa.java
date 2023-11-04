package faculdade.desafio01.dominio;

public class Despesa {
    private String dia;
    private double valor;
    private String descricao;

    public Despesa(String dia, double valor, String descricao) {
        this.dia = dia;
        this.valor = valor;
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    // Método estático para calcular o total das despesas em uma lista de despesas

}




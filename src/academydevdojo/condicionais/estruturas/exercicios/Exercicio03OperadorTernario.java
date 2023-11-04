package academydevdojo.condicionais.estruturas.exercicios;

public class Exercicio03OperadorTernario {
    public static void main(String[] args) {
//doar se salario > 5000
        double salario = 6000.50;
        String mensagemDoar = "Eu vou doar 500 reais";
        String mensagemNaoDoar = "Eu não posso doar";
        String resultado = salario > 5000 ? mensagemDoar : mensagemNaoDoar;
//        String resultado = salario > 5000(condição) ? mensagemDoar(se for verdadeiro) : mensagemNaoDoar(se for falso);
        System.out.println(resultado);
    }
}

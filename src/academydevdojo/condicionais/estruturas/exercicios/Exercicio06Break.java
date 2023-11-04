package academydevdojo.condicionais.estruturas.exercicios;

public class Exercicio06Break {
    public static void main(String[] args) {
        //Dado o valor de um carro, descubra quantas parcelas ele pode ser parcelado
        //condição valor da parcela >= 1000
        double valorTotal = 30000;
        for (int parcela = 1; parcela <= valorTotal; parcela++) {
            double valorParcela = valorTotal / parcela;
            if (valorParcela < 1000) {
                break;
            }
                System.out.println("Parcela " + parcela + " R& " + valorParcela);


        }

    }
}


package academydevdojo.condicionais.estruturas.exercicios;

// Dados os valores de 1 a 7, imprima se é dia util ou fim de semana
// Considerando 1 como domingo
public class Exercicio04Switch {
    public static void main(String[] args) {
        byte dia = 2;
        switch (dia) {
//            case 1:
//                System.out.println("Domingo é fim de semana");
//                break;
//            case 2:
//                System.out.println("Segunda é dia util");
//                break;
//            case 3:
//                System.out.println("Terça é dia util");
//                break;
//            case 4:
//                System.out.println("Quarta é dia util");
//                break;
//            case 5:
//                System.out.println("Quinta é dia util");
//                break;
//            case 6:
//                System.out.println("Sexta é dia util");
//                break;
//            case 7:
//                System.out.println("Sabado é fim de semana");
//                break;
//            default:
//                System.out.println("Dia invalido");
//                break;
//          opção 2
            case 1:
            case 7:
                System.out.println("fim de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("dia util");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}

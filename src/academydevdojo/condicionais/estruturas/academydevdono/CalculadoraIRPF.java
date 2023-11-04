package academydevdojo.condicionais.estruturas.academydevdono;

public class CalculadoraIRPF {
    public static void main(String[] args) {
        double salario = 5000;
        if (salario <= 1903.98) {
            System.out.println("ISENTO");
        } else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("IRRF 7,5% = " + (salario * 0.075 - 142.80));
        } else if (salario >= 2826.65 && salario <= 3751.05) {
            System.out.println("IRRF 15% = " + (salario * 0.15 - 354.80));
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("IRRF 22,5% = " + (salario * 0.225 - 636.13));
        } else {
            System.out.println("IRRF 27,5% = " + (salario * 0.275));
        }

    }
}


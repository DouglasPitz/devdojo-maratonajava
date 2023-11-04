package academydevdojo.condicionais.estruturas.academydevdono;

public class CalculadoraImpostoDeRenda {
    public static void main(String[] args) {
        float salario = 4900F;
        float resultado = 0F;
        String porcentagem = "";
        if (salario > 4500){
            resultado = salario * 0.3F;
            porcentagem = "30%";
        }else {
            resultado = salario * 0.1F;
            porcentagem = "10%";
        }
        System.out.println("o valor final em porcetagem de "+porcentagem+" é de "+ resultado);
    }
}

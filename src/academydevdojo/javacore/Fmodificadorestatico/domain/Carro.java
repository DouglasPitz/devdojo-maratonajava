package academydevdojo.javacore.Fmodificadorestatico.domain;

public class Carro {
    private String nome;
    private double velocidadeMaxima;
    public static double velocidadeLimete = 250;

    public void imprime(){
        System.out.println("_______________");

        System.out.println("Nome "+this.nome);

        System.out.println("Velocidade Maxima "+this.velocidadeMaxima);

        System.out.println("Velocidade Limite "+ Carro.velocidadeLimete);

    }
public static void setVelocidadeLimete(double velocidadeLimete){
        Carro.velocidadeLimete = velocidadeLimete;
}
public  static double getVelocidadeLimete(){
        return Carro.velocidadeLimete;
}
    public Carro(String nome, double velocidadeMaxima) {
        this.nome = nome;
        this.velocidadeMaxima = velocidadeMaxima;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getVelocidadeMaxima() {
        return velocidadeMaxima;
    }

    public void setVelocidadeMaxima(double velocidadeMaxima) {
        this.velocidadeMaxima = velocidadeMaxima;
    }


}

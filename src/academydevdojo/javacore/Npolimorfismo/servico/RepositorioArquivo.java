package academydevdojo.javacore.Npolimorfismo.servico;

import academydevdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioArquivo implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar em um arquivo");
    }
}

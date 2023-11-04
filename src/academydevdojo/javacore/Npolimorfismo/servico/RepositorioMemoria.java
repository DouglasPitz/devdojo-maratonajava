package academydevdojo.javacore.Npolimorfismo.servico;

import academydevdojo.javacore.Npolimorfismo.repositorio.Repositorio;

public class RepositorioMemoria implements Repositorio {
    @Override
    public void salvar() {
        System.out.println("Salvar em memoria");
    }
}

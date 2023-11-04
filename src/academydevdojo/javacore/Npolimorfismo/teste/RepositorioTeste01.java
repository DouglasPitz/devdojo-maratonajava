package academydevdojo.javacore.Npolimorfismo.teste;

import academydevdojo.javacore.Npolimorfismo.repositorio.Repositorio;
import academydevdojo.javacore.Npolimorfismo.servico.RepositorioArquivo;
import academydevdojo.javacore.Npolimorfismo.servico.RepositorioBancoDeDados;
import academydevdojo.javacore.Npolimorfismo.servico.RepositorioMemoria;

import java.util.LinkedList;
import java.util.List;

public class RepositorioTeste01 {
    public static void main(String[] args) {
        Repositorio repositorio = new RepositorioMemoria();
        repositorio.salvar();
        List<String> list = new LinkedList<>();
        list.add("Goku");
        list.add("Vegeta");
        list.add("Kuririn");
        System.out.println(list);
    }
}

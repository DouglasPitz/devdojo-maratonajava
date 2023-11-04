package academydevdojo.javacore.Minterfaces.teste;

import academydevdojo.javacore.Minterfaces.dominio.DataLoader;
import academydevdojo.javacore.Minterfaces.dominio.DatabaseLoader;
import academydevdojo.javacore.Minterfaces.dominio.FileLoader;

public class DataLoaderTeste01 {
    public static void main(String[] args) {
        DatabaseLoader databaseLoader = new DatabaseLoader();
        FileLoader fileLoader = new FileLoader();
        databaseLoader.load();
        fileLoader.load();

        databaseLoader.remove();
        fileLoader.remove();
        databaseLoader.checkPermission();
        fileLoader.checkPermission();


    }
}

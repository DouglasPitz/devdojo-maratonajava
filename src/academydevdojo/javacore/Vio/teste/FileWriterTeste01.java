package academydevdojo.javacore.Vio.teste;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriterTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true)) {
            fw.write("O DevDojo é o melhor curso\nContinua a escrever\n");

            fw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

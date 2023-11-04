package academydevdojo.javacore.Vio.teste;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriteTeste01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file,true);
        BufferedWriter bw = new BufferedWriter(fw)) {
            bw.write("O DevDojo é o melhor curso");
            bw.newLine();
            bw.write("Continua a escrever");
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

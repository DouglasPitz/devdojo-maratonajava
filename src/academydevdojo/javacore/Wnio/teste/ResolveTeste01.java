package academydevdojo.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTeste01 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/william");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);

    }
}

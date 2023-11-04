package academydevdojo.javacore.Wnio.teste;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.PosixFileAttributes;

public class PosixFileAttributesTest01 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("/home/william/dev/file.txt");
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, PosixFileAttributes.class);
        System.out.println(basicFileAttributes);
    }
}

package academydevdojo.javacore.Wnio.teste;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTeste01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\dougl\\IdeaProjects\\logica\\file.txt");
        Path p2 = Paths.get("C:\\Users\\dougl\\IdeaProjects\\logica","file.txt");
        Path p3 = Paths.get("C:","Users\\dougl\\IdeaProjects\\logica","file.txt");
        Path p4 = Paths.get("C:\\Users\\dougl\\IdeaProjects\\logica\\file.txt");
        System.out.println(p1.getFileName());
        System.out.println();

    }

}


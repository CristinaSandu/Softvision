import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;


public class GroupA_c {

    //Sa se citeasca un fisier din folderul de resources si sa se afiseze numarul de linii si ultima linie.

    public static void main(String[] args) throws IOException {
        readResources();
        
    }

    public static void readResources() throws IOException {
        Path pathFile = Paths.get("src/main/resources/Story");
        long numberOfLines = Files.lines(pathFile).count();
        System.out.println("Number of lines: --> " + numberOfLines);
  //o metoda care sa preia textul de la linia din numberOfLines.
        }

        
    }


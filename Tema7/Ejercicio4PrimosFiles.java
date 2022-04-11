import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ejercicio4PrimosFiles {
    public static void main(String[] args) throws FileNotFoundException {
        int contador = 0;
        PrintStream o = new PrintStream(new File("/home/INFORMATICA/alu11063022/Escriptori/Repositorios/DAWProgramacion/Tema7/primos.dat"));
        PrintStream console = System.out;

        for (int index = 1; index < 500; index++) {

            for (int i = 1; i < index; i++) {
                if (index % i == 0){
                    contador++;
                }
            }
            if (contador == 2){
                System.setOut(o);
                System.out.println(index+" es primo");
                contador = 0;
            }else{
                System.setOut(console);
                System.out.println(index+" no es primo");
                contador = 0;
            }
        }
    }
}

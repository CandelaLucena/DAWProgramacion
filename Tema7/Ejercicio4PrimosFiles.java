import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Ejercicio4PrimosFiles {
    public static void main(String[] args) throws FileNotFoundException {
        int contador = 1;
        int contadorNumeros = 1;
        PrintStream o = new PrintStream(new File("/home/INFORMATICA/alu11063022/Escriptori/Repositorios/DAWProgramacion/Tema7/primos.dat"));
        PrintStream console = System.out;

        do{
            for (int i = 2; i <= contadorNumeros; i++) {
                if( contadorNumeros%i == 0){
                    contador++;
                }
            }
    
            if (contador <= 2){
                System.setOut(o);
                System.out.println(contadorNumeros+" es primo");
                contador = 1;
            }else{
                System.setOut(console);
                System.out.println(contadorNumeros+" no es primo");
                contador = 1;
            }

            contadorNumeros++;
        }while(!(contadorNumeros == 500));
    }
}

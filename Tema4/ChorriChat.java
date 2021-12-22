import java.util.Scanner;

public class ChorriChat {
    public static void main(String[] args) {
        //Sin saludo: "Eres una persona maleducada" 1.      while(!hola !holi !buenos dias !buenas){
        //Saludo: "hola" "holi" "buenos dias" "buenas"          System.out.println("Eres una persona maleducada")
        //"Hola, soy Chorri tu asistente" 2.                }
        //Bucle: "Mmm, es un tema interesante" 3.           System.out.println("Hola, soy Chorri tu asistente")
        //       "No he entendido bien lo que dices"        while(chao ta luego adios bye){
        //       "Nooo hablooo tu idioma"                   }
        //Fin: "chao" "ta luego" "adios" "bye"
        //"Ha sido un placer, bebe" 4.

        Scanner scanner = new Scanner(System.in);

        String cadena1 = "vacio";

        String cadena2 = "hola";
        String cadena3 = "holi";
        String cadena4 = "buenos dias";
        String cadena5 = "buenas";

        String cadena6 = "vacio";

        String cadena7 = "chao";
        String cadena8 = "ta luego";
        String cadena9 = "adios";
        String cadena10 = "bye";

        boolean saludo = true;
        boolean despedida = true;
        double resultado;

        resultado = Math.random() * 10;

        System.out.println("Inicio de Chorri");
        while(saludo == true){
            cadena1 = scanner.nextLine().toLowerCase();
            if(cadena1.contains(cadena2)||cadena1.contains(cadena3)||cadena1.contains(cadena4)||cadena1.contains(cadena5)){
                saludo = false;
            }else{
                System.out.println("Chorri: Eres una persona maleducada");
            }
        }
        
        System.out.println("Chorri: Hola, soy Chorri tu asistente");

        while(despedida == true){
            cadena6 = scanner.nextLine().toLowerCase();
            if(cadena6.contains(cadena7)||cadena6.contains(cadena8)||cadena6.contains(cadena9)||cadena6.contains(cadena10)){
                despedida = false;
            }else{
                if(resultado >= 0 && resultado <= 3){
                    System.out.println("Chorri: Mmm, es un tema interesante");
                }else if(resultado > 3 && resultado <= 6){
                    System.out.println("Chorri: No he entendido bien lo que dices");
                }else if(resultado > 6 && resultado <= 10){
                    System.out.println("Chorri: Nooo hablooo tu idioma" );
                }
                resultado = Math.random() * 10;
            }
        }

        System.out.println("Chorri: Ha sido un placer, bebe");

        scanner.close();
        
    }
}

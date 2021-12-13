import java.util.Date;
//import java.time.Month;
import java.time.ZoneId;
import java.time.LocalDate;
import java.util.Scanner;

public class Edad {
    public static void main(String[] args) {
        int dia;
        int mes;
        int anno;
        int edad;
    
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese su fecha de nacimiento.");
        System.out.print("Dia: ");
        dia = scanner.nextInt();
        System.out.print("Mes: ");
        mes = scanner.nextInt();
        System.out.print("Anno: ");
        anno = scanner.nextInt();
        scanner.close();
        
        dia = dia-mes;

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int year  = localDate.getYear();
        //int month = localDate.getMonthValue();
        //int day   = localDate.getDayOfMonth();
        
        edad = year - anno;

        System.out.print("Usted tiene "+edad+" annos");
    }
}

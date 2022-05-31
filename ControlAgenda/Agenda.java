package ControlAgenda;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;


public class Agenda {


    public static void Añadir() throws IOException{

        Scanner lector=new Scanner(System.in);
        System.out.println("Dame un nombre");
        String nombre=lector.nextLine();
        System.out.println("Dame un apellido");
        String apellido=lector.nextLine();
        System.out.println("Dame un email");
        String email=lector.nextLine();
        System.out.println("Dame un telefonp");
        String telefono=lector.nextLine();
        
        FileWriter writer= new FileWriter("./agenda.dat");      
        BufferedWriter bWriter = new BufferedWriter(writer);
        String resultado=nombre+"   "+apellido+"    "+email+"   "+telefono;
        bWriter.write(resultado);
        bWriter.flush();
        bWriter.close();
        writer.close();
        


       
        ObjectOutputStream objetosEscritor = new ObjectOutputStream(new FileOutputStream("./AgendaObjeto.dat",true));
        objetosEscritor.writeObject(new Persona(nombre, apellido, email, telefono));
        objetosEscritor.close();

        
    }

    public static void leerTexto() throws IOException{

        FileReader reader = new FileReader("./agenda.dat");
        BufferedReader breader = new BufferedReader(reader);

        String linea= breader.readLine();
        while(linea != null){
            System.out.println(linea);
        }
        breader.close();
        reader.close();
    }
     
    public static void leerObjeto() throws FileNotFoundException, IOException, ClassNotFoundException{

        ObjectInputStream leerObjeto=new ObjectInputStream(new FileInputStream("./AgendaObjeto.dat"));
        Persona npc;
        try {
            while(true){       
                npc=(Persona)leerObjeto.readObject();        
                System.out.println(npc.getNombreP()+"   "+npc.getApellidoP()+"  "+npc.getTelefonoP()+"  "+npc.getEmailP());
                System.out.println();
            }
        } catch (Exception e) {
            //TODO: handle exception
            e.printStackTrace();
        }
        leerObjeto.close();
    }
}

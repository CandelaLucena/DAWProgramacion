import java.util.Scanner;	
public class Multiplicacion 
{

	public static void main(String[] args) 
	{	
		Scanner sc = new Scanner(System.in);
		int x, y, z;
		System.out.println("Escriba dos numeros");

			x = sc.nextInt ();
			y = sc.nextInt ();
			z = x*y;

			if (z>=10)
				System.out.println(z +", es mayor que 10");
			else
				System.out.println(z +", no es mayor que 10");
				
			sc.close();
			
		}
	}


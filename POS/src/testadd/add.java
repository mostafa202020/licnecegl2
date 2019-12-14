package testadd;
import java.util.Scanner;
import  java.util.stream.*;
public class add  {
	
	public static int suma(int n) throws except {
		if (n < 0) throw new except("Este método no permite "
		+ "números menores que 0");
		if (n == 0) return 0;
		else return n + suma(n - 1);
		}
	//--------------------------
	public static void main (String [] args)  throws except{
		
		System.out.println(suma(-10000));
		
		
		
		
		
		
	 
	
	}

}

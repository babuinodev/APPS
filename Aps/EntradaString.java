package Aps;
import java.util.Scanner;

public class EntradaString {
	
	    public static void main(String[] args){
	        Scanner in = new Scanner(System.in);
	        System.out.println("Entre com uma frase:");
	        String frase = in.nextLine();
	        System.out.println("A frase entrada foi: \"" + frase + "\"");

	    }
}

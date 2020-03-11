import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		Scanner leTeclado = new Scanner(System.in);
		
		
		String nome = leTeclado.next();
		System.out.println("Hello" + nome + " world!");
	}
}

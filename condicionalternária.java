import java.util.Scanner;

public class condicionalternária {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		
		double preco = 40.0;
		double desconto = (preco < 20.0) ? preco * 0.1 : preco * 0.05;

		System.out.println(desconto);
		
		sc.close();
	}

}

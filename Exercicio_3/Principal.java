import java.util.Scanner;

public class Principal {
			
	public static void main(String[] args) {
		
		Descobrir desc = new Descobrir();
			
		System.out.println("Adivinhe um numero: ");
		Scanner entrada = new Scanner(System.in);
		int n1 = entrada.nextInt();
		
		while(n1 != desc.valor_rand) {
			
			desc.verif_rand(n1);
			
		    entrada = new Scanner(System.in);
			n1 = entrada.nextInt();
			
		}
		System.out.println("Parabens! Voce ganhou :))");
	
		
	}

}

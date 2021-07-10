import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {

		Principal ex = new Principal();
		
		System.out.println("Insira uma valor:");
		Scanner entrada = new Scanner(System.in);
		
		float n1 = entrada.nextFloat();
		
		System.out.println("Valor absoluto: " + ex.absolute(n1));
		System.out.println("Valor arredondado para cima: "+ ex.ceil(n1));
		System.out.println("Cosseno: " + ex.cosseno(n1));
		System.out.println("Exponencial? " + ex.exponencial(n1));
		System.out.println("Valor arredondado para baixo: " + ex.floor(n1));
		System.out.println("Log: " + ex.log(n1));
		System.out.println("Maior valor: " + ex.maximo(n1));
		System.out.println("Menor valor: " + ex.minimo(n1));
		System.out.println("Potencial: "+ ex.potencial(n1, 2));
		System.out.println("Raiz: "+ ex.raiz(n1));
	}
	
	public float absolute(float var) {
		return Math.abs(var);
	}
	
	public float ceil(float var) {;
		return (float) Math.ceil(var);
	}
	
	public float cosseno(float var) {
		return (float) Math.cos(var);
	}
	
	public float exponencial(float var) {;
		return (float) Math.exp(var);
	}
	
	public float floor(float var) {;
		return (float) Math.floor(var);
	}
	
	public float log(float var) {;
		return (float) Math.log(var);
	}
	
	public float maximo(float var) {;
		return (float) Math.max(var, 10.5);
	}
	
	public float minimo(float var) {;
		return (float) Math.min(var, 10.5);
	}
	
	public float potencial(float var, float p) {;
		return (float) Math.pow(var, p);
	}
	
	public float raiz(float var) {;
		return (float) Math.sqrt(var);
	}
	
}


public class Alunos {

	public double[][] alunos = new double[4][4];
	
	public Alunos() {
		this.gerar();
	}
	
	public void gerar() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				this.alunos[i][j] = (Math.random()*10);
			}
		}
	}

	public void menor() {
		
		double menor = this.alunos[0][0];
		int menor_al = 0;
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(this.alunos[i][j] < menor) {
					menor = this.alunos[i][j];
					menor_al = i;
				}
			}
		}
		
		System.out.println("A menor nota é " + menor + "do aluno: " + menor_al);
	}

	public void maior() {
		double maior = this.alunos[0][0];
		int maior_al = 0;
		
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				if(this.alunos[i][j] > maior) {
					maior = this.alunos[i][j];
					maior_al = i;
				}
			}
		}
		
		System.out.println("A maior nota é " + maior + " do aluno: " + maior_al);
	}

	public void media() {
		double media = 0;
		
		for(int i = 0; i < 4; i++) {
			media = 0;
			
			for(int j = 0; j < 4; j++) {
				media += this.alunos[i][j];
			}
			media = media / 4;
			
			System.out.println("Média aluno " + i + " é: " + media);
		}
	}
	
	public void mostrar() {
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(alunos[i][j] + " ");
			}
			System.out.println();
		}
	}

}

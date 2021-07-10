
public class Principal {

	public static void main(String[] args) {
		
		Cliente[] cl;
		
		cl = new Cliente[3];
		
		cl[0] = new Cliente();
		cl[1] = new Cliente();
		cl[2] = new Cliente();
		
		String[] nomes = {"Rodrigo", "Enzo", "Marina"};	
		
		for(int i = 0; i < 3; i++) {
			cl[i].setNome(nomes[i]);
			cl[i].setDataNascimento((int)(Math.random()*31), (int)(Math.random()*12), (int)(1950 + Math.random()* 71));
		}
		
		System.out.println(cl[2].nome);
		System.out.println(cl[2].dataNascimento.toString());
		
		cl[0] = null;
		cl[1] = null;
		cl[2] = null;
		
		System.gc();

	}

}

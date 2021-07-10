
public class Principal {

	public static void main(String[] args) {
		
		Fila[] fl;
		
		fl = new Fila[5];
		
		fl[0] = new Fila();
		fl[1] = new Fila();
		fl[2] = new Fila();
		fl[3] = new Fila();
		fl[4] = new Fila();
		
		String[] nomes = {"Lucar", "Gabi", "Rodrigo", "Enzo", "Marina"};
		for(int i = 0; i < 5; i++) {
			fl[i].setNome(nomes[i]);
		}
		
		System.out.println(fl[2].nome);
		
		fl[0] = null;
		fl[1] = null;
		fl[2] = null;
		fl[3] = null;
		fl[4] = null;
		
		System.gc();
	}

}

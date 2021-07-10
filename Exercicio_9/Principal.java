
public class Principal {

	public Supermercado spm;
	
	public Principal() {
		this.spm = new Supermercado();
	}
	
	public static void main(String[] args) {
		
		Principal pr = new Principal();
		pr.spm.setNome("Atacadão");
		
		String[] nomes = {"Lucar", "Gabi", "Rodrigo", "Enzo", "Marina"};
		for(int i = 0; i < 5; i++) {
			pr.spm.cl[i].setNome(nomes[i]);
		}
		
		System.out.println(pr.spm.getNome());
		System.out.println(pr.spm.cl[2].getNome());
	}
}

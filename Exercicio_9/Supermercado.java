
public class Supermercado {

	public String nome;
	public Cliente[] cl;
	
	public Supermercado() {
		
		cl = new Cliente[5];
		
		cl[0] = new Cliente();
		cl[1] = new Cliente();
		cl[2] = new Cliente();
		cl[3] = new Cliente();
		cl[4] = new Cliente();
		
	}
	
	public void setNome(String var) {
		this.nome = var;
	}
	
	public String getNome() {
		return this.nome;
	}
	
}

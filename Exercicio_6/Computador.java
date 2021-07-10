
public class Computador {
	public String nome;
	public String marca;

	public Data dt;
	
	public Computador() {
		this.dt = new Data();
	}
	
	public Computador setNome(String var) {
		this.nome = var;
		
		return this;
	}

	public Computador setMarca(String var) {
		this.marca = var;
		
		return this;
	}
	
	public Computador setData(int h, int m, int s) {
		this.dt.setHora(h, m, s);
		return this;
	}
	
}

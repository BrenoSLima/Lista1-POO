
public class Cliente {
	
	public String nome;
	public int rand_num;
	
	public Cliente() {
		this.rand_num = (int)(Math.random()*5000);
	}
	
	public String getNome() {
		return this.nome;
	}
	
	public void setNome(String var) {
		this.nome = var;
	}
	
}

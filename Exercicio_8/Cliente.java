
public class Cliente {
	public String nome;
	public Data dataNascimento;
	
	public Cliente() {
		this.dataNascimento = new Data(0,0,0);
	}
	
	public void setNome(String var) {
		this.nome = var;
	}
	
	public void setDataNascimento(int d, int m, int a) {
		this.dataNascimento.setData(d, m, a);
	}
}

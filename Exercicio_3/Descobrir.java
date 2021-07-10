public class Descobrir {
	
	public int valor_rand;
	
	public Descobrir() {
		this.valor_rand = this.gerar_rand();
	}
	
	public int gerar_rand() {
		return (int)(Math.random()*10);
	}
	
	public int verif_rand(int var) {
		if(var == this.valor_rand) {
			return 0;
		}else if(var > this.valor_rand){
			System.out.println("Mais baixo...");
			return -1;
		}else{
			System.out.println("Mais alto...");
			return 1;
		}
	}
}


public class Data {
	
	private int hora;
	private int minuto;
	private int segundo;
	
	public Data() {
		setHora(0,0,0);
	}
	
	public void setHora(int h, int m, int s){
		
		this.hora = ((h>=0 && h<24) ? h:0 );
		this.minuto = ((m>=0 && m<=59) ? m:0 );
		this.segundo = ((s>=0 && s<=59) ? s:0 );
		
	}
}

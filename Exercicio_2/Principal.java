import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		String f1="", f2="", f3="";
		int n1=0, n2=0, operacao;
		
		f1 = JOptionPane.showInputDialog("Entre o primeiro número: ");
		f2 = JOptionPane.showInputDialog("Entre o segundo número: ");
		f3 = JOptionPane.showInputDialog("Qual operação realizar: \n"
				+ "1 - Soma\n"
				+ "2 - Subtração\n"
				+ "3 - Divisão\n"
				+ "4 - Multplicação\n");
		
		n1 = Integer.parseInt(f1);
		n2 = Integer.parseInt(f2);
		operacao =  Integer.parseInt(f3);
		
		Operacao op = new Operacao();
		
		if(operacao == 1) {
			op.resultado = op.somar(n1, n2);
		} else if (operacao == 2) {
			op.resultado = op.subtracao(n1, n2);
		} else if (operacao == 3) {
			op.resultado = op.divisao(n1, n2);
		} else if (operacao == 4) {
			op.resultado = op.multiplicacao(n1, n2);	
		} else {
			op.resultado = -1;
		}
	
		JOptionPane.showMessageDialog(null, op.resultado,
				"Resultado", JOptionPane.INFORMATION_MESSAGE);
	}

}

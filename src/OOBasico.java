import javax.swing.JOptionPane;

public class OOBasico {

	public static void main(String[] args) {
		Conta c1 = new Conta("alan",2222,1000);
		Conta c2 = new Conta("parsa",2422,1000);
		Conta c3 = new Conta("fab",2322,1000);
		
		JOptionPane.showMessageDialog(null, c1.dataAbertura);
//		c1.transfere(c2, 500);
//		c1.saque(1000);
//		JOptionPane.showMessageDialog(null, c1);
//		JOptionPane.showMessageDialog(null, c2);
//		c3.deposita(900);
//		c3.saque(400);
		JOptionPane.showMessageDialog(null, Conta.getTotalDeContas());
		JOptionPane.showMessageDialog(null, c2.getIndicadorConta());
	}

}

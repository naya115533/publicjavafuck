import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Exam5 {

	public static void main(String[] args) {
		String a;
		int b;
		float c;
		
		a=JOptionPane.showInputDialog("�̸�");
		b=Integer.parseInt(JOptionPane.showInputDialog("����"));
		c=Float.parseFloat(JOptionPane.showInputDialog("Ű"));
		
		JOptionPane.showMessageDialog(null,a+"" +(a + b + c));
	}

}

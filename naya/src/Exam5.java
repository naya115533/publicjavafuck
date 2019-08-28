import java.awt.JobAttributes;

import javax.swing.JOptionPane;

public class Exam5 {

	public static void main(String[] args) {
		String a;
		int b;
		float c;
		
		a=JOptionPane.showInputDialog("이름");
		b=Integer.parseInt(JOptionPane.showInputDialog("나이"));
		c=Float.parseFloat(JOptionPane.showInputDialog("키"));
		
		JOptionPane.showMessageDialog(null,a+"" +(a + b + c));
	}

}

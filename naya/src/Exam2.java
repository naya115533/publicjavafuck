import javax.swing.JOptionPane;

public class Exam2 {

	public static void main(String[] args) {
		int a,b;
		a=Integer.parseInt(JOptionPane.showInputDialog("��1"));
		b=Integer.parseInt(JOptionPane.showInputDialog("��2"));
		JOptionPane.showMessageDialog(null, "��="+(a+b));
		
	}	

}

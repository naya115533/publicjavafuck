import javax.swing.*;

public class gui extends JFrame {
        gui(){
            System.out.println("기본생성자");
            setTitle("메모장");
            setSize(300,400);
            setVisible(true);
        }
    public static void main(String[] args) {
        new gui();
    }
}

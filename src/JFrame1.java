import javax.swing.JFrame;
public class JFrame1 extends JFrame {

    public JFrame1(){

        setTitle("GUI Chapter");
        setSize(400,400);
        setLocation(600,250);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }

    public static void main(String[] args) {

        JFrame1 window = new JFrame1();


    }
}
import javax.swing.JFrame;
public class JFrame1 extends JFrame {

    public JFrame1(){

        setTitle("GUI Chapter"); // set title of jframe
        setSize(400,400); // set size of jframe
        setLocation(600,250); //set location of where will jframe will be
        setVisible(true); // show jframe on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default behavior of exiting jframe

    }

    public static void main(String[] args) {

        JFrame1 window = new JFrame1();


    }
}
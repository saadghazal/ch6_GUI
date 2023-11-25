import javax.swing.JFrame;
public class Main {
    public static void main(String[] args) {

        // First Impression on JFrame class
        JFrame window = new JFrame();
        window.setTitle("GUI Chapter");
        window.setSize(400,400);
        window.setLocation(600,250);
        window.setVisible(true);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
}
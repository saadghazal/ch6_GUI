import javax.swing.*;
import java.awt.*;

public class JFrame1 extends JFrame {

    public JFrame1(){

        setTitle("GUI Chapter"); // set title of jframe
        setSize(400,400); // set size of jframe
        setLocation(600,250); //set location of where will jframe will be
        setVisible(true); // show jframe on screen
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // default behavior of exiting jframe
        Container jFrameContent = getContentPane(); // getting the empty container
        jFrameContent.setLayout(new GridLayout(5,2)); // setting gridlayout with 5 rows and 2 columns
        JLabel label1 = new JLabel("Your Name"); // creating JLabel Object with title Your Name
        jFrameContent.add(label1);// adding JLabel object that we created to the container

        setContentPane(jFrameContent); // setting the new modification to the JFrame Container
    }

    public static void main(String[] args) {

        JFrame1 window = new JFrame1();


    }
}
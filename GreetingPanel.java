import javax.swing.*;
/**
 * The greeting panel class displays a greeeting iin a panel
 */

public class GreetingPanel extends JPanel {
    private JLabel greeting;

    /**
     * Constructor
     */

     public GreetingPanel() {
         greeting = new JLabel("Welcome to Smoothie Paradise");

         add(greeting);
     }
}
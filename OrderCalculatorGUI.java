import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

/**
 * The OrderCalculatorGui class creates the GUI got the
 * Smoothie Paradise application
 */

public class OrderCalculatorGUI extends JFrame {
    private GreetingPanel greeting;
    private SmoothieSizePanel sizePanel;
    private LiquidPanel liquidPanel;
    private FruitAndVegPanel fruitAndVegPanel;
    private JPanel buttonPanel;
    private JButton calcButton;
    private JButton exitButton;
    private final double TAX_RATE = 0.07;

    /**
     * Constructor
     */

     public OrderCalculatorGUI() {

         setTitle("Order Calculator");

         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

         setLayout(new BorderLayout());

         greeting = new GreetingPanel();
         sizePanel = new SmoothieSizePanel();
         liquidPanel = new LiquidPanel();
         fruitAndVegPanel = new FruitAndVegPanel();

         buildButtonPanel();

         add(greeting, BorderLayout.NORTH);
         add(sizePanel, BorderLayout.WEST);
         add(liquidPanel, BorderLayout.CENTER);
         add(fruitAndVegPanel, BorderLayout.EAST);
         add(buttonPanel, BorderLayout.SOUTH);

         pack();
         setVisible(true);
     }
     /**
      * The buildButtonPanel method builds the button panel
      */

      private void buildButtonPanel() {
          buttonPanel = new JPanel();

          calcButton = new JButton("Calculate");
          exitButton = new JButton("Exit");

          calcButton.addActionListener(new CalcButtonListener());
          exitButton.addActionListener(new ExitButtonListener());

          buttonPanel.add(calcButton);
          buttonPanel.add(exitButton);
      }

      /**
       * Private inner class that handels the event when the user clicks the calclate button
       */

       private class CalcButtonListener implements ActionListener{
           public void actionPerformed(ActionEvent e) {
               double subtotal;
               double tax;
               double total;

               subtotal = sizePanel.getSmoothieCost() + 
                          liquidPanel.getLiquidCost() +
                          fruitAndVegPanel.getFruitAndVegCost();

                tax = subtotal * TAX_RATE;

                total = subtotal + tax;

                JOptionPane.showMessageDialog(null, String.format("Subtotal: $%,.2f\n" +
                                              "Tax: $%,.2f\n" +
                                              "Total: $%,.2f", subtotal, tax, total));
           }
       }

       /**
        * private inner class that handles the event when the user clicks the Exit button
        */

        private class ExitButtonListener implements ActionListener {
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        }

        /**
         * main method
         */

         public static void main(String[] args) {
            
             new OrderCalculatorGUI();
         }
}

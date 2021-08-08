import javax.swing.JPanel;

import javax.swing.*;
import java.awt.*;

public class FruitAndVegPanel extends JPanel {

    public final double SPINACH = 0.50;
    public final double KALE = 0.75;

    private JCheckBox banana;
    private JCheckBox strawberries;
    private JCheckBox blueberries;
    private JCheckBox blackberries;
    private JCheckBox rasphberries;
    private JCheckBox mango;
    private JCheckBox apple;
    private JCheckBox peach;
    private JCheckBox spinach;
    private JCheckBox kale;

    /**
     * Constructor
     */

     public FruitAndVegPanel() {
         setLayout(new GridLayout(5,2));

         banana = new JCheckBox("Banana");
         strawberries = new JCheckBox("Strawberry");
         blueberries = new JCheckBox("Blueberry");
         blackberries = new JCheckBox("Blackberry");
         rasphberries = new JCheckBox("Rasphberry");
         mango = new JCheckBox("Mango");
         apple = new JCheckBox("Apple");
         peach = new JCheckBox("Peach");
         spinach = new JCheckBox("Spinach");
         kale = new JCheckBox("Kale");

         setBorder(BorderFactory.createTitledBorder("Fruits and Vegetables"));

         add(banana);
         add(strawberries);
         add(blueberries);
         add(blackberries);
         add(rasphberries);
         add(mango);
         add(apple);
         add(peach);
         add(spinach);
         add(kale);
     }

     /**
      * getFruitAndVegCost method
      * @return The cost of selected vegetables
      */

      public double getFruitAndVegCost() {
          double fruitVegCost = 0.0;

          if (spinach.isSelected())
              fruitVegCost += SPINACH;
          if (kale.isSelected())
              fruitVegCost += KALE;

          return fruitVegCost;
      }
}

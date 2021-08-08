import javax.swing.*;
import java.awt.*;

/**
 * The LiquidPanel class allows the user to select the liquid 
 * they want for the smoothie
 */

public class LiquidPanel extends JPanel {
    public final double WHOLE = 0.0;
    public final double TWO_PERCENT_MILK = 0.25;
    public final double ALMOND_MILK = 0.75;
    public final double OAT_MILK = 1.00;
    public final double APPLE_JUICE = 0.25;
    public final double ORANGE_JUICE = 0.50;
    public final double POMEGRANATE_JUICE = 0.75;

    private ButtonGroup buttonGroup;
    private JRadioButton wholeMilkButton;
    private JRadioButton twoPercentMilkButton;
    private JRadioButton almondMilkButton;
    private JRadioButton oatMilkButton;
    private JRadioButton appleJuiceButton;
    private JRadioButton orangeJuiceButton;
    private JRadioButton pomegranateJuiceButton;

    /**
     * Constructor
     */

     public LiquidPanel() {
         setLayout(new GridLayout(2, 4));
         
         buttonGroup = new ButtonGroup();
         buttonGroup.add(wholeMilkButton);
         buttonGroup.add(twoPercentMilkButton);
         buttonGroup.add(almondMilkButton);
         buttonGroup.add(oatMilkButton);
         buttonGroup.add(appleJuiceButton);
         buttonGroup.add(orangeJuiceButton);
         buttonGroup.add(pomegranateJuiceButton);

         wholeMilkButton = new JRadioButton("Whole");
         twoPercentMilkButton = new JRadioButton("2%");
         almondMilkButton = new JRadioButton("Almond");
         oatMilkButton = new JRadioButton("Oat");

         appleJuiceButton = new JRadioButton("Apple");
         orangeJuiceButton = new JRadioButton("Orange");
         pomegranateJuiceButton = new JRadioButton("Pomegranate");

         setBorder(BorderFactory.createTitledBorder("Liquid"));

         add(wholeMilkButton);
         add(twoPercentMilkButton);
         add(almondMilkButton);
         add(oatMilkButton);
         add(appleJuiceButton);
         add(orangeJuiceButton);
         add(pomegranateJuiceButton);
     }

     /**
      * getLiquidCost method
      * @return The cost of the selected liquid
      */

      public double getLiquidCost() {
          double liquidCost = 0.0;

          if (wholeMilkButton.isSelected()) {
              liquidCost = WHOLE;
              System.out.println("Whole");
          } else if (twoPercentMilkButton.isSelected()) {
              liquidCost = TWO_PERCENT_MILK;
          } else if (almondMilkButton.isSelected()) {
              liquidCost = ALMOND_MILK;
          } else if (oatMilkButton.isSelected()) {
              liquidCost = OAT_MILK;
          } else if (appleJuiceButton.isSelected()) {
              liquidCost = APPLE_JUICE;
          } else if (orangeJuiceButton.isSelected()) {
              liquidCost = ORANGE_JUICE;
          } else if (pomegranateJuiceButton.isSelected()) {
              liquidCost =POMEGRANATE_JUICE;
          }
          return liquidCost;
      }
}

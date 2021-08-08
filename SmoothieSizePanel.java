import javax.swing.*;
import java.awt.*;

/**
 * The SmoothieSizeClass allows the user the select the size smoothie they want
 */

public class SmoothieSizePanel extends JPanel {
    public final double TWELVE_OUNCE = 4.25;
    public final double SIXTEEN_OUNCE = 6.75;
    public final double TWENTY_OUNCE = 8.50;

    private JRadioButton twelveOunce;
    private JRadioButton sixteenOunce;
    private JRadioButton twentyOunce;
    private ButtonGroup buttonGroup;

    /**
     * Constructor
     */

     public SmoothieSizePanel() {
         setLayout(new GridLayout(3,1));

         twelveOunce = new JRadioButton("12 oz", true);
         sixteenOunce = new JRadioButton("16 oz");
         twentyOunce = new JRadioButton("20 oz");

         buttonGroup = new ButtonGroup();
         buttonGroup.add(twelveOunce);
         buttonGroup.add(sixteenOunce);
         buttonGroup.add(twentyOunce);

         setBorder(BorderFactory.createTitledBorder("Size"));

         add(twelveOunce);
         add(sixteenOunce);
         add(twentyOunce);
     }
     /**
      * getSmoothieCost method
      * @return The cost of the smoothie
      */

      public double getSmoothieCost() {
          double smoothieCost = 0.0;

          if (twelveOunce.isSelected()) {
              smoothieCost = TWELVE_OUNCE;
              System.out.println("12");
          } else if (sixteenOunce.isSelected()) {
              smoothieCost = SIXTEEN_OUNCE;
              System.out.println("16");
          } else if (twentyOunce.isSelected()) {
              smoothieCost = TWENTY_OUNCE;
              System.out.println("20");
          }

          return smoothieCost;
      }
    
}

import javax.swing.*;
import java.awt.Font;

public class ProblemSet1_3 {
    public static void main(String[] args) {
        JTextArea textArea = new JTextArea(7,45);
        textArea.setFont(new Font("monospaced", Font.PLAIN, 12));
        textArea.setText(" Quotation for ");

        String name = getName();
        textArea.append(name + "\n");

        float length = getLength();
        float breadth = getBreadth();
        float area = getArea(length,breadth);
        float costMetre = getCostMetre();
        float totalCost = getTotalCost(costMetre, area);
        textArea.append(String.format(" %-30s%.2f m.\n %-30s%.2f m.\n %-30s%.2f sq. m.\n %-30s%.2f euro\n %-30s%.2f euro\n"
        , "Length of room: ", length, "Breadth of room: ", breadth, "Total Area of Room: ", area, "Cost per sq. m of carpet: ", costMetre
        , "Total cost of carpet: ", totalCost));

        JOptionPane.showMessageDialog(null, textArea, "Quote", JOptionPane.PLAIN_MESSAGE);
    }

    private static String getName() {
        return JOptionPane.showInputDialog("Please enter your name: ");
    }

    private static float getLength()
    {
        return Float.parseFloat(JOptionPane.showInputDialog("Please enter the length of the room (in meters):"));
    }

    private static float getBreadth()
    {
        return Float.parseFloat(JOptionPane.showInputDialog("Please enter the breadth of the room (in meters):"));
    }

    private static float getArea(float l, float b)
    {
        return l*b;
    }

    private static float getCostMetre()
    {
        return Float.parseFloat(JOptionPane.showInputDialog("Please enter cost per square metre of carpet:"));
    }

    private static float getTotalCost(float c, float a)
    {
        return c*a;
    }
}

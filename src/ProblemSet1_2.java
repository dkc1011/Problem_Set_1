import javax.swing.*;
import java.awt.*;

public class ProblemSet1_2 {
    public static void main(String[] args) {
        int yards=1, inches=36;

        JTextArea jTA = new JTextArea(10,10);
        jTA.setFont(new Font("monospaced", Font.PLAIN, 12));

        jTA.setText("Yards    Inches\n-------- --------\n");

        for(int i=0; i<10; i++)
        {
            jTA.append(String.format("%-9d%-8d",yards,inches) + "\n");
            yards++;
            inches+=36;
        }

        JOptionPane.showMessageDialog(null,jTA,"Yards and Inches", JOptionPane.PLAIN_MESSAGE);
    }
}

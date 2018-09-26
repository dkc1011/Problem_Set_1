import jdk.nashorn.internal.scripts.JO;

import javax.swing.*;

public class ProblemSet1_7 {
    public static void main(String[] args) {
        int number = getNumber();

        while(number != -1){
            if(isEven(number)) {
                JOptionPane.showMessageDialog(null, number + " is even","Odd or Even", JOptionPane.INFORMATION_MESSAGE);
            }
            else
            {
                JOptionPane.showMessageDialog(null, number + " is odd","Odd or Even", JOptionPane.INFORMATION_MESSAGE);
            }
            number = getNumber();
        }

        System.exit(0);
    }

    private static int getNumber()
    {
        return Integer.parseInt(JOptionPane.showInputDialog("Please input an integer (-1 to exit): "));
    }
    private static boolean isEven(int n)
    {
        if(n%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
}

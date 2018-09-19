import javax.swing.*;

public class ProblemSet1_1 {
    public static void main(String[] args) {
        String exchangeRateStr = JOptionPane.showInputDialog("Please enter the exchange rate between GB£ and EUR today:");
        float exchangeRateFloat = Float.parseFloat(exchangeRateStr);
        float poundSterling = 1;

        while(poundSterling != 0) {
            poundSterling = getPounds();

            if(poundSterling != 0) {
                float euro = getEuro(poundSterling, exchangeRateFloat);

                displayResults(poundSterling, euro, exchangeRateStr);
            }
        }
    }

    private static float getPounds()
    {
        return Float.parseFloat(JOptionPane.showInputDialog("Please enter a number of GB£ :"));
    }

    private static float getEuro(float pS, float eR)
    {
        return pS * eR;
    }

    private static void displayResults(float pS, float eur, String eR)
    {
        JOptionPane.showMessageDialog(null,"£" + String.format("%.2f",pS) + " is equal to €" + String.format("%.2f",eur),"Exchange rate today: " + eR, JOptionPane.INFORMATION_MESSAGE);
    }
}

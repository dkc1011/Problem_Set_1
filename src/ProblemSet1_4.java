import javax.swing.*;

public class ProblemSet1_4 {
    public static void main(String[] args) {
        String name = getName();
        int nameLength = getNameLength(name);
        String nameUpperCase = nameToUpper(name);
        char firstInitial = getFirstInitial(name);
        String surname = getSurname(name);

        JOptionPane.showMessageDialog(null,"Name: " + nameUpperCase + "\nNumber of Characters: " + nameLength
                + "\nFirst name initial: " + firstInitial + "\nSurname: " + surname, "Name information!", JOptionPane.INFORMATION_MESSAGE);
    }

    private static String getName()
    {
        return JOptionPane.showInputDialog("Please enter your first, middle and surname:");
    }

    private static int getNameLength(String n)
    {
        return n.length();
    }

    private static String nameToUpper(String n)
    {
        return n.toUpperCase();
    }

    private static char getFirstInitial(String n)
    {
        return n.charAt(0);
    }

    private static String getSurname(String n) {
        String surname = new String(n);
        return surname.substring(surname.lastIndexOf(" ", 20) + 1);
    }
}

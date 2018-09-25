public class ProblemSet1_6 {
    public static void main(String[] args) {
        String header = String.format("%-12s%-4s\n%-12s%-4s","Number","Cube","------","----");
        String table="";
        for(int i=1; i<15; i++)
        {
            table += i;
            table += cube(i);
        }
        System.out.println(table);
    }

    private static int cube(int i)
    {
        return (i*i*i);
    }
}

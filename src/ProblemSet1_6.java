public class ProblemSet1_6 {
    public static void main(String[] args) {
        String header = String.format("%-12s%-4s\n%-12s%-4s","Number","Cube","------","----\n");
        String table="";

        System.out.print(header);
        for(int i=1; i<16; i++)
        {
            table = String.format("%-12d%-4d\n",i,cube(i));
            System.out.print(table);
        }
}

    private static int cube(int i)
    {
        return (i*i*i);
    }
}

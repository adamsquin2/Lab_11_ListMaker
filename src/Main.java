import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        Scanner console = new Scanner(system.in);
        ArrayList<String> list = new ArrayList<>();

        final String menu = "A - Add to List  D - Delete from List  P - Print the List  Q - Quit Program";
        boolean finish = false;
        string cmd = "";

        do {
            cmd = getRegExString(console, menu, "(AaDdPpQq)" );
            cmd = cmd.toUpperCase();
            switch(cmd)
            {
                case "A":
                    break;
                case "D":
                    break;
                case "P":
                    break;
                case "Q":
                    system.exit(0);
                    break;

            }




            System.out.println("cmd is " + cmd);

        }

        while(!finish);
    }
    private static void displaylist()
    {
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        if(list.size() != 0)
        for(int i = 0; i < list.size(); i++)
        {
            System.out.printf("%3d%35s", i+1, list.get(i) );
        }
        else
            System.out.println("+++++            List Is Empty             +++++");
        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
    }


}
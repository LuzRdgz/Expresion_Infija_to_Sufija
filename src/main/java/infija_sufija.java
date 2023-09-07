import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class infija_sufija {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String opr;

        while (true){
            System.out.println("------------------------------------");
            System.out.println("Ingresa la operacion INFIJA:");
            opr = scan.nextLine();

            if (opr.equals("quit")){
                break;
            }

            StringTokenizer token = new StringTokenizer(opr,"(){}[]+-*/", true);

        }



    }

}

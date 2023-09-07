import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class infija_sufija {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        Stack<String> pila = new Stack<>();
        String opr;

        while (true){
            System.out.println("------------------------------------");
            System.out.println("Ingresa la operacion INFIJA:");
            opr = scan.nextLine();

            if (opr.equals("quit")){
                break;
            }

            StringTokenizer token = new StringTokenizer(opr,"(){}[]+-*/", true);

            while (token.hasMoreTokens()){
                String toks = token.nextToken();
                switch (toks){
                    case "(":
                    case "[":
                    case "{":
                        pila.push(toks);
                        break;
                    case ")":
                    case "]":
                    case "}":
                        if (pila.isEmpty()){
                            System.out.println("ERROR EN LA EXPRESION");
                        }else{
                            pila.pop();
                        }
                        break;
                }

            }

        }



    }

}

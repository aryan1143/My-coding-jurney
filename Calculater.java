import java.net.SocketPermission;
import java.util.*;

import javax.annotation.processing.SupportedOptions;

public class Calculater {
    public void main(String[] args) {
        System.out.print("Number 1 : ");
        Scanner sc = new Scanner(System.in);
        int N1 = sc.nextInt();
        System.out.print("Number 2 : ");
        int N2 = sc.nextInt();
        System.out.print("What to do (eq. +, - )  : ");
        char  N0 = sc.next().charAt(0);

        switch (N0) {
            case '+' : System.out.println("The sum of Number 1 and Number 2 is : " + (N1 + N2));
                
                break;
        
            case '-' : System.out.println("The diffrence of Number 1 and Number 2 is : " + (N1 - N2));
                break;

            case '*' : System.out.println("The multiplication of Number 1 and Number 2 is : " + (N1 * N2));

                break;

            case '/' : System.out.println("The devision of Number 1 and Number 2 is : " + (N1 / N2));

                break;

            default : System.out.println("Invalid Number or mark of opration !  ");
        }
    }
}

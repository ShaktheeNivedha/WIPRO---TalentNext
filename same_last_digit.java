import java.util.*;
public class same_last_digit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        if (a > 0 && b > 0){
            a = a % 10;
            b = b % 10;
        }
        if (a == b){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}

import java.util.*;
public class NumberIsODDorEVEN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        String result= (num%2==0)? "Even":"Odd";
        System.out.println(result);
    }
}
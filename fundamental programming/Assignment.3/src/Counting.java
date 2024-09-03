import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 10, i=0;
        while (i<=number) {
            System.out.println(i+',');
            i++;
        }
        int m=number;
        System.out.println();
        while (m>=0) {
            System.out.println(m+',');
            m--;
        }
    }
}
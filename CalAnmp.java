import java.util.Scanner;
public class CalAnmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(),n = sc.nextInt(),p = sc.nextInt(),result;
        result = 1; a = a%p;
        for(int i = 1;i<=n;i++) {
            result = (result*a) % p;
        }
        System.out.println(result);
    }
}
import java.util.*;

public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        long sum = 0;
        for(int i=0;i<t;i++)
            sum += sc.nextLong();
        System.out.println(sum);
    }
}

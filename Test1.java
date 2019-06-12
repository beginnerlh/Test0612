package bishi0612;
//统计每个月兔子的总数
import java.util.Scanner;

public class Test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            int n = sc.nextInt();
            int sum = getCount(n);
            System.out.println(sum);
        }
    }


    public static int getCount(int n){
        if(n == 1 || n == 2){
            return 1;
        }
        return getCount(n-1)+getCount(n-2);
    }
}

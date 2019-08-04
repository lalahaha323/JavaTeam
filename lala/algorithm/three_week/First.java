import java.util.ArrayList;
import java.util.Scanner;

public class First {
    public static void main(String[] args) {
        ArrayList<Long> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        for(int i = 0;i < number; i++) {
            list.add(sc.nextLong());
        }
        for(int i = 0; i < list.size(); i++) {
            for(int j = 0; j < list.size() - 1; j++) {
                if(list.get(j) > list.get(j + 1)) {
                    long k = list.get(j);
                    list.set(j, list.get(j + 1));
                    list.set(j + 1, k);
                }
            }
        }
        long sum1 = list.get(list.size() - 1) * list.get(list.size() - 2) * list.get(list.size() - 3);
        long sum2 = list.get(0) * list.get(1) * list.get(list.size() - 1);
        if(sum1 > sum2) {
            System.out.println(sum1);
        } else {
            System.out.println(sum2);
        }
    }
}

import java.util.Scanner;

public class Sessions02_7 {
    public static void main(String[] args) {
        int numbers;
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập lượng số nguyên tố cần in ra :");
        numbers = sc.nextInt();


        int N = 0;
        boolean check;
        while (count < numbers) {
            check = true;
            N++;
            if (N <= 1) {
                check = false;
                //break;
            }
            for (int i = 2; i <= Math.sqrt(N); i++) {
                if (N % i == 0) {
                    check = false;
                    break;
                }
            }
            if (check) {
                System.out.println(N);
                count++;

            }
        }

    }
}






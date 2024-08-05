import java.util.Scanner;

public class Sessions02_2 {
    public static void main(String[] args) {
        int number;
        String message;

        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập vào số");
        number = sc.nextInt();

        if (number % 3 == 0 && number % 5 == 0) {
            message = " Chia hết cho cả 3 và 5";
        } else if (number % 3 == 0) {
            message = " Chia hết cho 3";
        } else if (number % 5 == 0) {
            message = " Chia hết cho 5";
        } else {
            message = " Không chia hết cho cả 3 và 5";
        }
        System.out.println("Số " + number + " là số : " + message);
        sc.close();
    }
}

import java.util.Scanner;

public class Sessions02_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double canh1, canh2, canh3;
        double chuVi, dienTich;
        boolean validTriangle = false;


        while (!validTriangle) {
            System.out.println("Nhập độ dài các cạnh của tam giác:");
            System.out.print("Cạnh thứ nhất: ");
            canh1 = sc.nextDouble();
            System.out.print("Cạnh thứ hai: ");
            canh2 = sc.nextDouble();
            System.out.print("Cạnh thứ ba: ");
            canh3 = sc.nextDouble();


            if (canh1 > 0 && canh2 > 0 && canh3 > 0 &&
                    canh1 + canh2 > canh3 &&
                    canh1 + canh3 > canh2 &&
                    canh2 + canh3 > canh1) {

                validTriangle = true;

                // Tính chu vi tam giác
                chuVi = canh1 + canh2 + canh3;

                // Tính diện tích tam giác theo công thức Heron
                double p = chuVi / 2;
                dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));

                // Hiển thị kết quả
                System.out.println("Tam giác có chu vi là: " + chuVi);
                System.out.println("Tam giác có diện tích là: " + dienTich);

            } else {
                System.out.println("Ba cạnh nhập vào không phải là độ dài của tam giác. Vui lòng nhập lại.");
            }
        }

        sc.close();
    }
}


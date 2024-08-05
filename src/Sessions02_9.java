import java.util.Scanner;

public class Sessions02_9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int choice = 0;

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Tính chu vi và diện tích hình chữ nhật");
            System.out.println("2. Tính chu vi và diện tích hình tam giác");
            System.out.println("3. Tính chu vi và diện tích hình tròn");
            System.out.println("4. Thoát");

            System.out.print("Nhập lựa chọn của bạn: ");
            choice = scanner.nextInt();
            if (choice==4){
                System.out.println("Thoát chương trình");
                break;
            }

            switch (choice) {
                case 1:
                    // Tính chu vi và diện tích hình chữ nhật
                    System.out.print("Nhập chiều dài của hình chữ nhật: ");
                    double chieuDai = scanner.nextDouble();
                    System.out.print("Nhập chiều rộng của hình chữ nhật: ");
                    double chieuRong = scanner.nextDouble();
                    double chuVi = 2 * (chieuDai + chieuRong);
                    double dienTich = chieuDai * chieuRong;
                    System.out.println("Chu vi của hình chữ nhật là: " + chuVi);
                    System.out.println("Diện tích của hình chữ nhật là: " + dienTich);
                    break;
                case 2:
                    // Tính chu vi và diện tích hình tam giác
                    System.out.print("Nhập độ dài cạnh thứ nhất của tam giác: ");
                    double canh1 = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh thứ hai của tam giác: ");
                    double canh2 = scanner.nextDouble();
                    System.out.print("Nhập độ dài cạnh thứ ba của tam giác: ");
                    double canh3 = scanner.nextDouble();
                    chuVi = canh1 + canh2 + canh3;
                    double p = chuVi / 2; // nửa chu vi để tính diện tích theo công thức Heron
                    dienTich = Math.sqrt(p * (p - canh1) * (p - canh2) * (p - canh3));
                    System.out.println("Chu vi của tam giác là: " + chuVi);
                    System.out.println("Diện tích của tam giác là: " + dienTich);
                    break;
                case 3:
                    // Tính chu vi và diện tích hình tròn
                    System.out.print("Nhập bán kính của hình tròn: ");
                    double banKinh = scanner.nextDouble();
                    chuVi = 2 * Math.PI * banKinh;
                    dienTich = Math.PI * Math.pow(banKinh, 2);
                    System.out.println("Chu vi của hình tròn là: " + chuVi);
                    System.out.println("Diện tích của hình tròn là: " + dienTich);
                    break;

                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        }
        scanner.close();
    }
}
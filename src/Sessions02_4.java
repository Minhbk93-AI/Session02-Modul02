import java.util.Scanner;

public class Sessions02_4 {
    public static void main(String[] args) {
        float diemToan, diemLy, diemHoa, diemVan, diemTA, diemTBM;
        Scanner sc = new Scanner(System.in);
        System.out.println("Mời bạn nhập điểm Toán");
        diemToan = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm Lý");
        diemLy = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm Hóa");
        diemHoa = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm Văn");
        diemVan = sc.nextFloat();
        System.out.println("Mời bạn nhập điểm TA");
        diemTA = sc.nextFloat();

        diemTBM = (diemToan + diemLy + diemHoa + diemTA + diemVan) / 5;
        if (diemTBM >= 0 && diemTBM < 5) {
            System.out.println("Xếp loại Yếu");

        } else if (diemTBM >= 5 && diemTBM < 6.5) {
            System.out.println("Xếp loại Trung Bình");

        } else if (diemTBM >= 6.5 && diemTBM < 8) {
            System.out.println("Xếp loại khá");
        } else if (diemTBM >= 8 && diemTBM < 9) {
            System.out.println("Xếp loại giỏi");

        } else {
            System.out.println("Xếp loại xuất sắc");
        }
    }


    }



import java.util.Scanner;

public class Sessions02_8 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice = 0;

        while (true) {
            System.out.print("Enter your choice: ");
                choice = sc.nextInt();

                if (choice==4){
                    System.out.println("Xin chào tôi thoát chương trình");
                    break;
                }

                switch (choice) {
                    case 1:
                        System.out.print("Enter a number to check: ");
                        int number = sc.nextInt();

                        if (number % 2 == 0) {
                            System.out.println(number + " is even.");
                        } else {
                            System.out.println(number + " is odd.");
                        }
                        break;
                    case 2:
                        System.out.print("Enter a numberCheck to check: ");
                        int numberCheck = sc.nextInt();

                        boolean isPrime = true;
                        if (numberCheck <= 1) {
                            isPrime = false;
                        } else {
                            for (int i = 2; i <= Math.sqrt(numberCheck); i++) {
                                if (numberCheck % i == 0) {
                                    isPrime = false;
                                    break;
                                }
                            }
                            if (isPrime){
                            System.out.println(numberCheck);}
                        }
                            break;
                            case 3:
                                System.out.print("Enter a numberDivisible to check: ");
                                int numberDivisible = sc.nextInt();

                                if (numberDivisible % 3 == 0) {
                                    System.out.println(numberDivisible + " is divisible by 3.");
                                } else {
                                    System.out.println(numberDivisible + " is not divisible by 3.");
                                }

                        break;

                    default:
                        System.out.println("Invalid choice. Please enter a number from 1 to 4.");
                        break;
                }


            }
        }


    }


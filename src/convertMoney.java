import java.util.Scanner;
public class convertMoney {
    public static void main(String[] args) {
        System.out.println("Mời bạn nhập số tiền Dolor cần chuyển đổi: ");
        Scanner scanner = new Scanner(System.in);
        int Money = scanner.nextInt();
        System.out.println( Money +" Dolor bẳng " + Money*2300 +" VND ");
    }
}

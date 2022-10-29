import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //  Задача D
        Scanner scanner = new Scanner(System.in);

        int numPeople = scanner.nextInt();
        int numApple = scanner.nextInt();

        ApllePeoplle(numApple, numPeople);
    }

    public static void ApllePeoplle(int a, int b){
        System.out.println(a % b);
    }
}
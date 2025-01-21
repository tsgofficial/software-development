

// Input
// Гурвалжны талууд бүхэл тоогоор нэг мөрөнд зайгаар тусгаарлагдан өгөгдөнө.
// Output
// Гурвалжны периметр.
// Example
// Input:
// 3 4 5
// Output:
// 12
import java.util.Scanner;

class Triangle {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the sides of the triangle separated by spaces:");

        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        int perimeter = side1 + side2 + side3;

        System.out.println("The perimeter of the triangle is: " + perimeter);
    }
}

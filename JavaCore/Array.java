package JavaCore;
import java.lang.*;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // Demo 1 - int twoDimArray[][] = {{1, 2}, {3, 4}};
        // for (int i = 0; i < twoDimArray.length; i++) {
        //     for (int j = 0; j < twoDimArray[i].length; j++) {
        //         System.out.printf("Element at position (%d, %d) is (%d)\n", i, j, twoDimArray[i][j]);
        //     }
        // }

        // Demo 2 - Input element for the 1-dim array
        // int Array[] = new int[10];
        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < Array.length; i++) {
        //     System.out.printf("Input the %d element for the array:", i);
        //     Array[i] = scanner.nextInt();
        // }
        // for (int i = 0; i < Array.length; i++) {
        //     System.out.printf("The %d element of the array is: %d\n", i, Array[i]);
        // }

        // Bai 2 - Input element for the 2-dim array
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of row: ");
        int row = scanner.nextInt();
        System.out.println("\nInput the number of column: ");
        int col = scanner.nextInt();
        int twoDimArray[][] = new int[row][col];
        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.printf("Input element (%d, %d) of the array: ", i, j);
                twoDimArray[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < twoDimArray.length; i++) {
            for (int j = 0; j < twoDimArray[i].length; j++) {
                System.out.printf(" %d ", twoDimArray[i][j]);
            }
            System.out.print("\n");
        }

        // Bai 1 - Viet chuong trinh nhap vao mot mang va in ra mot mang con gom cac so le
        // Scanner scanner = new Scanner(System.in);
        // System.out.println("Input the number of element in the array: ");
        // int num = scanner.nextInt();
        // int inputArray[] = new int[num];
        // for (int i = 0; i < inputArray.length; i++) {
        //     System.out.printf("Input the value of %d element: ", i);
        //     inputArray[i] = scanner.nextInt();
        //     System.out.println("\n");
        // }
        // int count = 0;
        // for (int i = 0; i < inputArray.length; i++) {
        //     if (inputArray[i] % 2 != 0) {
        //         System.out.printf("\nOdd number: %d", inputArray[i]);
        //         count += 1;
        //     }
        // }
        // if (count == 0) {
        //     System.out.println("No odd number detected in the array");
        // }
        // scanner.close();
    }
}

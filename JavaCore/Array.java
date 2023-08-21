package JavaCore;

import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        // int twoDimArray[][] = {{1, 2}, {3, 4}};
        // for (int i = 0; i < twoDimArray.length; i++) {
        //     for (int j = 0; j < twoDimArray[i].length; j++) {
        //         System.out.printf("Element at position (%d, %d) is (%d)\n", i, j, twoDimArray[i][j]);
        //     }
        // }

        // Input element for the 1-dim array
        // int Array[] = new int[10];
        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < Array.length; i++) {
        //     System.out.printf("Input the %d element for the array:", i);
        //     Array[i] = scanner.nextInt();
        // }
        // for (int i = 0; i < Array.length; i++) {
        //     System.out.printf("The %d element of the array is: %d\n", i, Array[i]);
        // }

        // Input element for the 2-dim array
        // int twoDimArray[][] = new int[2][2];
        // Scanner scanner = new Scanner(System.in);
        // for (int i = 0; i < twoDimArray.length; i++) {
        //     System.out.printf("Input elements for the row %d", i);
        //     for (int j = 0; j < twoDimArray[i].length; j++) {
        //         System.out.printf("Input element (%d, %d) of the array: ", i, j);
        //         twoDimArray[i][j] = scanner.nextInt();
        //     }
        //     System.out.println("\n");
        // }

        // for (int i = 0; i < twoDimArray.length; i++) {
        //     for (int j = 0; j < twoDimArray[i].length; j++) {
        //         System.out.print(twoDimArray[i][j]);
        //     }
        //     System.out.println("\n");
        // }

        // Viet chuong trinh nhap vao mot mang va in ra mot mang con gom cac so le
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of element in the array: ");
        int num = scanner.nextInt();
        int inputArray[] = new int[num];
        for (int i = 0; i < inputArray.length; i++) {
            System.out.printf("Input the value of %d element: ", i);
            inputArray[i] = scanner.nextInt();
            System.out.println("\n");
        }
        int count = 0;
        for (int i = 0; i < inputArray.length; i++) {
            if (inputArray[i] % 2 != 0) {
                System.out.printf("Odd numver: %d", inputArray[i]);
                count += 1;
            }
        }
        if (count == 0) {
            System.out.println("No odd number detected in the array");
        }
    }
}

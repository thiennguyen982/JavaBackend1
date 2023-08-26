package JavaCore;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Lec05Exam {

    public static boolean isPrime(long num){
        if (num < 2) {
            return false;
        } else if (num == 2){
            return true;
        } else if (num > 2){
            for (int i = 2; i < num - 1; i++) {
                if (num % i ==0) {
                    return false;
                }
            }
        }
        return true;
    }
    public static long sumElement(long num){
        long sum = 0;
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }
        return sum;
    }
    public static boolean even(long num){
        if (num % 2 == 0) {
            return true;
        }
        return false;
    }
    public static long[] appendElement(long[] arr, long element) {
        long[] newArray = Arrays.copyOf(arr, arr.length + 1);
        newArray[newArray.length - 1] = element;
        return newArray;
    }
    public static void main(String[] args) {

        // Kieu du lieu nguyen thuy
        // int soNguyen;

        // Class
        // Integer soInteger = 0;
        // System.out.print(soInteger.MAX_VALUE);
        // int tong = 0;
        // for (int i = 0; i < args.length; i++) {
        //     tong += Integer.valueOf(args[i]);
        // }
        // System.out.printf("Int is: %d", tong);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Input the number of element of array: ");
        int num = scanner.nextInt();
        long arr[] = new long[num];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Math.round(Math.random()*108);
        }

        // A. Xuat ra cac phan tu cua mang
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("The number at position %d is %d", i+1, arr[i]);
            System.out.print("\n");
        }

        // B1 - Max
        long max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        System.out.printf("\nThe max value in array: %d", max);
        // B2 - Min
        long min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (min > arr[i]) {
                min = arr[i];
            }
        }
        System.out.printf("\nThe min value in array is: %d", min);

        // C - Tong cac so nguyen to
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (isPrime(arr[i])) {
                sum += arr[i];
            }
        }
        System.out.printf("\nSum of prime number in array is: %d", sum);

        // D - So phan tu co tong cac chu so lon hon 10
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (sumElement(arr[i]) > 10) {
                count += 1;
            }
        }
        System.out.printf("\nThe number of element that have sum > 10: %d", count);

        // E - Sap xep mang tang dan
        Arrays.sort(arr);
        System.out.println("\nSorted array in ascending order: " + Arrays.toString(arr));

        // E - Sap xep mang giam dan
        long tempArr[] = new long[num];
        for (int i = 0; i < tempArr.length; i++) {
            tempArr[i] = arr[num - i - 1];
        }
        System.out.println("\nSorted array in ascending order: " + Arrays.toString(tempArr));

        // F - Chan giam dan
        long evenArray[] = new long[0];
        for (int i = 0; i < tempArr.length; i++) {
            if (even(tempArr[i])) {
                evenArray = appendElement(evenArray, tempArr[i]);
            }
        }
        System.out.println("\nSorted even array in descending order: " + Arrays.toString(evenArray));

        
        // F - Le tang dan
        long oddArray[] = new long[0];
        for (int i = 0; i < arr.length; i++) {
            if (even(arr[i])) {
                //Do Nothing
            } else {
                oddArray = appendElement(oddArray, arr[i]);
            }
        }
        System.out.println("\nThe ascending array of odd number: ");
        for (int i = 0; i < oddArray.length; i++) {
            System.out.printf("%d ", oddArray[i]);
        }

        // G - Tim phan tu co gia tri x
        System.out.println("\nInput element that need to find: ");
        long x = scanner.nextLong();
        int index = Arrays.binarySearch(arr, x);

        if (index >= 0) {
            System.out.println(x + " is found at index " + index);
        } else {
            System.out.println(x + " is not found in the array.");
        }
    }
}

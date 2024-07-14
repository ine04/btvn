import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBT {
    public void SumEvenNumberArrays(int[] array) {
        int sum = 0;
        for (int num : array) {
            if (num % 2 == 0) {
                sum += num;
            }
        }
        System.out.println("Sum = " + sum);
    }


    public void maxInArray(int[] array) {
        if (array == null || array.length == 0) {
            System.out.println("Array is empty");
            return;
        }
        int max = array[0];
        for (int num : array) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println("Max = " + max);
    }


    public void CountOccurrences(int[] array, int elementToFind) {
        int count = 0;
        for (int num : array) {
            if (num == elementToFind) {
                count++;
            }
        }
        System.out.println("Phan tu " + elementToFind + " xuat hien " + count + " lan trong mang");
    }

    public void SumOfSquaresElements(ArrayList<Integer> list) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("Moi ban them gia tri cho mang:");
            int value = sc.nextInt();
            list.add(value);
            System.out.println("Ban co muon tiep tuc them gia tri cho mang, y/n");
            String choice = sc.next();
            if (choice.equalsIgnoreCase("n")) {
                break;
            }
        }
        int sumOfSquares = 0;
        for (int num : list) {
            sumOfSquares += num * num;
        }
        System.out.println("Tong cac so binh phuonng trong mang la: " + sumOfSquares);
    }
}

import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {
        ArrayBT arrayBT = new ArrayBT();

        //Bai1
        arrayBT.SumEvenNumberArrays(new int[] {5, 1, 6, 7, 8, 3, 10, 15, 21});
        // Output: Sum = 24


        //Bai2        
        arrayBT.maxInArray(new int[] {5, 1, 6, 7, 8, 3, 10, 15, 21});
        // Output: Max = 21


        //Bai3       
        arrayBT.CountOccurrences(new int[] {5, 1, 6, 7, 5, 6, 10, 5, 21}, 5);
        // Output: Phan tu 5 xuat hien 3 lan trong mang

        arrayBT.CountOccurrences(new int[] {5, 1, 6, 7, 5, 6, 10, 5, 21}, 6);
        // Output: Phan tu 6 xuat hien 2 lan trong mang


      
        
        //Bai4    
        arrayBT.SumOfSquaresElements(new ArrayList<>());

    }
}

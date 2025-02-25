import java.util.Arrays;
import java.util.Scanner;

public class Arraystest {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array : ");
        int size = sc.nextInt();

        int[] a = new int[size];

        System.out.println("Enter elements : ");
        
        for (int i=0; i<a.length; i++) {
            System.out.println("Enter element at index: "+i);
            a[i] = sc.nextInt();
        }   //for loop -> index

        for (int i=0; i<a.length; i++) {
                System.out.println(a[i]);
         } 

        System.out.println(Arrays.toString(a));

        for (int i : a) 
            System.out.println(i);      //for-each loop -> element



            
        int row = sc.nextInt();
        int col = sc.nextInt();

        int matrix[][] = new int[row][col];
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++)
                matrix[i][j] = sc.nextInt();
        }
        
        for (int i=0; i<row; i++) {
            for (int j=0; j<col; j++)
                System.out.println(matrix[i][j]);
        }

        sc.close();
    }
}

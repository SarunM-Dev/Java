import java.util.*;

public class MatrixPrint {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = sc.nextInt();

        int[][] arr = new int[rows][cols];

  	  for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
		arr[i][j]=sc.nextInt();
}
}

        for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
                System.out.print(arr[i][j] + " ");
           }
            System.out.println();
        }
    }
}
import java.util.*;

public class MatrixPrint{
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = value.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = value.nextInt();

        int[][] arr = new int[rows][cols];

  	  for (int i = 0; i <arr.length; i++) {
            for (int j = 0; j <arr.length; j++) {
		arr[i][j]=value.nextInt();
}
}

     for (int i = 0; i <arr.length; i++) {
          for (int j = 0; j <arr.length; j++) {
               System.out.println(arr[i][j] + " ");
           }
            System.out.println();
}
}
}
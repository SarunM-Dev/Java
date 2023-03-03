import java.util.*;
public class MatrixPrint{
    public static void main(String[] args){
        Scanner value = new Scanner(System.in);
	System.out.print("Enter the number of Table: ");
        int tab = value.nextInt();
        System.out.print("Enter the number of rows: ");
        int rows = value.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = value.nextInt();

        int[][][] arr = new int[tab][rows][cols];
  	  for (int K = 0; K <tab; K++) {
            for (int i = 0; i <rows; i++) {
		for (int j = 0; j <cols; j++) {
	 	System.out.println("Enter the array value arr[" + i + "] [" + j + "]");
		arr[K][i][j]=value.nextInt();
}
}
}
	System.out.println("This Is 3D Array");
	for (int K = 0; K <tab; K++) {
    		 for (int i = 0; i <rows; i++) {
        		  for (int j = 0; j <cols; j++) {
               System.out.print(arr[K][i][j] + " ");
           }      
		if(i==0){
		System.out.println();
		}else {
		System.out.print("\t");
		}
	}
              
	}
}
}
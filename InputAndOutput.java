import java.io.*;
public class InputOutput{
public static void main(String[] args)throws IOException{
	DataInputStream d = new DataInputStream(newFileInputStream("C:\\Users\\admin\\Documents\\text 1.txt"));
    DataOutputStream out = new DataOutputStream(newFileOutputStream("C:\\Users\\\\admin\\Documents\\text2.txt"));
    String count;
    while((count=d.readLine()) !=null){
        String u = count.toUpperCase();
        System.out.println(u);
        out.writeBytes(u + "  ,");
    }
    d.close();
    out.close();
}
}
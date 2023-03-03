import java.io.*;
public class fileStreamTest{
 public static void main(String args[]){ // main method

 try{ //the try-catch block handling by catch block
 byte bWrite [] = {12,31,3,40,5}; // bwrite initialized 5 byte value more than 1 value so mention in array
 OutputStream os = new FileOutputStream("test.txt"); // new object created object name os write the byte
 for(int x=0; x < bWrite.length ; x++){
 os.write( bWrite[x] ); // writes the bytes
 }   // for loop used by bwrite to outputstream using the write
 os.close(); // closed in after all byte written in outputStream

 InputStream is = new FileInputStream("test.txt"); // created new inputstearm object , name is is read the byte
 int size = is.available(); // get the number available bytes in file
 for(int i=0; i< size; i++){ 
 System.out.print((char)is.read() + " ");
 }           // for loop is used for read each byte and char using in print one by one letter.
 is.close(); // closed in after all byte are read  in inputStream
 }
 catch(IOException e){
 System.out.print("Exception");
}
 }
} 
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyUsingBinary {
    public static void main(String[] args) {
        try(FileInputStream inputStream = new FileInputStream("E:\\Capture.jpeg");
           FileOutputStream outputStream = new FileOutputStream("zaraa.jpeg"))
           {
            byte[] chunk = new byte[1000];
            int byteRead;
            while ((byteRead = inputStream.read(chunk)) != -1) {
                outputStream.write(chunk,0,byteRead);
            }
           }catch(IOException e){
            System.out.println("Error in reading or writing the file");
        }
                
    }
}

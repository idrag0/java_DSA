package java_io;
import java.io.*;

import arrayList.maximum_water;
public class byteStream {
    public static void main(String args[])throws IOException{
    
        FileInputStream sourceFile = null;
        FileOutputStream targetFile = null;

        
        try{
           sourceFile = new FileInputStream("./java_io/demo.txt");
           targetFile = new FileOutputStream("./java_io/democopy.txt");

           int temp;

           while((temp = sourceFile.read()) != -1){
            targetFile.write((byte)temp);
           }
           System.out.println("Programrun successfully");
             
        }
        finally{
            if(sourceFile != null){
                sourceFile.close();
            }

            if(targetFile != null){
                targetFile.close();
            }
        }
    }
}

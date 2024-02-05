package java_io;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.EOFException;
import java.util.Scanner;

public class JavaIOfirst {

    //for reading file 
    public static void readFile(){
        try{
            File myobj = new File("./java_io/demo.txt");
            Scanner sc = new Scanner(myobj);
            while (sc.hasNextLine()) {
                String data = sc.nextLine();
                System.out.println(data);
            }
        }catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }

    // for writing in file 
    public static void writeFile(){
        try{
             //writing to the file information
             FileWriter wrobj = new FileWriter("./java_io/demo.txt");  //objrct fot writing
             wrobj.write("hello drago you are going to show this world...");
             wrobj.close();

        }catch(IOException e){
            System.out.println("Error : "+e.getMessage());
        }
    }
    public static void main(String srgs[]){
        JavaIOfirst obj = new JavaIOfirst();

        try{
            //this object create file
            File myobj = new File("./java_io/demo.txt");
            
            if(myobj.createNewFile()){
                System.out.println("File Created Sucessfully "+myobj.getName());
            }else{
                System.out.println("File Already exits.");
            }

            obj.writeFile();
            obj.readFile();
        }catch(IOException e){
            System.out.println("error :"+ e.getMessage());
        }
    }
}

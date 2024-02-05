package java_io;
import java.io.File;

public class javaDeleteFile {
    //for deleting file
    public static void delete(){
        File del = new File("./java_io/afs.txt");  // for deleting Folder just change path
        if(del.delete()){
            System.out.println("Deleted the file: "+del.getName());
        }else{
            System.out.println("Failed to Deleted the file: "+del.getName());
        }
    }

    public static void main(String[] args) {
        delete();
    }
}

import java.io.File;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("enter the folder path");
        String path=input.nextLine();
        System.out.println("enter the files type");
        String type=input.nextLine();
        input.close();
        File file=new File(path);
        String[] content=file.list();
        File f;
        for(int i=0;i<content.length;i++){
            f=new File(file.getAbsoluteFile()+"\\"+content[i]);
            f.renameTo(new File(file.getAbsoluteFile(),"\\"+i+type));
        }
    }
}
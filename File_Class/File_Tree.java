package File_Class;

import java.io.File;

public class File_Tree {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JAVA");
        printFile(file,0);
    }

    static void printFile(File f,int level){
        for(int i=0;i<level;i++){
            System.out.print("- ");
        }
        System.out.println(f.getName());
        if (f.isDirectory()){
            File[] Lists = f.listFiles();
            for (File list:Lists){
                printFile(list,level+1);
            }
        }
    }
}

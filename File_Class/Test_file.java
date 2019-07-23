package File_Class;

import java.io.File;
import java.io.IOException;

public class Test_file {
    public static void main(String[] args) {
        File file = new File("C:\\Users\\Administrator\\Desktop\\JAVA");
        if (file.isDirectory()){
            System.out.println("这是一个文件路径。");
        }
        File file1 = new File("C:\\Users\\Administrator\\Desktop\\JAVA\\aa\\bb\\cc");
        file1.mkdirs();//当路径不存在时，创建整个目录
        file1.mkdir();//只创建存在目录的下一级目录
        File file2 = new File("C:\\Users\\Administrator\\Desktop\\JAVA\\aa\\bb\\cc\\d.txt");
        try {
            file2.createNewFile();//创建一个新的文件,路径必须存在
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

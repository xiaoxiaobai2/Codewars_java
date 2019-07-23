package Exception_class;


import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Try_Catch_Finally {
    public static void main(String[] args) {
        char hello = hello();
        System.out.println(hello);
    }
    static char hello(){
        /*
        try catch finally
        一个try可以对应多个catch，子类catch写在最上面

        带有返回值的，   先赋值，然后执行finally，最后返回值
         */


        FileReader fileReader = null;
        try {
            fileReader = new FileReader("C:\\Users\\Administrator\\Desktop\\JAVA\\aa\\bb\\cc\\d.txt");
            char c = (char)fileReader.read();
            return c;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return 1;
        } catch (IOException e){
            e.printStackTrace();
            return 2;
        } finally {
            try {
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}

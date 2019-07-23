package Exception_class;

public class Test {
    public static void main(String[] args) {
        Object obj = new Object();
        test(obj);
    }

    static void test(Object obj){
        //instanceof 实例  A是B的实例则可以强制转换
        if (obj instanceof Man){
            Man man = (Man) obj;
        }
    }
}

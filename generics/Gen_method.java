package generics;

/**
  * @author:  Zhang
  * @description:
  * 泛型声明在方法中的应用
 *  修饰符  后     返回类型前
  *
 **/
public class Gen_method {
    public static void main(String[] args) {
        test("a");
    }

    public static <T> void test(T a){
        //反省方法只能访问对象的信息，不能修改对象的信息，因为类型不定
        System.out.println(a);

    }
}

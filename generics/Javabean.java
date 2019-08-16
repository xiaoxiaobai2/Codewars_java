package generics;


/**
  * @author:  Zhang
  * @description:
  * 泛型  只能使用引用类型，不能使用基本类型，int为基本类型，只能舒勇integer
 *         泛型是动态的，不能用于静态声明
  * T  表示Type
 *  E element
 *  K  V 表示键值中Key  Value
 *
 **/
public class Javabean <T1,T2>{
    private T1 name;
    private T2 score;

//    public Javabean(T1 name, T2 score) {
//        this.name = name;
//        this.score = score;
//    }

    public T1 getName() {
        return name;
    }

    public void setName(T1 name) {
        this.name = name;
    }

    public T2 getScore() {
        return score;
    }

    public void setScore(T2 score) {
        this.score = score;
    }
}

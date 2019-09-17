package Codewars_pratice;

public class Wholikesit {
    public static String whoLikesIt(String... names) {
        int n =names.length;//计算喜欢的人数
        String str = "";//返回的话
        switch (n){
            case 0:str="no one likes this";
            break;
            case 1:str=names[0] + " likes this";
            break;
            case 2:str=names[0] + " and "+ names[1] + " like this";
                break;
            case 3:str=names[0] + ", " + names[1] +  " and "+ names[2] + " like this";
                break;
             default:
                 n = names.length - 2;
                 str=names[0] + ", " + names[1] + " and " + n + " others like this";
                break;
        }
        System.out.print(str);
        return str;
    }

    public static void main(String[] args) {
        whoLikesIt("a","b","c");
    }
}

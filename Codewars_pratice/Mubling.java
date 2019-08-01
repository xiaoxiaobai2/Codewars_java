package Codewars_pratice;

public class Mubling {
    public static String accum(String s){
        String answer="";
        char[] chars=s.toCharArray();
        char c ='a';
        for (int i=0;i<chars.length;i++) {
            //原字母为大写
            if(chars[i]<91&&chars[i]>64){
                answer +=chars[i];
                for (int j=0;j<i;j++){
                    answer += Character.toLowerCase(chars[i]);//大写字母转为小写字母
                }
                answer +="-";
            }
            else{
                answer +=Character.toUpperCase(chars[i]);//小写字母转为大写字母
                for (int j=0;j<i;j++){
                    answer += chars[i];
                }
                answer +="-";
            }
        }
        answer = answer.substring(0,answer.length()-1);
        return answer;
    }

    public static String accum_(String s) {
        StringBuilder bldr = new StringBuilder();
        int i = 0;
        for(char c : s.toCharArray()) {
            if(i > 0) bldr.append('-');
            bldr.append(Character.toUpperCase(c));
            for(int j = 0; j < i; j++) bldr.append(Character.toLowerCase(c));
            i++;
        }
        return bldr.toString();
    }

    public static void main(String[] args) {
        System.out.println(accum("AbcdEF"));
    }
}

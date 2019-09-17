package Codewars_pratice;

public class Printer {
    public static String printererror(String s){
        int all=0;
        int error=0;
        char[] chars=s.toCharArray();
        for (char c:chars){
            all ++;
            if (!(c>=97&&c<=109))
                error++;
        }
        return error + "/" +all;
    }

    public static String printerError_(String s) {
        return s.replaceAll("[a-m]", "").length() + "/" + s.length();
    }

    public static void main(String[] args) {
        System.out.println(printererror("aaabbbbhaijjjm"));
    }
}

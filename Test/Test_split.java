package Test;

public class Test_split {
    public static void main(String[] args) {
        String s = "Hello world !";
        String[] a=s.split(" ");
        String z ="";
        for (String x:a
             ) {
            if((x.toCharArray()[0]>=65&&x.toCharArray()[0]<=90)||(x.toCharArray()[0]>=97&&x.toCharArray()[0]<=122))
                x = x.substring(1) + x.substring(0,1) + "ay";
            z +=x + " ";
        }
        z = z.trim();
        System.out.println(z);
    }
}

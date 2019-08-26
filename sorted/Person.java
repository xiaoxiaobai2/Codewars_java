package sorted;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    private String name;
    private int beautiful;

    public Person(String name, int beautiful) {
        this.name = name;
        this.beautiful = beautiful;
    }

    public Person() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBeautiful() {
        return beautiful;
    }

    public void setBeautiful(int beautiful) {
        this.beautiful = beautiful;
    }

    @Override
    public String toString() {
        StringBuffer sb=new StringBuffer();
        sb.append("姓名：").append(this.name).append(",")
                .append("帅气指数：").append(this.beautiful).append("\n");
        return sb.toString();
    }


    @Override
    public int compareTo(Person o) {
        return -(o.getBeautiful()-this.getBeautiful());
    }
}

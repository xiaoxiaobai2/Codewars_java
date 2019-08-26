package sorted;

import java.util.Comparator;

public class CompareBea implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        return o1.getBeautiful()-o2.getBeautiful();
    }
}

package question3;

import java.util.Set;
import java.util.TreeSet;

//question 3-2
public class TreeSetFactory<T extends Comparable> implements Factory<Set>{
    public Set create(){
        return new TreeSet<Comparable<T>>();
    }

}

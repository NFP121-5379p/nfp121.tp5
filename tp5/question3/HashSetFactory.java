package question3;

import java.util.Set;
import java.util.HashSet;

//question 3-1
public class HashSetFactory<T> implements Factory<Set>{
    public Set create(){
        return new HashSet();
    }

}
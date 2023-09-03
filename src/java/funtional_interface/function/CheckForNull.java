package javafunctionalinterface.function;

import java.util.function.Predicate;

//Type of Funtional interface which takes one args and return nothing
//Bi-Conumer which takes two args but return nothing 
//eg. iterating a map
public class CheckForNull implements Predicate {
	 
    @Override
    public boolean test(Object o) {
 
        return null == o;
 
    }
}
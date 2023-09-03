package javafunctionalinterface.predicates;

import java.util.function.Predicate;

//Type of Funtional interface which takes one args and return boolean value tru/false
//Bi-Predicate which takes two args but return boolean value 
//more variant IntPredicate, DoublePredicate, LongPredicate take primitive data types of given type
//eg. iterating a map


public class PredicateFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate predicate = (value) -> null == value ;
		
		System.out.println(new CheckForNull().test(new Object()));
		System.out.println(predicate.test(null));
		

	}

}

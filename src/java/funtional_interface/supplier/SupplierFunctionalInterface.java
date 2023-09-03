package javafunctionalinterface.supplier;

import java.util.function.Predicate;

//Type of Funtional interface which takes no args and return value
//Bi-Predicate which takes no args but return no value 
//more variant IntPredicate, DoublePredicate, LongPredicate take primitive data types of given type
//eg. iterating a map


public class SupplierFunctionalInterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Predicate predicate = (value) -> null == value ;
		
		System.out.println(new CheckForNull().test(new Object()));
		System.out.println(predicate.test(null));
		

	}

}

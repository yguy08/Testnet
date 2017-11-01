package io.github.yguy08.winterbe.javaeighttutorial;

import java.util.Objects;
import java.util.function.Predicate;

public class Predicates {
	//Predicates are boolean-valued functions of one arg. 
	public static void main(String[] args) {
		Predicate<String> predicate = (s) -> s.length() > 0;
		
		boolean test = predicate.test("foo");
		boolean negate = predicate.negate().test("foo");
		
		System.out.println(test);
		System.out.println(negate);
		
		//Not sure what these are used for
		Predicate<Boolean> nonNull = Objects::nonNull;		
		Predicate<Boolean> isNull = Objects::isNull;
		
		Predicate<String> isEmpty = String::isEmpty;
		Predicate<String> isNotEmpty = isEmpty.negate();
		
	}

}

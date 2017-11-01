package io.github.yguy08.winterbe.javaeighttutorial;

import java.util.function.Function;

public class Functions {

	public static void main(String[] args) {
		//Functions accept one arg and produce a result
		Function<String,Integer> toInteger = Integer::valueOf;
		
		//Default methods can be used to chain mult. functions together (compose, andThen)
		Function<String,String> backToString = toInteger.andThen(String::valueOf);
		
		String print = backToString.apply("12345");
		
		System.out.println(print);

	}

}

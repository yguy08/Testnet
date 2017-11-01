package io.github.yguy08.winterbe.javaeighttutorial;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class LambdaMain {

	public static void main(String[] args) {
		//how to sort string in previous version of java
		List<String> names = Arrays.asList("wyatt","napoleon","trump","mary");
		
		//asc
		Collections.sort(names,new Comparator<String>(){
			@Override
			public int compare(String a, String b){
				return a.compareTo(b);
			}
		});
		
		names.forEach(System.out::println);
		
		//instead of creating anon object, J8 introduced lambda expressions with much shorter syntax
		names = Arrays.asList("fox","hen","sheep","dinosaur");
		
		//desc
		Collections.sort(names, (String a, String b) -> {
			return b.compareTo(a);
		});
		
		names.forEach(System.out::println);
		
		//it can get even shorter
		names = Arrays.asList("truck","car","sedan","cart");
		
		//desc
		Collections.sort(names, (String a, String b) -> b.compareTo(a));
		
		names.forEach(System.out::println);
		
		//even shorter
		names = Arrays.asList("facebook","google","netflix","amazon");
		
		//asc
		Collections.sort(names, (a,b) -> a.compareTo(b));
		
		names.forEach(System.out::println);

	}

}

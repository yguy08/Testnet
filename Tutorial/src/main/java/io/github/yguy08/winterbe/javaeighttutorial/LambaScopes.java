package io.github.yguy08.winterbe.javaeighttutorial;

public class LambaScopes {

	public static void main(String[] args) {
		//Accessing local variables
		
		//We can read final local variables
		final int num = 1;
		Converter<Integer, String> stringConverter = (from) -> String.valueOf(from+num);
		System.out.println(stringConverter.convert(3));
		
		//But different to anon obj, num does not have to be declared final
		int notFinalInt = 1;
		Converter<Integer, String> notFinalConverter = (from) -> String.valueOf(from+notFinalInt);
		System.out.println(notFinalConverter.convert(2));
		
		//However, the local variable must be implicitly final for code to compile
		int notImplFinal = 1;
		Converter<Integer, String> notImplFinalConverter = (from) -> String.valueOf(from+notImplFinal);
		//notImplFinal=4; won't compile
	}

}

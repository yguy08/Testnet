package io.github.yguy08.winterbe.javaeighttutorial;

import java.util.function.Consumer;

public class Consumers {

	public static void main(String[] args) {
		//Consumers represent operations to be performed on a single input argument
		Consumer<Crypto> cryptoHelp = (c) -> System.out.println("Help for: " + c.name);
		cryptoHelp.accept(new Crypto("Banknotes",100));
	}

}

package io.github.yguy08.winterbe.javaeighttutorial;

import java.util.function.Supplier;

public class Suppliers {

	public static void main(String[] args) {
		//Suppliers produce a result of a given generic type. Suppliers don't accept arguments
		Supplier<Crypto> cryptoSupplier = Crypto::new;
		
		Crypto c = cryptoSupplier.get();
		System.out.println(c.toString());
	}

}

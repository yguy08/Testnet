package io.github.yguy08.winterbe.javaeighttutorial;

import java.math.BigDecimal;

//Functional Interface Impl
public class ConverterImpl {
	public static void main(String[] args) {
		//integer
		Converter<String,Integer> converter = (from) -> Integer.valueOf(from);
		Integer converted = converter.convert("123");
		System.out.println(converted);
		
		//big decimal
		Converter<String,BigDecimal> bdConverter = (from) -> new BigDecimal(from);
		BigDecimal bdConverted = bdConverter.convert("6500.00");
		System.out.println(bdConverted.toPlainString());
		
		//Static Method Reference (:: keyword)
		Converter<String, Integer> methodRefConverter = Integer::valueOf;
		Integer methodRefConverted = methodRefConverter.convert("123");
		System.out.println(methodRefConverted);
		
		//Object method Reference
		Something something = new Something();
		Converter<String,String> objMethodRefConverter = something::startsWith;
		String strConverted = objMethodRefConverter.convert("bitcoin");
		System.out.println(strConverted);
		
		//Constructor method reference
		CryptoFactory<Crypto> cryptoFactory = Crypto::new;
		Crypto crypto = cryptoFactory.create("ETH",5000000);
		System.out.println(crypto.toString());
	}

}

class Something{
	String startsWith(String s){
		return String.valueOf(s.charAt(0));
	}
}

class Crypto{
	String name;
	int satPrice;
	
	Crypto(){}
	
	Crypto(String name, int satPrice){
		this.name = name;
		this.satPrice = satPrice;
	}
	
	@Override
	public String toString(){
		return "Name: " + this.name + " " + "Sats: " + this.satPrice;
	}
}

interface CryptoFactory<C extends Crypto>{
	C create(String name, int satPrice);
}

package io.github.yguy08.predicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class TwentyOneClub {

	public static void main(String[] args) {
		List<Bitcoin> list = new ArrayList<>();
		list.add(new Bitcoin("wyatt",22.00));
		list.add(new Bitcoin("ski",2.00));
		list.add(new Bitcoin("goldman",1000.00));
		
		print(list,a -> a.is21Club());	

	}
	
	public static void print(List<Bitcoin> lst,Predicate<Bitcoin> p){
		for(Bitcoin b : lst){
			if(p.test(b))
				System.out.println(b.toString());
		}
	}

}

class Bitcoin {
	String name;
	double amount;
	public Bitcoin(String name, double amount){
		this.name = name;
		this.amount = amount;
	}
	
	boolean is21Club(){
		return amount >= 21.00;
	}
	
	public String toString(){
		return name + " " + amount;
	}
}

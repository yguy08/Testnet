package io.github.yguy08.winterbe.javaeighttutorial;
//Default method impl
public class FormulaImpl {
	public static void main(String[] args) {
        Formula formula = new Formula(){
        	@Override
        	public double calculate(int a){
        		return sqrt(a * 100);
        	}
        };        
        System.out.println(formula.calculate(100));
        System.out.println(formula.sqrt(16));
	}

}

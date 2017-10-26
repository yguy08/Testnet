package io.github.yguy08.winterbe.javaeighttutorial;
//Default Methods for Interfaces
public interface Formula {
    double calculate(int a);
    
    default double sqrt(int a){
    	return Math.sqrt(a);
    }
}
package io.github.yguy08.generics;

public class GenericBoxClass {	
	public static void main(String[] args) {
		GenericBox<Byte> box = new GenericBox<>();
		box.set((byte)5);
		System.out.println(box.get().byteValue());
	}
}
/* 
 * A Generic Version of the Box Class
 * A generic class is defined with the following format:
 * 
 * class name<T1, T2, ..., Tn> {  ...  }
 * 
 * The type parameter section, delimited by angle brackets (<>), follows the class name. 
 * It specifies the type parameters (also called type variables) T1, T2, ..., and Tn.
 * To update the Box class to use generics, you create a generic type declaration by changing the code "public class Box" to "public class Box<T>". 
 * This introduces the type variable, T, that can be used anywhere inside the class.
 * With this change, the Box class becomes:
 */
class GenericBox<T> {
	private T t;
	
	public void set(T t){
		this.t = t;
	}
	
	public T get(){
		return t;
	}
}

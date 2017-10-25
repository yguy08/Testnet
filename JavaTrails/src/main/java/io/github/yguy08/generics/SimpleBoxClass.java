package io.github.yguy08.generics;

public class SimpleBoxClass {
	public static void main(String[] args) {
		Box box = new Box();
		box.setObject(new Integer(1));
		System.out.println(box.getObject().toString());
	}

}

/*
 * Begin by examining a non-generic Box class that operates on objects of any type. 
 * It needs only to provide two methods: set, which adds an object to the box, and get, which retrieves it:
 */

class Box {
	private Object object;
	
	public void setObject(Object obj){
		this.object = obj;
	}
	
	public Object getObject(){
		return object;
	}
}

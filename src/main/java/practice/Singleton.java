package practice;

public class Singleton {
	
	/*
	 * In OOP: Singleton : is a special class that can have only and only one object
	 * (Single instance of class) at a time
	 * 
	 * How to design Singleton class? -> 
	 * 1. Make Constructor as private 
	 * 2. write a public static method that has return type of object of this 
	 * singleton class 
	 * -- it's also called (Lazy Initialisation)
	 * 
	 * What is difference between normal class and singleton class?
	 * for normal class we use the constructor where as
	 * for singleton class we use getInstance method for Instantiation
	 */
	
	private static Singleton singleton_instance = null;
	public String str;
	
	private Singleton() {
		str = "Hello This is Demo of Singleton Class Pattern";
	}
	
	public static Singleton getInstance() {
		if(singleton_instance == null)
			singleton_instance = new Singleton();
			return singleton_instance;
	}

	public static void main(String[] args) {
		
		Singleton x = new Singleton();
		Singleton y = new Singleton();
		Singleton z = new Singleton();
		
		//x.str = x.str.toUpperCase();
		x.str = (x.str).toUpperCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
		z.str = (z.str).toLowerCase();
		
		System.out.println(x.str);
		System.out.println(y.str);
		System.out.println(z.str);
		
	}

}

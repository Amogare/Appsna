package Assignment2;

public class AbstDemo {
	//cannot instantiate abstract class
	//Test t = new Test();
}


abstract class Test{
	//concrete method
	public int add(int a, int b) {
		return a+b;
	}
	
	 //abstract method
	public abstract void print();  
}

//can declare class abstract without abstract method
abstract class Test1{
	public void play() {
		System.out.println("I am playing...");
	}
}

//Extending an abstract class,add the abstract method, override it
//or make the sub classes as private
class Demo extends Test{

	@Override
	public void print() {
		// TODO Auto-generated method stub
		
	}
	
}
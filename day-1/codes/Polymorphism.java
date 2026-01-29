class A {
	void display(){
		System.out.println("inside class A");
	}
}

class B extends A {
	@Override
	void display(){
		System.out.println("inside class B");
	}
}

class C extends A {
	@Override
	void display(){
		System.out.println("inside class C");
	}
}

class Polymorphism 
{
	public static void main(String[] args) 
	{
		//A obj = new A();
		//B obj = new B();
		//A obj = new B();

		A obj = null;
		
		//obj = new B();
		//obj = new C();
		obj = new A();
		obj.display();
		

		System.out.println(obj instanceof A);
		System.out.println(obj instanceof B);
		System.out.println(obj instanceof C);
	}
}

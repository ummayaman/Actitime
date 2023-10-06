package qsp;

public class Demo1 {
	static int a=30;
	 static int b=20;
	static {
	}
	public static int test() {
		System.out.println("test begin");
		System.out.println("value of a:"+a);
		System.out.println("value of b:"+b);
		System.out.println("test even");	
		return 60;
		
	}

	public static void main(String[] args) {
		System.out.println("main start");
		Demo1.test();
		System.out.println("Value of a"+a);
		System.out.println("Value of b"+a);
		Demo1.print();
		System.out.println("Main end");
	}
	public static int print()
	{
		System.out.println("print begin");
		System.out.println("Value of a"+a);
		System.out.println("Value of b"+a);
		System.out.println("print end");
		return 90;
	}
		
		static
		{
			b=30;
			b=print();
		}
		
	
	
		

	}



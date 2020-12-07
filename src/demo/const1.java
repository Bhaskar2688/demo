package demo;

public class const1 { 		//class
	

		int a =10 ;           // VAR.
		String s="0";
		
		const1()  // conST.  no return type
		{
		a = 10;
		s = "Bhaskar";
		System.out.println(this.s);
		}
		
		public void test()
		{
			System.out.println(s);
			System.out.println(this.a);
			System.out.println("runing method test ");
			 
		}
		
		public static void main(String[] args) {
			
			const1 c = new const1();
			
			c.test();
			c.test();
		}
}

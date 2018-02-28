package lesson1;

public class MyFirstProgram {
	
	static public void main(String[] args)
	{
		String s = "Моя первая программа";
		int a = 5;
		double d = 3.34562;
		boolean b = true;
		boolean b2 = false;
		
		System.out.println(s + ": " + a);
		
		System.out.printf("%s:  %d  вывод %f", s, a, d);
	}
}

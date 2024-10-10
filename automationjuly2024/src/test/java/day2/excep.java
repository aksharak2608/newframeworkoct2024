package day2;

import java.io.IOException;

public class excep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
			int a[]= {1,2,3};
			System.out.println(a[2]);
			final int a1=5;
			int b1=0;
			if(b1==0)
			{
				
			throw new ArithmeticException("we can not divide a1 by b as b value is 0");
			//System.out.println(c);
			}
			else
			{
				int c=a1/b1;
				System.out.println(c);
			}
		//	a1=10;
			
			//final varible values will not be modified
			try {
		}
		catch(IndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
finally {
	System.out.println("finally");
}
	}

}

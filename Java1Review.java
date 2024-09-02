import java.util.Arrays;

/**
 * Implement each of the 10 methods tested in JUnitTests.java. Study the tests
 * to determine how the methods should work.
 */
public class Java1Review {

	public static int divide(int a, int b)
	{
		return a/b;
	}

	public static double divide(double a, double b)
	{
		return a/b;
	}

	public static boolean isDivisibleBy7(int a)
	{
		return a%7==0;
	}

	public static String main(String a)
	{
		String b = "Overloaded main method was passed \"" + a + "\".";
		return b;
	}

	public static  int findMin(int a, int b, int c)
	{
		if((a<=b)&&(a<=c))
		{
		return a;
		}
		else
		if((b<=a)&&(b<=c)){
		return b;
		}
		else
		return c;
	}

	public static int findMin(int[] a)
	{
		int small=a[0];
		for(int i = 0; i<a.length;i++)
		{
			if(a[i]<small)
			small=a[i];
		}
		return small;
	}

	public static double average(int[] a)
	{
		int sum = 0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		return (double)sum/a.length;
	}

	public static void toLowerCase(String[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=a[i].toLowerCase();
		}
	}

	public static String[] toLowerCaseCopy(String[] a)
	{
		String[] b = new String[a.length];
		for(int i=0; i<b.length; i++)
		{
			b[i]=a[i].toLowerCase();
		}
		return b;
	}

	public static int[] removeDuplicates(int[] a)
	{
		int[] b = a.clone();
		int test;
		for(int i=0; i<a.length-1; i++)
		{
			test=i;
			for(int j=i+1; j<a.length;j++)
			{
				if(a[test]==a[j])
				{
					b[j]=0;
					b[test]=0;
				}
			}
		}
		return b;

		
    }



	public static void main(String[] args) {
		int[]array = new int[] {38, 451, 101, 451, 42, 451, 101, -1};
		System.out.println(Arrays.toString(removeDuplicates(array)));
		int[]array2 = new int[] {451, 451, 20, 20, 52, 60, 70, 20};
		System.out.println(Arrays.toString(removeDuplicates(array2)));
	}

}

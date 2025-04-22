package oprerators;

public class sumavg {

	public static void main(String[] args) {
		int sum=0;
		int a[]= {5,6,7,8,9};
		for (int i:a)
		{
			sum=sum+i;
		}
		int avg=sum/5;
		System.out.println(sum);
		System.out.println(avg);
	}

}

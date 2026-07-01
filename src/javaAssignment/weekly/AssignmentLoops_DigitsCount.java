package javaAssignment.weekly;

public class AssignmentLoops_DigitsCount {

	public static void main(String[] args) {
		
		int num=987654;
		//System.out.println(num%10);
		//System.out.println(num/10);
		int count=0;
		
		for (int i=num;i>10;i--)
		{
			//num=num%10;
			num=num/10;
			count=count+1;
			System.out.println("num = "+num);
			System.out.println("count = "+num);
		}
		System.out.println(count);
	}

}

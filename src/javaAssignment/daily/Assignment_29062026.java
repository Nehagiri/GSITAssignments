package javaAssignment.daily;

public class Assignment_29062026 {

	public static void main(String[] args) {

		int num=95371;
		int digit=0;
		int largest=0;
		
		while(num>0)
		{
			digit=num%10;
			//System.out.println("digit = "+digit);
			num=num/10;
			//System.out.println("num = "+num);
			if(largest<=digit)
				largest=digit;
						

		}
		System.out.println(largest);
	}

}

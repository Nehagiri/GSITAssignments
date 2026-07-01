package javaAssignment.weekly;

public class AssignmentLoops_Factorial {

	public static void main(String[] args) {
		
		int num=5;
//		int intitatir=num*(num-1);
//		for(int i=num-1;i>=2;i--)
//		{
//			intitatir=intitatir*(i-1);
//			
//		}
		int intitatir=1;
		for(int i=num;i>=2;i=i-2)
		{
			intitatir=intitatir*i*(i-1);
			
		}
		System.out.println("Factorial of "+num+" = "+intitatir);
	}
}

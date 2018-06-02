package package1;

public class PassParameter 
{
    public static void main(String[] args){
    	DynamicCalculator obj1=new DynamicCalculator();
		int sum = obj1.add(300, 100);
		System.out.println("Sum result is "+sum);
		double z=obj1.sub(789.50, 35.23);
		System.out.println("Subtraction result is "+z);
		String fullname = DynamicCalculator.getMyFullName("Nishi", "Mittal");
		System.out.println("Congrats "+fullname);
    }
	
}

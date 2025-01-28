package array;
public class AveargeArray 
{
public static void main(String[] args) 
{
	double salary[]=new double[4];
	salary[0]=8745;
	salary[1]=9745;
	salary[2]=6745;
	salary[3]=5745;
	double sum=0;
	double average=0;
	
	 
	for(int i=0;i<salary.length;i++)
	{
	sum=sum+salary[i];
	}
	System.out.println(sum);
	average=sum/(salary.length);
	System.out.println(average);
	
/*
 * i=0,sum=0+8745=8745
 * i=1,sum=8745+9745
 * i=2,sum=8745+9745+6745
 */
	
	
}
}
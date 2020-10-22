import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) 
	{
	    Scanner scn = new Scanner(System.in);
		short t = scn.nextShort();
		for( short i = 0 ; i<t ; i++){
		    if(scn.nextInt()<10)
		        System.out.println("Thanks for helping Chef!");
		        else System.out.println(-1);
		}
	}	
}


import java.util.Scanner;
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner sc = new Scanner(System.in);
		int count=1,sum=0,finalwin=0,maxlead=0,win=0;
		while(count<=5){
		int playerA = sc.nextInt();
			int playerB= sc.nextInt();
	
	     if(playerA>playerB){
	         sum=playerA-playerB;
	         win=1;
	     }
	     else{
	         sum=playerB-playerA;
	           win=1;
	     }
	     if(sum>maxlead){
	         maxlead=sum;
	         finalwin=win;
	     }
		
		count++;
		}
		System.out.println(finalwin+" "+maxlead);
	}
}

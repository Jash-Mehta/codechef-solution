/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		for(int j=0;j<t;j++){
		    
		    int a = sc.nextInt();
		    int b = sc.nextInt();
		    int c = sc.nextInt();
		    int ans= 0;
		    if(a>b){
		        if(a>c){
		            if(b>c)
		            ans = b;
		            else
		            ans = c;
		        }
		        else{
		            ans = a;
		        }
		    }
		    else{
		        if(b>c){
		            if(a>c)
		            ans = a;
		            else
		            ans =c;
		        }
		        else 
		        ans =b;
		        
		    }
		    System.out.println(ans);
		}
	}
}

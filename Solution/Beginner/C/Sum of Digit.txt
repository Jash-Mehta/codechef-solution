#include<stdio.h>
int main()
{
	int n,k,i;
	scanf("%d",&k);
	for(i=0;i<k;i++)
	{
		int r=0,s=0;
		scanf("%d",&n);
		while(n!=0)
		{
		r=n%10;
		s=s+r;
		n=n/10;
		}
		printf("%d\n",s);
	}
	return 0;
}


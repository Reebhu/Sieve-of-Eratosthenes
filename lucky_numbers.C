#include <stdio.h>

int main(void) {
    int i,j,n;
    scanf("%d",&n);
    int a[100],b[100];
    for(i=0;i<n;i++)
    {
        a[i]=i+1;
        b[i]=1;    
    }
    
    for(i=1;i<=n;i++)
    {
        if(b[i]==1)
        {
        	int k =a[i];
        	int count =0;
        	for(j=0;j<n;j++)
        	{
            		if(b[j]==1)
			{
            		    count++;
           		    if(count==k)
                	    {
                    		b[j]=0;
                    		count=0;
                	    }
            		}
        	}
        }
    }
    for(i=0;i<n;i++)
    {
        if(b[i]==1)
            printf("%d ",a[i]);
    }
   
	return 0;
} 

//  THREESOME PAIRING

// https://www.hackerearth.com/problem/algorithm/threesome-pairing/

import java.util.*;
class Testcases
{
public static void main(String args[] ) throws Exception 
{
Scanner s=new Scanner(System.in);
int t=s.nextInt();
while(t!=0)
{
int l=s.nextInt();
int a[]=new int[l];
for(int i=0;i<l;i++)
a[i]=s.nextInt();
int c=0;
for(int i=0;i<l-1;i++)
{
for(int j=i+1;j<l;j++)
{
if((a[i]+a[j])%3==0)
c++;
}
}
System.out.println(c);
t--;
}
}
}
class Pattern2
{
public static void main(String args[]){
int i,j;
for(i=0;i<=2;i++)
{
for(j=0;j<=2;j++)
{
if((i+j)%2==0)
System.out.print("*");
else
System.out.print(" ");
}
System.out.println("");
}}}
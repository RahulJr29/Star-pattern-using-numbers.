/*Name- Rahul Dey
  Sec-B
  Roll-63*/
class StarNumber
{
	public static void main(String rahul[])
	{
		int i,j,n=1;
		int p=Integer.parseInt(rahul[0]);
		int[][] a = new int[p][p];
		for(i=p;i>=1;i--)
		{
			for(j=1;j<=i;j++)
			{
				a[n-1][j-1]=j*n;
			}
			n++;
		}
		for(i=0;i<p;i++)
		{
			for(j=0;j<p;j++)
			{
				if(a[i][j]!=0)
				System.out.print(a[i][j]+"   ");
			}
			System.out.println();
		}
	}
}
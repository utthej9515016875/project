class Program1{
public static void main(java.lang.String[] args){
	
		int[] ia=new int[5];
		System.out.println("Default values");
		System.out.println();
		int sh=0;
		for(int i=0;i<5;i++)
		{
			System.out.println(ia[i]);
			sh++;
		}
		System.out.println("default values are"+""+sh);
	System.out.println("Explicit values");
	int[] b={1,2,3,4,5,6};
	int ut=0;
	for (int i=0;i<b.length;i++)
	{
	System.out.println(b[i]);
	ut++;
	}
	System.out.println("Explicit values are"+""+ut);
	int[][] d=new int[5][2];
	System.out.println("multidimensional array default values");
	System.out.println();
	int ch=0;
	for(int i=0;i<5;i++)
	{
		for(int j=0;j<2;j++)
		{
			System.out.println(d[i][j]);
			ch++;
		}
	}
	System.out.println("multidimnensional array are"+""+ch);
	

int[][] ui=new int[2][4];
System.out.println("multidimensional explicit values are");
ui[0][0]=58;
ui[0][1]=68;
ui[0][2]=78;
ui[0][3]=11;
ui[1][0]=88;
ui[1][2]=98;

for(int utthej=0;utthej<2;utthej++)
	{
	for(int z=0;z<4;z++)
		{
			System.out.println(ui[utthej][z]);
	}
}
}
}
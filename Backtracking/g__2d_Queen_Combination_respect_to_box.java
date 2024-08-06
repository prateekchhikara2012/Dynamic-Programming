
public class g__2d_Queen_Combination_respect_to_box {

	public static void main(String[] args) {
		

		boolean arr [] []=new boolean [2][2];
		
		fun(arr, 0,0, "", 2 ,0);
	}
	
	public static void fun(boolean arr [] [] , int row ,int col , String ans , int tq , int pq )
	{
		
		if(tq==pq)
		{
			System.out.println(ans)		;
			return ;
			}
		
		if(col==arr[0].length)
		{
		row++;
		col=0;
		
		}
		
		if(row==arr.length)
		{
			return ;
		}
		
		arr[row][col]=true;
		fun(arr , row , col+1 ,ans+"b"+row+ col+"  "  , tq ,pq+1);
		arr[row][col]=false;
		
		
		fun(arr, row , col+1 , ans , tq ,pq);
		
		
		
		
	}

}

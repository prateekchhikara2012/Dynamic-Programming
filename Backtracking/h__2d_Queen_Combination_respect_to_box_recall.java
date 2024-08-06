
public class h__2d_Queen_Combination_respect_to_box_recall {

	public static void main(String[] args) {
		
		

		
		boolean arr[] [] =new boolean [2][2];
		
		fun ("" , arr ,2, 0,0,0);
		
	}
	
	public static void fun(String ans , boolean arr [] [] , int tq ,int pq ,int row, int col)
	{
		
		
		//base case should be in the same order
		
		
		
		if(tq==pq)
		{
			System.out.println(ans);
			return ;
		}
		
		
		// we are giving the another call so that we can change the row and the columns 
		
		if(col==arr[0].length)
		{
			fun(ans ,arr  ,tq ,pq, row+1 , 0);
			return ;   // very very imp line 
						// if not applied will give you another thing
		}
		
		if(row==arr.length)
		{
			return ; 
		}
		
		arr[row][col]=true;
		fun(ans+row +col +" " , arr, tq, pq+1, row, col+1);
		arr[row][col]=false;
		
		
		
		fun(ans , arr, tq , pq, row,col+1);
	}
	
	

}

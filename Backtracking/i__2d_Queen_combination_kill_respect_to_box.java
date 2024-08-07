
public class i__2d_Queen_combination_kill_respect_to_box {

	public static void main(String[] args) {

		
		boolean arr[] []=new boolean [4][4];
		fun("", 3 ,0 ,0,0, arr);
		System.out.println(count);

	}
	static int count=0;
	
	public static void fun(String ans , int tq ,int pq , int row ,int col , boolean arr [] [])
	{
		
		if(tq==pq)
		{
			System.out.println(ans);
			count++;
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
		
		if(check_weather_to_be_placed(arr, row, col))
		{
			
			arr[row][col]=true;
			fun(ans+" b"+row+col , tq ,pq+1 , row, col+1 , arr);
			arr[row][col]=false;
		}
		fun(ans , tq, pq, row, col+1 , arr);
		
	}
	
	public static boolean check_weather_to_be_placed(boolean arr [] [] ,int row, int col)
	{
				
		//upp
		int r=row-1; 
		int c=col;
		
		
		while(r>=0)
		{
			if(arr[r][c])
			{
				return false; 
			}
			r--;
		}
		
		
		//left
		r=row;
		c=col-1;
		
		while(c>=0)
		{
			if(arr[r][c])
			{
				return false;
			}
			c--;
		}
		
		//right
		
		r=row;
		c=col+1;
		
		while(c<arr[0].length)
		{
			if(arr[r][c])
			{
				return false;
			}
			c++;
		}
		
		
		//down
	
		r=row+1;
		c=col;
		
		while(r<arr.length)
		{
			if(arr[r][c])
			{
				return false;
			}
			r++;
		}
		
		
		//left up diagonal
		r=row-1;
		c=col-1;
		
		while(r>=0 && c>=0)
		{
			if(arr[r][c])
			{
				return false;
			}
			r-- ;
			c--;
			
		}
		
		
		// right up diagnoal 
		
		r=row-1;
		c=col+1;
		
		
		while(r>=0 && c <arr[0].length)
		{
			if(arr[r][c])
			{
				return false;
			}
			
			

			
			
			r--;
			c++;
		}
		

		//left down diagnoal
		
		
		r=row+1;
		c=col-1;
		
		while(r<arr.length && c>=0)
		{
			
			if(arr[r][c])
			{
				return false;
			}
			
			
			r++;
			c--;
			
		}
		
		//roght down diagnoal 
		
		
		r=row+1;
		c=col+1;
		
		
		while(r<arr.length && c<arr[0].length)
		{
			if(arr[r][c])
			{
				return false;
			}
			r++;
			c++;
		}
		
		
		
		
		

		
		return true;
	}

}

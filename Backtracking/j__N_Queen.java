
public class j__N_Queen {

	public static void main(String[] args) {

		fun("" , new boolean [4][4] , 4,0 ,0 ,0);		
	}
	
	public static void fun(String ans ,boolean [][]arr ,int tq , int pq ,int row ,int col )
	{
		
		

		if(tq==pq)
		{
			System.out.println(ans);
			return ;
		}
		
		if(col==arr[0].length)
		{

			// for approach 1 only
			// row++;
			// col=0;   


			
			// for apporach 2 only
			//return;   

		}
		
		if(row==arr.length)
		{
			return ;
		}
		
		//place 
		if(check_weather_to_be_placed(arr ,row,col))// to check is it safe to place
		{
			arr[row][col]=true;


			// Approach 1
			// fun (ans+" b"+row+col ,arr ,tq ,pq+1, row , col+1);
			// we are increasing the col (the calls will be more )


			// Approach 2
			 fun(ans+" b"+row+col , arr ,tq ,pq+1, row+1,0);
			// we are jumping into the another row... as we know that we cant place 
			// 2 queens in the same row because they voth are going to kill each other


			
			arr[row][col]=false;
		}
		
		
		
		//not placed
		fun(ans , arr , tq ,pq ,row, col+1 );
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

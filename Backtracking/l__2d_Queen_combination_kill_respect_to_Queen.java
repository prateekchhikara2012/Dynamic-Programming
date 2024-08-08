public class l__2d_Queen_combination_kill_respect_to_Queen {

	
    public static void main(String[] args) {
        

        boolean arr[][]=new boolean[5][6];

        fun(arr,4,0,"",0);
    }

    public static void fun(boolean arr[][] , int tq ,int pq ,String ans , int row) {


        if(tq==pq)
        {
            System.out.println(ans);
            return ;
        }

        if(row==arr.length)
        {
            return ;
        }




        for(int col=0;col<arr[0].length ;col++)
        {

            if(check(arr, row,col))
            {
                arr[row][col]=true ;
                fun(arr, tq, pq+1, ans+row+"-"+col+" ", row+1);
                arr[row][col]=false;
            }


        }

        fun(arr, tq, pq, ans, row+1);
        
    }

    public static boolean check(boolean arr [] [] ,int row, int col)
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

public class k__N_knight {
    public static void main(String[] args) {

        boolean arr[][]=new boolean [3][3];
        fun(arr ,0,0,0,arr.length ,"");

        
    }
    static int count=0;
    public static void fun(boolean arr [] [] , int row ,int col ,int pk ,int tk , String ans)
    {

        //+ve bcase

        if(tk==pk)
        {

            count++;
            System.out.println(count+" "+ ans);
            return  ;
        }



        //-ve bcase
        if(col==arr[0].length)
        {
            row++;
            col=0;
        }

        // -ve base case
        if(row==arr.length)
        {
            return ;    
        }


        

        if(check(arr ,row, col)) // for checking is it safe or not
        {
            arr[row][col]=true;
            fun(arr ,row, col+1 , pk+1, tk ,ans+" b"+ row+col);
            arr[row][col]=false;
        }

        fun(arr, row, col+1 ,pk , tk ,ans);
    }
    
    public static boolean check(boolean arr [] []  ,int row, int col) {
        

        int r=row-1;
        int c=col-2;

        if(r>=0 && c>=0)
        {
            if(arr[r][c])
            {
                return false;
            }
        }

        r=row-2;
        c=col-1;

        if(r>=0 && c>=0)
        {
            if(arr[r][c])
            {
                return false;
            }
        }

        r=row-1;
        c=col+2;

        if(r>=0 && c<arr[0].length)
        {
            if(arr[r][c])
            {
                return false;
            }
        }

        r=row-1;
        c=col+2;

        if(r>=0 && c<arr[0].length)
        {
            if(arr[r][c])
            {
                return false;
            }
        }


        return true;
        
    }
}

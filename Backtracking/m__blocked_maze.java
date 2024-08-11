public class m__blocked_maze
{

    public static void main(String[] args) {
        int arr[][]={{0,0,0,0} ,{0,1,0,0},{1,1,0,0},{0,0,1,0}};

        fun(arr,0,0,"");

    }

    public static void fun(int arr[] [] , int row ,int col , String ans) {

      

        if(row== arr.length-1 && col==arr[0].length-1)
        {
            System.out.println(ans);
            return ;
        }


        if(row<0 || col<0 || row==arr.length || col==arr[0].length || arr[row][col]==1)
        {
            
            return ;
        }

        
        
        arr[row][col]=1;

        fun(arr, row-1, col, ans+row+""+ col +"  ");

        fun(arr, row+1, col, ans+row+""+ col +"  ");

        fun(arr, row, col-1, ans+row+""+ col +"  ");

        fun(arr, row, col+1, ans+row+""+ col +"  ");

        arr[row][col]=0;
        
    }
}
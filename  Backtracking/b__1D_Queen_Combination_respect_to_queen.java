public class b__1D_Queen_Combination_respect_to_queen {

    public static void main(String[] args) {
        boolean arr[] =new boolean[4];
        fun("" ,arr, 0,2,0);

        
    }
    public static void fun(String ans ,boolean [] arr ,int pq ,int tq,int index)
    {

        if(pq==tq)
        {
            System.out.println(ans);
            return ;
        }
    



        for(int i=index;i<arr.length;i++)
        {
            arr[i]=true;
            fun(ans+" b"+i+"q"+pq ,arr, pq+1, tq,i+1);
            arr[i]=false;
        }
    }
    
}

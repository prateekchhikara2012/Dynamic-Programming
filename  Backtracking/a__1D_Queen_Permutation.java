public class a__1D_Queen_Permutation {

    public static void main(String[] args) {
        boolean arr [] =new boolean[4];
        fun(arr, "", 2, 0);

    }
    static int count=1;
    public static void fun(boolean [] arr ,String ans ,int tq ,int pq) {


        if(tq==pq)
        {
            
            System.out.println(count+" "+ans);
            count++;
            return ;
        }

        for(int i=0;i<=arr.length-1;i++)
        {
            
            if(arr[i]==false)
            {
                arr [i]=true;

                fun(arr,ans+" q"+pq+"b"+i ,tq ,pq+1);

                arr[i]=false; // BackTracking conditions

            }


           

        }
        
    }

    
}

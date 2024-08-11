public class n__coin_change_woth_repsect_to_user_used_only_once
{
    public static void main(String[] args) {

        int arr[]={1,2,3};
        fun("",arr, 0,3); 
        
    }

    public static void fun(String ans , int arr [] ,int index, int amount) {


        if(amount==0)
        {
            System.out.println(ans);
            return ;
        }
        if(amount <0 || index==arr.length)
        {
            return ;
        }


        for(int i=index;i<arr.length;i++)
        {
            fun(ans+arr[i] , arr ,i+1 ,amount-arr[i]);
        }
        
    }
}
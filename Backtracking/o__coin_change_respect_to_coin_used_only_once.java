public class o__coin_change_respect_to_coin_used_only_once {

    public static void main(String[] args) {
        
        int arr[]={1,2,3};
        fun(arr , 3, 0, "");

    }

    public static void fun(int arr[] ,int rem , int index, String ans) {

        if(rem==0)
        {
            System.out.println(ans);
            return ;
        }

        if(rem<0 || index==arr.length)
        {
            return ;
        }



        fun(arr ,rem-arr[index] , index+1 , ans+arr[index]);
        fun(arr, rem, index+1, ans);
        
    }
    
}

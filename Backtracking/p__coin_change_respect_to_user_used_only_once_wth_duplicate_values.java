public class p__coin_change_respect_to_user_used_only_once_wth_duplicate_values {
    

    public static void main(String[] args) {

        // the array should be sorted

        int arr[]={2,2,2,3,5,6};
        fun(arr, "",0,6);

    }
    public static void fun(int arr [] , String ans , int index, int rem) {

        if(rem==0)
        {
            System.out.println(ans);
            return ;
        }
        if(rem<0 )
        {
            return ;
        }


        for(int i=index ;i <arr.length ;i++)
        {
            if(i>index && arr[i]==arr[i-1])
            {
                continue ;
            }
            else
            fun(arr ,ans+arr[i], i+1 , rem-arr[i]);


        }
        
    }
    
}

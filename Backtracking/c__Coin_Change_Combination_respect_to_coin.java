public class c__Coin_Change_Combination_respect_to_coin {
    public static void main(String[] args) {
        int arr[]={2,3,5,6};
        fun("",10,arr ,0);
        
    }
    public static void fun(String ans , int rem ,int [] arr , int index) {



        if(rem==0)
        {
            System.out.println(ans);
            return ;
        }

        // you can apply negative base case also
        
        if(rem<0 )
        {
            return ;
        }

        

        for(int i=index ;i<arr.length ;i++)
        {
            fun(ans+arr[i] , rem-arr[i] , arr, i);
        }



        
    }
}

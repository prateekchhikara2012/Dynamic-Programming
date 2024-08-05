public class f__Coin_Change_Combination_respect_to_box {

    public static void main(String[] args) {

        int arr[]={1,2,3};

        fun(arr, 4 ,"" ,0);
        
    }
    public static void fun(int [] arr,int rem , String ans , int index) {


        if(rem==0)
        {
            System.out.println(ans);
            return ;
        }
        if(rem <0 || index==arr.length)
        {
            return ;
        }


        // foyr contributing
        fun(arr ,rem -arr[index] ,ans+ arr[index] , index);
        //for non contributing
        fun(arr, rem , ans , index+1);
        
    }

    
}

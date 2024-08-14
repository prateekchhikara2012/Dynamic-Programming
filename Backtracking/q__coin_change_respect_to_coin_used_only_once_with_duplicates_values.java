public class q__coin_change_respect_to_coin_used_only_once_with_duplicates_values {
    
    public static void main(String[] args) {
        
        int arr[]={2,2,2,2,2,3,4};
        fun(arr,0,"",4,true);

    }
    public static void fun(int arr[] , int index , String ans , int rem, boolean val) {

        // include ke badd exclude ki call nhi janni chaiye 
        // agar jatti hai to sath me ye bhe check karo ki previous walla element same to nhi hai 
        // agar same hota hai to sirf exclude ki call jjayegi

        if(rem==0)
        {
            System.out.println(ans);
            return ;
        }
        if(rem<0 || arr.length==index)
        {
            return; 
        }




        if(val==false && arr[index]==arr[index-1])
        {
          
            fun(arr,index+1, ans ,rem , false);
        }
        else
        {
            fun(arr, index+1 , ans+arr[index],rem-arr[index] ,true);
            fun(arr, index+1, ans, rem, false);
        }







        

    }



}

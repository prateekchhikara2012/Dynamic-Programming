public class d__Coin_Change_Permutation {
    public static void main(String[] args) {
        
        int arr [] ={2,3,5,6};
        fun("", 10 ,arr);
        System.out.println(count  +"");
        
    }
    static int count=0;
    public static void fun(String ans , int rem ,int [] arr) {


        if(rem==0)
        {
            System.out.println(ans);
            count++;
            return ;
        }

        //else you can apply a negative base case
        

        for(int i=0;i<arr.length;i++)
        {
            if(rem>=arr[i])
            fun(ans+arr[i] ,rem-arr[i] ,arr);
        }
        
    }
    
}

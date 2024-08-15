import java.util.ArrayList;
import java.util.List;

public class s__coin_change_respect_to_coin_unlimited_flow_and_no_duplicates_and_using_arraylist {
    public static void main(String[] args) {
        
        int arr[]={2,3,5,6};
        int rem=6;

        List<List<Integer>> list=new ArrayList <>();
        List<Integer> temp=new ArrayList<>();

       fun(arr, rem, list, temp, 0);
       System.out.println(list);

    }
    public static void fun(int arr[] , int rem , List<List<Integer>> main_list, List<Integer> list ,int index   ) {


        if(rem==0)
        {
            main_list.add(new ArrayList<>(list) );
            return ;

        }
        if(rem<0|| index ==arr.length)
        {
            return ;
        }



        list.add(arr[index]);
        fun(arr, rem-arr[index] ,main_list ,list ,index);
        list.remove(list.size()-1);

        fun(arr, rem ,main_list ,list,index+1);
        
    }
}

import java.util.ArrayList;
import java.util.List;
public class r__coin_change_respect_to_user_unlimited_flow_and_no_duplicates_and_using_arraylist {

    //https://leetcode.com/problems/combination-sum/description/

    public static void main(String[] args) {

        int arr[]={2,3,6};

        List<List<Integer>> list=new ArrayList <>();
        List<Integer> temp=new ArrayList<>();
        fun(arr, 6, list, temp, 0);
        System.out.println(list);
       

    }


    public static void fun(int arr[] , int target ,  List<List<Integer>> list, List<Integer> temp , int index) {

        if(target==0){
            list.add(new ArrayList<>(temp));
            return;
        }

        if(target<0)
        {
            return ;
        }
        for(int i=index;i<arr.length;i++)
        {
            temp.add(arr[i]);

            fun(arr, target-arr[i] , list, temp , i);

            temp.remove(temp.size()-1);
        }

        
    }
    
}

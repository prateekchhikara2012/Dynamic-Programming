import java.util.List;
import java.util.ArrayList;
public class t__coin_change_respect_to_coin_used_only_once_with_duplicates_using_arraylist
{
    public static void main(String[] args) {
        //15 222 //24
        int arr[]={1,2,2,2,2,2,4,5};
        List<List<Integer>> main_list=new ArrayList<>();
        List<Integer> list=new ArrayList<>();

        int target=7;

        fun(arr, 0, target, main_list, list,true);
        System.out.println(main_list);




    }

    public static void fun(int arr[] , int index ,int rem , List<List<Integer>> main_list ,  List<Integer> list,boolean val) {


        if(rem==0)
        {
            main_list.add(new ArrayList<>(list));
            return ;
        }
        if(rem<0 || index==arr.length)
        {
            return ;
        }


        if(val==false && arr[index]==arr[index-1])
        {
            fun(arr, index+1, rem, main_list, list,false);
        }
        else{

            list.add(arr[index]);
            fun(arr, index+1 ,rem-arr[index] ,main_list ,list,true);
            list.remove(list.size()-1);


            fun(arr, index+1, rem, main_list, list,false);
        }
        
    }
}
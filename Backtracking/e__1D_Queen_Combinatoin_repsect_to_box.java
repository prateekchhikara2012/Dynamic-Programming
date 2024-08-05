public class e__1D_Queen_Combinatoin_repsect_to_box {

    public static void main(String[] args) {

        Boolean arr [] =new Boolean[7];

        fun("", 5 , 0 , 0, arr);

        System.out.println(count);
        
    }
    static int count=0;
    public static void fun(String ans ,int tq ,int pq ,int index , Boolean arr[]) {

        //First + ve bc hit karna hai nhai to galt hojayega


        if(tq==pq)
        {
            System.out.println(ans);
            count ++;
            return ;
        }

        if(index==arr.length)
        {
            return ;
        }



        // box 0 me a sakti hai
        arr[index]=true; //option explore karne ke leye condition
        fun(ans+" B"+index , tq, pq+1 , index+1 ,arr );
        arr[index]=false; // orginal state me atte hue
        


        // box 1
        fun(ans , tq ,pq ,index+1 ,arr);


        
    }
    
}

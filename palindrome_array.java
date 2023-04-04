import java.util.Arrays;
import java.util.Arrays.*;
class Palin_array{
    public static void main(String args[]){
     
    int num = 2;
    int arr[]={101,12};
    System.out.print(Arrays.toString(pal(num,arr)));

}
   
    static String [] pal(int num ,int arr[]){
           
        String arr2[]=new String[arr.length];
        for(int i=0;i<arr.length;i++){
            int n =arr[i];

          int sum=0,res,temp;
          temp = n;
          while(n>0){
              
             res= n%10;
             sum= sum*10+res;
             n = n/10;
        }


       
         if(temp ==sum){
           arr2[i]="PALINDROME";
        }
         else{
            arr2[i]="NOT";      
            }
        }
     
        
    
    return arr2;
    }
}

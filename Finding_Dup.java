# Java_Practice
Saved all the code related to java Practice
import java.util.*;
public class Finding_Dup{
    public static void main(String args[]){
       Scanner sc= new Scanner(System.in);
        System.out.print("Give the Input:");
       int n1 = sc.nextInt();
       int n2 = sc.nextInt();
       int n3 = sc.nextInt();
       int []arr =new int[n3];
     
       for(int i=0; i<n3;i++){
         arr[i]= sc.nextInt();
       }
        System.out.print(Arrays.toString(Duplicate_No(n1,n2,n3,arr)));

    }
    
    
    static int [] Duplicate_No (int n1,int n2, int n3,int arr[]){
    
       int [] arr2 = new int[arr.length];
       int j=0;
        for(int x=0;x<arr.length;x++){

            if(arr[x] >= n1 && arr[x] <n2){
                arr2[j]= arr[x];
                j++;
            }
            
            }
     return arr2;
    }

    
}
// 2
// 10
// 8
// 112
// 2
// 20
// 3
// 4
// 7
// 222
// 10
    

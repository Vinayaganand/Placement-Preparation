// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.ArrayList;
import java.util.Scanner;

class arrrev {
    static ArrayList<Integer> rev(int[] arr){
        ArrayList<Integer> res=new ArrayList<>();
        for(int i= arr.length-1;i>=0;i--){
            res.add(arr[i]);
        }
        return res;
    }
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("ENTER THE NO OF ELEMENTS:");
    int n=sc.nextInt();
    int[]arr=new int[n];
    System.out.println("ENTER THE ELEMENTS:");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.println("THE ARRAY ELEMENTS ARE:");
    for(int i=0;i<arr.length;i++){
        System.out.print(arr[i]+" ");
    }
    System.out.println("\n THE REVERSED ARRAY IS :"+rev(arr));
  }
}
     
    
        
    

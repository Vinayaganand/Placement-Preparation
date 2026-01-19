import java.util.Scanner;

class strrev{
    static String rev(String s){
        String res="";
        for(int i=s.length()-1;i>=0;i--){
            res+=s.charAt(i);
            
        }
        return res;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE NUMBER:");
        int n = sc.nextInt();
        String s=Integer.toString(n);
        System.out.println(rev(s));
        
    }
} 

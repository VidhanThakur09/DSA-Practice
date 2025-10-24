public class Reverse_String {
    // Brute Force Approach
     public static void helper (char str[]){
        char ans[] = new char[str.length];
        int n = str.length;
        for(int i = str.length-1;i>=0;i--){
            ans[n-1-i] = str[i];
        }
        for(char i:ans){
            System.out.println(i);
        }
    }
    // Optimal Approach
    public static void helper2(char[] str){
        int a = 0 , b = str.length-1;
        while(a<b){
            char temp = str[b];
            str[b] = str[a];
            str[a] = temp;
            a++;b--;
        }
        for(char i:str){
            System.out.print(i+" ");
        }
    }
}

import java.util.Scanner;

public class toggle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        boolean b[]=new boolean[n+1];
         for(int i=1;i>=n;i++){
            for (int j=i;j*i<=n;j++){
                if(b[j]==false){
                    b[j]=true;
                }else{
                    b[j]=false;
                }
            }
         }

    }
    
}

public class Main {
    public static void main(String[] args) {
        System.out.println(powIterativ(1,0));
        System.out.println(powIterativ(5,0));
        System.out.println(powIterativ(5,1));
        System.out.println(powIterativ(5,2));
        System.out.println(powRekursiv(1,0));
        System.out.println(powRekursiv(5,0));
        System.out.println(powRekursiv(5,1));
        System.out.println(powRekursiv(5,2));
        System.out.println(powIterativ(1,0));
        System.out.println(powIterativ(5,0));
        System.out.println(powIterativ(5,1));
        System.out.println(powIterativ(2,4));

    }

    public static int powIterativ(int x,int n){
        int res=1;
        for(int i=1;i<=n;i++)
            res*=x;
        return res;
    }

    public static int powRekursiv(int x,int n){
        if(n==0)
            return 1;
        else
            return x*powRekursiv(x,n-1);
    }
}















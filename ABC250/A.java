import java.util.*;

class A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       int H = sc.nextInt();
       int W = sc.nextInt();
       int R = sc.nextInt();
       int C = sc.nextInt();
       int res = 4;
       if(R==H) res--;
       if(R==1) res--;
       if(C==W) res--;
       if(C==1) res--;
        System.out.println(res);
    }
}
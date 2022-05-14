import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int W = sc.nextInt();

        int[] A = new int[N+1];
        A[0]=0;
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        boolean[] good = new boolean[W+1];
        int count = 0;
        for(int i = 1; i <= N; i++) {
            for(int j = 0; j <= N; j++){
                if(i == j) continue;
                for(int k = 0; k <= N; k++){
                    if(k==i || k == j && j != 0) continue;
                    int n = A[i] + A[j] + A[k];
                    if(n <= W &&!good[n]){
                        good[n] = true;
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}

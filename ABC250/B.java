import java.util.*;

class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        char p = '.';
        for (int i = 0; i < N*A; i++) {
            for (int j = 0; j < N*B; j++) {
                if ((i % (2 * A)) < A) {
                    if ((j % (2 * B)) < B) {
                        p = '.';
                    } else {
                        p = '#';
                    }
                } else{
                    if ((j % (2 * B)) < B) {
                        p = '#';
                    } else {
                        p = '.';
                    }
                }

                System.out.print(p);
            }
            System.out.println();
        }
    }
}
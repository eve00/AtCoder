import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();
        String res="";
        while(true){
            for(int i = 0; i < s.length(); i++){
                res += s.charAt(i);
                if(res.length() ==6){
                    System.out.println(res);
                    System.exit(0);
                }
            }
        }

    }
}

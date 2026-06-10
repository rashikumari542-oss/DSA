import java.util.*;
class Main{
    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        String s = sc.next();
        String t = sc.next();

        boolean pref = true;
        boolean suff = true;

        for(int i = 0;i<n ;i++){
            if(s.charAt(i) != t.charAt(i)){
                pref = false;
                break;
            }
        }


        for(int j = 0;j<m-n ;j++){
            if(s.charAt(j) != t.charAt(m-n+ j)){
                suff = false;
                break;
            }
        }
        if(pref && suff){
            System.out.println(0);
        }else if(pref){
            System.out.println(1);
        }else if(suff){
            System.out.println(2);
        }
            else{
                System.out.println(3);
            }

    }

}

package ACMCairo.Phase0;
//https://codeforces.com/group/MWSDmqGsZm/contest/223338/problem/D
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * not yet
 */
public class Xor {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
    long a= scan.nextLong();
    long b= scan.nextLong();
    long q= scan.nextLong();
        ArrayList<Long> arr=new ArrayList<>();
        arr.add(a);
        arr.add(b);
        for(int j=0,i=2;i<q;i++){
            arr.add(arr.get(j)^arr.get(j+1));

        }
        System.out.println(q>=3?arr.get(arr.size()-1):q==1?a:b);





//
//    if(q==1){
//        System.out.println(a);
//
//    }
//    else if(q==2){
//        System.out.println(b);
//
//    }
//    else {
//        System.out.println(a^b);
//
//    }



    }
public static long xor(long a, long b,long q){

    if(q==1){
       return a;

    }
    else if(q==2){
        return b;

    }
    else return xor(a,b,q-1)^xor(a,b,q-2);
}

}

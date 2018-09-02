// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class SeatReservation {
    public int solution(int N, String S) {
        // write your code in Java SE 8
       int numberOfFamilies = N*3;
       if(S.equals(null) || S.equals("")){
            return numberOfFamilies;
       }
       for(int i=1;i<=N;i++){
           if(S.contains(i+"A") || S.contains(i+"B") || S.contains(i+"C")){
               numberOfFamilies--;
           }
           if(S.contains(i+"D") || S.contains(i+"E") || S.contains(i+"F") || S.contains(i+"G")){
               numberOfFamilies--;
           }
           if(S.contains(i+"H") || S.contains(i+"J") || S.contains(i+"K")){
               numberOfFamilies--;
           }
       }
       return numberOfFamilies;
    }
}

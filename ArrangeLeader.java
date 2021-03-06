// you can also use imports, for example:
import java.util.*;
import java.util.stream.*;
// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class ArrangeLeader {
    public int[] solution(int K, int M, int[] A) {
        // write your code in Java SE 8
        List<Integer> allLeaders = new ArrayList<Integer>();
        int size = A.length;
        for(int i=0;i<size-K+1;i++){
            for(int j=i;j<=k+i-1;j++){
                A[j]++;
            }
            allLeaders.addAll(calculateLeader(A,M,size));
            for(int j=i;j<=k+i-1;j++){
                A[j]--;
            }
        }
        return allLeaders.stream().mapToInt(Integer::intValue).toArray();
    }
    
    public List<Integer> calculateLeader(int[] A, int M, int size){
        int minOccur = size/2 + 1;
        List<Integer> eachOccurence = new ArrayList<Integer>();
        for(int i=0;i<M;i++){
            eachOccurence.add(0);
        }
        for(int j=0;j<size;j++){
            eachOccurence.set(A[j],eachOccurence.get(A[j])+1);
        }
        List<Integer> leaders = IntStream.range(0,eachOccurence.size())
			.filter(i -> eachOccurence.get(i)>=minOccur)
			.mapToObj(Integer::valueOf)
			.sorted()
			.collect(Collectors.toList());
		
        
        return leaders;                
    }
}

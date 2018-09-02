// you can also use imports, for example:
// import java.util.*;

// you can write to stdout for debugging purposes, e.g.
// System.out.println("this is a debug message");

class WordProcessing {
    public int solution(String S) {
        // write your code in Java SE 8
        String[] ops = S.split(" ");
        List<Integer> numStack = new ArrayList<Integer>();
        for(String oper : ops){
            numStack = performOp(oper,numStack);
            if(performOp().isEmpty())
                return -1;
        }
        return numStack.get(numStack.size()-1);
        
    }
    
    public List<Integer> performOp(String s, List<Integer> incomingStack){
        switch(str){
            case "DUP":
                incomingStack.add(incomingStack.get(incomingStack.size()-1));
                break;
            case "POP":
                if(incomingStack.size()==1 || incomingStack.size()==0)
                    return new ArrayList<Integer>();
                incomingStack.remove(incomingStack.get(incomingStack.size()-1));
                break;
            case "+":
                if(incomingStack.size()<2)
                    return new ArrayList<Integer>();
                incomingStack.add(incomingStack.remove(incomingStack.size()-1)+incomingStack.remove(op.size()-1));
                break;
            case "-":    
                if(incomingStack.size()<2)
                    return new ArrayList<Integer>();
                incomingStack.add(incomingStack.remove(incomingStack.size()-1)+incomingStack.remove(op.size()-1));
                if(incomingStack.get(incomingStack.size()-1) < 0)
                    return new ArrayList<Integer>();
                break;
            default:
                incomingStack.add(Integer.valueOf(s));
        }
        return incomingStack;
    }
}

package strings_day_2;

import java.util.*;

public class GenerateParentheses {
    public List<String> generateParenthesis(int n) {
        List<String>result=new ArrayList<>();
        solve("",0,0,n,result);
        return result;
    }
    private void solve(String curr,int open,int close,int total,List<String>ans){
        if(curr.length()==2*total){
            ans.add(curr);
        }
        if(open<total){
            solve(curr+"(",open+1,close,total,ans);
        }
        if(close<open){
            solve(curr+"(",open,close+1,total,ans);
        }
    }

    public static void main(String[] args) {

    }
}

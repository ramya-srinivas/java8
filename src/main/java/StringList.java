import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class StringList {
    public List<String> palCalculate(List<String> a){
        List<String> res = check(a,(String st) -> palindrome(st));
        return res;
    }
    private List<String> check(List<String> a, Predicate<String> predicate){
        List<String> res=new ArrayList<>();
        for(String st: a){
            if(predicate.test(st)){
                res.add(st);
            }
        }
        return res;
    }
    private boolean palindrome(String str){
        int i=0,j=str.length()-1;
        while(i<j){
            if(str.charAt(i)!=str.charAt(j))
                return false;
            i++;
            j--;
        }
        return true;
    }
}
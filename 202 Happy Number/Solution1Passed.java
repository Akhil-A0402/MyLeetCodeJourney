// two pointer
// fast and slow approach

public class Solution1Passed {
    public int sq(int n){
        int ans = 0;
        
        while(n>0){
            int rem = n%10;
            n/=10;
            ans += rem * rem;
        }
        return ans;
    }
    
    public boolean isHappy(int n) {
        int s =n, f = n;
        do {
            s = sq(s);
            f = sq(sq(f));
        } while((s!=f) && (f!=1));
            
        return f==1;
    }
}


class Solution1 {
    public int reverse(int x) {
        int result = 0;     
        int prev = 0;    
        
        while (x != 0) {
            int cur = x % 10;
            System.out.println("cur="+cur);
            x /= 10;
            System.out.println("Number is X"+x);
            result = result * 10 + cur;
           System.out.println("Result is "+result);
            if ((result- cur) / 10 != prev) 
                return 0;
           
            prev = result;
        }
        return result;
    }
}

class MainReverse{
    public static void main(String args[])
    {
        Solution1 s = new Solution1();
        System.out.println("The REverse String is :"+s.reverse(123));
    }
}
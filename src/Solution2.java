
class Solution2 {
    public boolean isPalindrome(int x) {
        int r,sum=0,temp;  
        int n=x;

  temp=n;  
  while(n>0){  
   r=n%10;  //getting remainder
   sum=(sum*10)+r;  
   n=n/10;  
  }  
  if(temp==sum) 
  {
        System.out.println("The Number is Palindrome : " +sum);
        return true;
  }
  else  
  {
      System.out.println("The Number is Not Palindrome : " +sum);
       return false; 
    }
}
}

class MainPalindrome
{
    
    public static void main(String args[])
   {
     
        Solution2 s = new Solution2();
        System.out.println(s.isPalindrome(121));
   }
}
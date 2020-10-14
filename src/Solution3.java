
class Solution3 {
    public int romanToInt(String s) {
      if(s == null){
        return 0;
    }
    
    int length = s.length();
    System.out.println("Lenth :"+length);
    int sum = 0;
    int pre = 0;
    
    for(int i = length - 1; i >= 0; i--){
        int cur = romanTable(s.charAt(i));
        System.out.println("Cur :"+cur);
        if(i == length - 1){
            sum = sum + cur;
            System.out.println("Sum :"+sum);
        }else{
           if(cur < pre){
               sum = sum - cur;
               System.out.println("Sum :"+sum);
           }else{
               sum = sum + cur;
               System.out.println("Sum :"+sum);
           }
        }
        pre = cur;
        System.out.println("Pre :"+pre);
    }
    
    return sum;  
    }

    public int romanTable(char c){
    int num = 0;
    switch(c){
        case 'I':
            num = 1;
            break;
        case 'V':
            num = 5;
            break;
         case 'X':
            num = 10;
            break;
         case 'L':
             num = 50;
             break;
         case 'C':
             num = 100;
             break;
         case 'D':
             num = 500;
             break;
         case 'M':
             num = 1000;
             break;
         default:
             num = 0;
             break;
    }
    return num;
    }
}
class MainRomantoInteger{
	
	public static void main(String args[]) {
	
		Solution3 s = new Solution3();
		System.out.println(s.romanToInt("III"));
	}
}
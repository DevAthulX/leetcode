class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
       String b="";
       for(char c:s.toCharArray()){
        if((int)c>=48&&(int)c<=57||(int)c>=97&&(int)c<=122) 
        b+=c;
       } 
       String reversed=new StringBuffer(b).reverse().toString();
       return b.equals(reversed);
    }
}
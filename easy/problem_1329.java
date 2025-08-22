class Solution {
    
    public int maximum69Number (int num) {
       String n = Integer.toString(num);
       for(int i=0;i<n.length();i++){
        if(n.charAt(i)=='6')
                        return Integer.parseInt(n.substring(0, i) + "9" + n.substring(i + 1));
       }
       return Integer.parseInt(n);
    }
}
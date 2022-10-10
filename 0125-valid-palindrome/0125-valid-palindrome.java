class Solution {
    public boolean isPalindrome(String s) {
        
        String t = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        
        int start = 0;
        int end = t.length()-1;
        
        while(start<end){
            
            if(t.charAt(start)!=t.charAt(end))
                return false;
                
            start++;
            end--;
        }
        return true;
    }
}
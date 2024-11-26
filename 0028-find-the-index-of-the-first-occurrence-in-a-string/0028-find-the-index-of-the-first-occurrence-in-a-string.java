class Solution {
    public int strStr(String haystack, String needle) {
      
        for(int i=0;i<haystack.length();i++){
            if(haystack.charAt(i)==needle.charAt(0)){
                int j=0; //this is for needle to loop the balance char
                int k=i; //this is for haystack to loop the balance 
                
                while(j<needle.length() && k<haystack.length() && haystack.charAt(k)==needle.charAt(j)){
                    j++;
                    k++;
                    if(j==needle.length()){
                        return i;
                    }
                }
            }
        }
        return -1;
    }
}
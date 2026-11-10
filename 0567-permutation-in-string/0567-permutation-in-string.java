class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int len1= s1.length();
        int len2= s2.length();
        if(len2<len1){
            return false;
        }

        int [] freq1= new int[26];
        int [] freq2= new int[26];
        for(int i=0;i<len1;i++){
            freq1[s1.charAt(i)-'a']++;
        }
        int left = 0 ;
        for(int right= 0 ;right<len2;right++){
           freq2[s2.charAt(right)-'a']++;
           if(right-left+1>len1){
            freq2[s2.charAt(left)-'a']--;
            left++;
        }
        if(right-left+1==len1){
            if(matches(freq1,freq2)){
                return true ;
            }
        }
           }
           return false ;

        }
        private boolean matches(int[] arr1,int[] arr2){
            for(int i = 0 ; i<26;i++){
                 if (arr1[i] != arr2[i]){
                    return false ;
                 }
            }
            return true ;
        }
        
    }

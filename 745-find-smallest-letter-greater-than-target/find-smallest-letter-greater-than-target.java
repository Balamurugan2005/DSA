class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int target1=(int)target;
        int n=letters.length;


        for (int i=0;i<n;i++){
            if((int)letters[i]>target1){
                return letters[i];
            }
        }
        return letters[0];
        
    }
}
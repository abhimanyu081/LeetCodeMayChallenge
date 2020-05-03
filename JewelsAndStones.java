class Solution {
    public int numJewelsInStones(String J, String S) {
        int count=0;
        for(int i=0;i<S.length();i++){
                int index=J.indexOf(S.charAt(i));           
            if(index!=-1){
                count++;
            }
        }
        
        return count;
        
    }
}

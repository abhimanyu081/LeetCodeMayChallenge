class Solution {
    public int findComplement(int num) {
        
        String binNum = decimalToBinary(num);
        //System.out.println(binNum);
        char[] complementBinNum = inverseBits(binNum);
       //System.out.println(complementBinNum);
        int complementNumber = binaryToDecimal(complementBinNum);
        
        return complementNumber;
        
    }
    
    public String decimalToBinary(int n){
        
        StringBuilder sb = new StringBuilder();
        if(n==0)return "0";
        while(n!=0){
            int quotient = n/2;
            int rem = n%2;
            sb.append(rem);
            n=quotient;
        }
        
        return sb.reverse().toString();
        
    }
    
    public char[] inverseBits(String num){
        
        char[] arr = new char[num.length()];
        int j=0;
        for(int i=0;i<num.length();i++){
            char c = num.charAt(i);
            if(c=='0'){
                arr[j++]='1';
            }else {
                arr[j++]='0';
            }
        }
        
        return arr;
    }
    
    public int binaryToDecimal(char[] numArr){
        int num =0;
        for(int i=0;i<numArr.length;i++){
            int a = numArr[i] - '0';
            int p = numArr.length-1-i;
            num+=(Math.pow(2,p)*a);
        }
        return num;
    }

}

class Solution {
    public int maxDepth(String s) {
        int a=s.length();
        int no=0;
        int m=0;
         for( int i=0;i<a;i++){
           if( s.charAt (i)=='('){
           no++;
           m= Math.max(m,no);
         }
           else if (s.charAt(i) ==')'){
           no--;
           }
        }

         return m;         

        
    }

}
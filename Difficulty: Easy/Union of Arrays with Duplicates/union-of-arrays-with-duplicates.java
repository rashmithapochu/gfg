class Solution {
    public static ArrayList<Integer> findUnion(int[] a, int[] b) {
        // code here
        HashSet<Integer> hs = new HashSet<>();
        int n=a.length;
        int m=b.length;
        if(n<m){
            int i=0;
            for(;i<n;i++){
                hs.add(a[i]);
                hs.add(b[i]);
            }
            for(;i<m;i++){
                hs.add(b[i]);
            }
        }
        else{
            int i=0;
            for(;i<m;i++){
                hs.add(a[i]);
                hs.add(b[i]);
            }
            for(;i<n;i++){
                hs.add(a[i]);
            }
        }
        return new ArrayList<Integer>(hs);
    }
}
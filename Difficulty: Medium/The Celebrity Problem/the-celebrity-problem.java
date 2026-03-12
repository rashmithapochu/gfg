class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        Stack<Integer> st = new Stack<>();
        // Step -1 push all people
        for(int i = 0; i < n; i++) {
            st.push(i);
        }
        // step - 2 eliminate the non-celebrities
        while(st.size() > 1) {
            int a = st.pop();
            int b = st.pop(); 
            if(mat[a][b] == 1) {
                st.push(b);
            } else {
                st.push(a);
            }
        }
        // validate(verify) the candidate
        // condition 1: Celebrity doesn't know anyone
        // condition 1: Celebrity know anyone
        int candidate = st.pop(); // candidate =1
        for(int i = 0; i < n; i++) {
            if(i != candidate) {
                if(mat[candidate][i] == 1 || mat[i][candidate] == 0) {
                    return -1;
                }
            }
        }
        return candidate;
    }
}
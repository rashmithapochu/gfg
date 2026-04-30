class Solution {
    String merge(String S1, String S2) {
        // code here
        int n = 0;
        StringBuilder r = new StringBuilder();

        if (S1.length() == 0) {
            r.append(S2);
            return r.toString();
        }
        if (S2.length() == 0) {
            r.append(S1);
            return r.toString();
        }

        for (int i = 0; i < S1.length() + S2.length(); i++) {
            if (n < S1.length()) {
                r.append(S1.charAt(n));
            }
            if (n < S2.length()) {
                r.append(S2.charAt(n));
            }
            n++;
        }

        return r.toString();
        
        /*StringBuilder result = new StringBuilder();
        int i = 0, j = 0;
        while(i < S1.length() && j < S2.length()) {
            result.append(S1.charAt(i++));
            result.append(S2.charAt(j++));

        }
        while(i < S1.length()){
            result.append(S1.chatAt(i++));
        }
        while(i < S2.length()){
            result.append(S2.chatAt(j++));
        }*/
        
    }
}
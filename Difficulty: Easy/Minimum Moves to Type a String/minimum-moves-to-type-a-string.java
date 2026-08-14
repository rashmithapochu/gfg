class Solution {
    public int minMoves(String s) {
        int count = 0, r = 0, c = 0;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            int row, col;
            if (ch == 'z') { row = 5; col = 0; }
            else { int idx = ch - 'a'; row = idx / 5; col = idx % 5; }
            count += Math.abs(r - row) + Math.abs(c - col) + 1;
            r = row; c = col;
        }
        return count;
    }
}

/*
Definition for Node
class Node {
    public int data;
    public Node left;
    public Node right;

    public Node(int val) {
        data = val;
        left = right = null;
    }
};
*/

class Solution {
    public List<Integer> noSibling(Node root) {
        // code here
        List<Integer> list = new ArrayList<>();
        find_siblings(root, list);
        if(list.isEmpty()){
            list.add(-1);
        }else{
            Collections.sort(list);
        }
        return list;
    }
    private void find_siblings(Node node, List<Integer> list){
        if(node == null) return;
        if(node.left != null && node.right == null){
            list.add(node.left.data);
        }
        if(node.right != null && node.left == null){
            list.add(node.right.data);
        }
        find_siblings(node.left, list);
        find_siblings(node.right, list);
    }
}
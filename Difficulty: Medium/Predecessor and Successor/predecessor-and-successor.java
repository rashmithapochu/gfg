/* Structure of a Binary Search Tree node
class Node {
    int data;
    Node left, right;
    Node(int x) {
        data = x;
        left = right = null;
    }
} */
/*class Solution {
    Node pred = null, suc = null;
    public ArrayList<Node> findPreSuc(Node root, int key) {
        pred = null;
        suc = null;
        findPredSucUtil(root, key);
        ArrayList<Node> result = new ArrayList<>();
        result.add(pred);
        result.add(suc);
        return result;
    }
    private void findPredSucUtil(Node root, int key) {
        if (root == null) return;

        if (root.data == key) {
            if (root.left != null) {
                Node temp = root.left;
                while (temp.right != null) temp = temp.right;
                pred = temp;
            }
            if (root.right != null) {
                Node temp = root.right;
                while (temp.left != null) temp = temp.left;
                suc = temp;
            }
        } else if (root.data > key) {
            suc = root;
            findPredSucUtil(root.left, key);
        } else {
            pred = root;
            findPredSucUtil(root.right, key);
        }
    }
}*/
class Solution {
    Node pred = null, suc = null;
    public ArrayList<Node> findPreSuc(Node root, int key) {
        Node curr = root;
        while (curr != null) {
            if (curr.data == key) {
                if (curr.left != null) {
                    Node temp = curr.left;
                    while (temp.right != null) {
                        temp = temp.right;
                    }
                    pred = temp;
                }
                if (curr.right != null) {
                    Node temp = curr.right;
                    while (temp.left != null) {
                        temp = temp.left;
                    }
                    suc = temp;
                }
                break;
            } else if (curr.data > key) {
                suc = curr;
                curr = curr.left;
            } else {
                pred = curr;
                curr = curr.right;
            }
        }
        ArrayList<Node> res = new ArrayList<>();
        res.add(pred);
        res.add(suc);
        return res;
    }
}



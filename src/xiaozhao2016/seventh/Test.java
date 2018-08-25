package xiaozhao2016.seventh;

/**
 * @Description: 二叉树的序列化
 * @Author: daihong
 * @Date: Created in  2018/8/25
 */
public class Test {
   static class TreeNode {
       int val = 0;
       TreeNode left = null;
       TreeNode right = null;

       public TreeNode(int val) {
           this.val = val;
       }
   }
    public static void main(String[] args){
        TreeNode treeNode1 = new TreeNode(1);
        TreeNode treeNode2 = new TreeNode(2);
        TreeNode treeNode3 = new TreeNode(3);
        TreeNode treeNode4 = new TreeNode(4);
        TreeNode treeNode5 = new TreeNode(5);
        TreeNode treeNode6 = new TreeNode(6);
        TreeNode treeNode7 = new TreeNode(7);
        treeNode1.left = treeNode2;
        treeNode1.right = treeNode3;
        treeNode2.left = treeNode4;
        treeNode2.right = treeNode5;
        treeNode3.left = treeNode6;
        treeNode3.right = treeNode7;
        System.out.println(toSequence(treeNode1));
    }
    public static String toSequence(TreeNode root) {
        // write code here
        String str = "";
        if (root==null){
            return "";
        }
        str ="(";
       str += toSequence(root.left);
       str+= toSequence(root.right);
       str+=")";
       return str;
    }
}

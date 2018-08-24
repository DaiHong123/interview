package fifth;

/**
 * @Description: 折纸问题
 * @Author: daihong
 * @Date: Created in  2018/8/24
 */
public class Test {
    static class BinaryTreeNode{
        String string;
        BinaryTreeNode left;
        BinaryTreeNode right;
        BinaryTreeNode(String string){
            this.string = string;
            this.left = null;
            this.right = null;
        }
    }
    public static void main(String[] args){
        String[] strings = foldPaper(5);
        for (String s:strings){
            System.out.println(s);
        }
    }
    public static String[] foldPaper(int n){
        if (n==0) return null;
        BinaryTreeNode binaryTreeNode = new BinaryTreeNode("1");
        sort1(binaryTreeNode,n-1);
        StringBuilder stringBuilder = new StringBuilder();
        sort1(binaryTreeNode,stringBuilder);
        String s = stringBuilder.toString();
        String[] strings = s.split(",");
        return strings;
    }
    public static void sort1(BinaryTreeNode binaryTreeNode,int n){
       if (n<=0) return;
        BinaryTreeNode binaryTreeNode1 = new BinaryTreeNode("down");
        binaryTreeNode.left = binaryTreeNode1;
        binaryTreeNode.right = binaryTreeNode1;
        sort1(binaryTreeNode.left,n-1);
        sort1(binaryTreeNode.right,n-1);
    }
    public static void sort1(BinaryTreeNode binaryTreeNode,StringBuilder stringBuilder){
        if (binaryTreeNode==null) return;
        sort1(binaryTreeNode.left,stringBuilder);
        sort1(binaryTreeNode.right,stringBuilder);
        if(binaryTreeNode.left==null&&binaryTreeNode.right==null){
            binaryTreeNode.string = "down";
        }
        else if (binaryTreeNode.left!=null&&binaryTreeNode.right!=null){
            binaryTreeNode.string = "up";
        }
        stringBuilder.append(binaryTreeNode.string+",");
    }
}

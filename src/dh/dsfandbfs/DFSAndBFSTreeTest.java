package dh.dsfandbfs;

import java.util.*;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * @Description: 树的深度和广度优先算法
 * @Author: daihong
 * @Date: Created in  2018/10/20
 */
public class DFSAndBFSTreeTest {
    static class Tree{
        private Tree left;
        private Tree right;
        private int data;
        public Tree(int data){
           this.left = null;
           this.right = null;
           this.data = data;
        }
    }
    public static void main(String[] args){
        Queue<Integer> queue = new PriorityQueue<>();
        Tree tree1 = new Tree(9);
        Tree tree2 = new Tree(7);
        Tree tree3 = new Tree(11);
        Tree tree4 = new Tree(6);
        Tree tree5 = new Tree(8);
        Tree tree6 = new Tree(10);
        Tree tree7 = new Tree(12);
        tree1.left = tree2;
        tree1.right = tree3;
        tree2.left = tree4;
        tree2.right = tree5;
        tree3.left = tree6;
        tree3.right = tree7;
        List<Integer> dfs = new ArrayList<>();
        List<Integer> bfs = new ArrayList<>();
        dfsTree(tree1,dfs);
        dfs.forEach(name-> System.out.println(name));
        System.out.println("=========================");
        bfsTree(tree1,bfs);
        bfs.forEach(name-> System.out.println(name));

    }

    public static void dfsTree(Tree tree,List<Integer> dfsTree){
        if (tree==null){
            return;
        }
        dfsTree.add(tree.data);
        dfsTree(tree.left,dfsTree);
        dfsTree(tree.right,dfsTree);
    }

    public static void bfsTree(Tree tree,List<Integer> bfsTree){
        Deque<Tree> queue = new LinkedList<>();
        if(tree==null){
            return;
        }
        queue.offer(tree);
        while (!queue.isEmpty()){
            Tree tree1 = queue.peek();
            if(tree1!=null){
                bfsTree.add(tree1.data);
            }
            if(tree1!=null&&tree1.left!=null){
                queue.offer(tree1.left);
            }
            if(tree1!=null&&tree1.right!=null){
                queue.offer(tree1.right);
            }
            queue.poll();
        }
    }
}

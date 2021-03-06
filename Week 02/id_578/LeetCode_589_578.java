package com.hand.week2;

import java.util.ArrayList;
import java.util.List;

/**
 * @description:
 * @version: 1.0
 * @author: xiantao.han@hand-china.com
 * @Date: 2019/10/27
 */
public class LeetCode_589_578 {
    List<Integer> result = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        helper(root);
        return result;
    }

    private void helper(Node root) {
        if(root==null) return ;
        result.add(root.val);
        for(int i=0;i<root.children.size();++i){
            helper(root.children.get(i));
        }
    }

    class Node {
        public int val;
        public List<Node> children;

        public Node() {
        }

        public Node(int _val, List<Node> _children) {
            val = _val;
            children = _children;
        }
    }
}

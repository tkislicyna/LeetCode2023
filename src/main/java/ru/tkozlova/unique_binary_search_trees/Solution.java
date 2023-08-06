package ru.tkozlova.unique_binary_search_trees;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    public List<TreeNode> generateTrees(int n) {
        Set<Integer> numbers = new HashSet<>();

        for (int i = 1; i <= n; i++) {
            numbers.add(i);
        }
        var result = buildTree(numbers);

        result.stream().forEach(this::print);

        return result;
    }

    private List<TreeNode> buildTree(Set<Integer> numbers) {

        if (numbers.isEmpty()) {
            List<TreeNode> list = new ArrayList<>();
            list.add(null);
            return list;
        }

        List<TreeNode> result = new ArrayList<>();

        Set<Integer> rightList = new HashSet<>(numbers);
        Set<Integer> leftList = new HashSet<>();

        for (var center : numbers) {

            rightList.remove(center);

            List<TreeNode> rightListNodes = buildTree(rightList);
            List<TreeNode> leftListNodes = buildTree(leftList);

            for (var rightTree : rightListNodes) {
                for (var leftTree : leftListNodes) {
                    result.add(new TreeNode(center, leftTree, rightTree));
                }
            }

            leftList.add(center);
        }

        return result;
    }

    private void print(TreeNode node) {
        System.out.println(getSequence(node));
    }

    private List<String> getSequence(TreeNode node) {

        if (node == null) {
            return List.of("null");
        }

        if (node.left == null && node.right == null) {
            return List.of(String.valueOf(node.val));
        }

        List<String> list = new ArrayList<>();
        list.add(String.valueOf(node.val));
        list.addAll(getSequence(node.left));
        list.addAll(getSequence(node.right));

        return list;
    }

}
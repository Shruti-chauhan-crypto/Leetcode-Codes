/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    public List<Integer> distanceK(TreeNode root, TreeNode target, int k) {

        if(root==null) return new ArrayList<>();

        HashMap<TreeNode, TreeNode> parents = new HashMap<>();
        findParent(root, parents);

        Queue<TreeNode> q = new LinkedList<>();
        HashSet<TreeNode> vis = new HashSet<>();

        q.add(target);
        vis.add(target);
        int curr = 0;

        while(!q.isEmpty()){
            int sz = q.size();
            if(curr==k) break;
            curr++;

            for(int i=0;i<sz;i++){
                TreeNode node = q.poll();

                if(node.left != null && !vis.contains(node.left)){
                    q.add(node.left);
                    vis.add(node.left);
                }

                if(node.right != null && !vis.contains(node.right)){
                    q.add(node.right);
                    vis.add(node.right);
                }

                if(parents.containsKey(node) && !vis.contains(parents.get(node))){
                    q.add(parents.get(node));
                    vis.add(parents.get(node));
                }
            }
        }

        List<Integer> ans = new ArrayList<>();
        while(!q.isEmpty()){
            ans.add(q.poll().val);
        }

        return ans;
    }

    public void findParent(TreeNode root, HashMap<TreeNode, TreeNode> parents){
        
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()){

            TreeNode node = q.poll();

            if(node.left != null){
                parents.put(node.left, node);
                q.add(node.left);
            }

            if(node.right != null){
                parents.put(node.right, node);
                q.add(node.right);
            }            
        }
    }
}
class Solution {
    List<List<Integer>> l1=new ArrayList<>();
    public void dfs(TreeNode root, int t,List<Integer> ans){
        if(root==null){
            return;
        }
        if(t-root.val==0 && root.left==null && root.right==null){
            List<Integer> l2=new ArrayList<>(ans);
            l2.add(root.val);
            l1.add(l2);
            return;
        }
        ans.add(root.val);
        dfs(root.left,t-root.val,ans);
        dfs(root.right,t-root.val,ans);
        ans.remove(ans.size()-1);
    }
    public List<List<Integer>> pathSum(TreeNode root, int t) {
        if(root==null){
            return l1;
        }
        dfs(root,t,new ArrayList<>());
        return l1;
    }
}

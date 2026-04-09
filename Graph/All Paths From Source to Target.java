class Solution {
    List<List<Integer>> result=new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> path=new ArrayList<>();
        path.add(0);
        backtrack(graph,path,0);
        return result;
    }
    public void backtrack(int[][] graph,List<Integer> path,int node){
        if(node==graph.length-1){
            result.add(new ArrayList<>(path));
            return;
        }
        for(int next:graph[node]){
            path.add(next);
            backtrack(graph,path,next);
            path.remove(path.size()-1);
        }
    }
}

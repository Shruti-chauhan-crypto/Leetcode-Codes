class Solution {

    List<List<Integer>> list = new ArrayList<>();
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        for(int i=0; i<n; i++){
            list.add(new ArrayList<>());
        }

        for(int a[]:edges){
            int u = a[0];
            int v = a[1];
            list.get(u).add(v);
            list.get(v).add(u);
        }

        return BFS(source, destination);
    }

    public boolean BFS(int source, int d){

        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        q.add(source);
        while(!q.isEmpty()){
            // remove
            int rv = q.poll();

            // ignore if already visited
            if(visited.contains(rv)) continue;

            // mark visited
            visited.add(rv);

            // self work
            if(rv==d) return true;

            // add unvisited
            for(int nbr : list.get(rv)){
                if(!visited.contains(nbr)){
                    q.add(nbr);
                }
            }
        }

        return false;
    }
}
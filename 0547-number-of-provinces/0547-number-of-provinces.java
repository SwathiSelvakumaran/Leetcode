class Solution {
    public int findCircleNum(int[][] isConnected) {
        int province = 1;
        disjointSet ds = new disjointSet(isConnected.length);
        for(int i=0;i<isConnected.length;i++){
            for(int j=0;j<isConnected[i].length;j++){
                if(i!=j && isConnected[i][j]==1){
                    ds.union(i,j);
                }
            }
        }
        
        return ds.count();
    }
}

class disjointSet{
    
    private int count;
    private int[] root;
    
    public disjointSet(int size){
        count = size;
        root =new int[size];
        for(int i=0;i<size;i++){
            root[i]=i;
        }
    }
    
    public int find(int x){
         while (x != root[x]) {
            x = root[x];
        }
        return x;
    }
    
    public void union(int x, int y){
        int rootX = find(x);
        int rootY = find(y);
        if (rootX != rootY) {
            root[rootY] = rootX;
        } else{
            return;
        }
        --count;
    }
    
    public boolean connected(int x,int y){
        return find(x)==find(y);
    }
    public int count(){
        return count;
    }
}
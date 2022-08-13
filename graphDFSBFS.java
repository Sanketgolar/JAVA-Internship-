import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

class Graph{
    ArrayList<Integer>[] adj;
    int v;
    public Graph(int v){
        this.v=v;
        adj=new ArrayList[v];
        for(int i=0;i<v;i++){

            adj[i]=new ArrayList<>();
        }
    }
    public void addEdge(int x,int y){
        adj[x].add(y);
    }
    public void BFS(int s){
        boolean vis[]=new boolean[v];
        Queue<Integer> q=new LinkedList<>();
        q.add(s);
        vis[s]=true;
        while (!q.isEmpty()){
            int gh=q.poll();
            System.out.println(gh);
            for (int i:adj[gh]){
                if(vis[i]==false)
                {q.add(i);
                vis[i]=true;}
            }
        }
    }

    public void DFS1(int i,boolean vis[]){
        vis[i]=true;
        System.out.println(i);
        for (int z:adj[i]){
            if(vis[z]==false){
                DFS1(z,vis);
            }
        }
    }

    public void DFS(int i){
        System.out.println("DFS:");
        boolean vis[]=new boolean[v];
        DFS1(i,vis);
    }
    public static void main(String[] args){
    Graph g=new Graph(4);
        g.addEdge(0,1);
        g.addEdge(0,2);
        g.addEdge(1,2);
        g.addEdge(2,0);
        g.addEdge(2,3);
        g.addEdge(3,3);
        g.BFS(2);
        g.DFS(2);

    }

}

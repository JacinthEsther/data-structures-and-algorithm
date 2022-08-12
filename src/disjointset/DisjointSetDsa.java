package disjointset;

public class DisjointSetDsa {

    public static void main(String[] args) {
        int [] array = {1,2,3,4,5,6,7,8};
        unionByWeight(4,5, array);
    }
    static int find(int v, int [] parent){
        if (parent[v] < 0) return v;
        return  find(parent[v],parent);
    }

    static void unionByWeight(int u, int v, int [] parent){
        int pu = find(u,parent);
        int pv = find(v, parent);

        if (pu!= pv){
            if (parent[pu] < parent[pv]){
                parent[pu]+= parent[pv];

                parent[pv] = pu;
            }
            else{
                parent[pv] += parent[pu];
                parent[pu] = pv;
            }
        }
    }
}

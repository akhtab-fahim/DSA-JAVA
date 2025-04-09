
import java.util.LinkedList;

public class Implementation {
    static class HashMap<K,V> {

        private class Node{
            K key;
            V value;

            public Node(K key,V vakue){
                this.key = key;
                this.value = vakue;
            }
        }
    }

    private int n;
    private int N;
    private LinkedList<Node> buckets[];

    @SuppressWarnings("uncheked");
    public HashMap(){
        this.N = 4;
        this.buckets = new LinkedList[4];
        for(int i = 0 ;i<4;i++){
            this.buckets[i] = new LinkedList<>();
        }
    }
}

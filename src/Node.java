public class Node {
        int nodeID;
        String name;
        boolean visited;
        public Node(){}

        public Node(int nodeID,String name){
            this.nodeID=nodeID;
            this.name=name;
            this.visited=false;
        }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {

    }
}

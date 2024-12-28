import java.util.*;

public class Graph {
    HashMap<Node, LinkedList<Node>> adjacencyMap;
    boolean directed=false;
    public Graph(){

        adjacencyMap=new HashMap<Node, LinkedList<Node>>();
    }
    public void insertEdge(Node source, Node target) {
    if(!adjacencyMap.keySet().contains(source)){
        adjacencyMap.put(source,null);
    }
    if(!adjacencyMap.keySet().contains(target)){
            adjacencyMap.put(target,null);
    }
        LinkedList<Node> temp=adjacencyMap.get(source);
        if(temp == null){
            temp = new LinkedList<>();
        }
        temp.add(target);
        adjacencyMap.put(source, temp);
    }
    public boolean hasEdge(Node source, Node target){
        return adjacencyMap.containsKey(source) && adjacencyMap.get(source) != null && adjacencyMap.get(source).contains(target);
    }

    public void traverse(){
        for(Node root: adjacencyMap.keySet()){
            System.out.print("Traversing from node " + root.name + " - ");
            LinkedList<Node> vertices = adjacencyMap.get(root);
            if(vertices != null) {
                for (Node adjacent : adjacencyMap.get(root)){
                    System.out.print(adjacent.name);
                }
            }
            System.out.println();
        }


    }
    public void dfsTraversal(Node node){
        List<Node> visitedNode = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        stack.push(node);
        visitedNode.add(node);
        while (!stack.isEmpty()){
            List<Node> edges = adjacencyMap.get(stack.peek());
            if (edges != null){
                Node n = edges.stream().filter(edge -> !visitedNode.contains(edge)).findFirst().orElse(null);
                if (n != null){
                    stack.push(n);
                    if (!visitedNode.contains(n)) {
                        visitedNode.add(n);
                    }
                }else{
                    stack.pop();
                }
            }else {
                stack.pop();
            }
        }
        visitedNode.stream().forEach(node1 -> System.out.println(node1.name));
    }
    public void bfsTraverse(Node node){
        List<Node> visitedNodes = new ArrayList<>();
        Queue<Node> queue = new LinkedList<>();
        queue.add(node);
        while (!queue.isEmpty()){
            Node visitedNode = queue.remove();
            visitedNodes.add(visitedNode);
            System.out.print(visitedNode.name+" ");
            List<Node> neighbours = adjacencyMap.get(visitedNode);
            if(neighbours != null) {
                for (int i = 0; i < neighbours.size(); i++) {
                    Node n = neighbours.get(i);
                    if (n != null && !visitedNodes.contains(n)) {
                        queue.add(n);
                    }
                }
            }
        }
    }




    public static void main(String[] args) {

    }
}


public class DFS {


    public static void main(String[] args) {
        Node arad=new Node(1,"arad");
        Node zerind=new Node(2,"zerind");
        Node oradea=new Node(3,"oradea");
        Node sibiu=new Node(4,"sibiu");
        Node timisora=new Node(5,"timisora");
        Node lugoj=new Node(6,"lugoj");
        Node mehadia=new Node(7,"mehadia");
        Node dobreta=new Node(8,"dobreta");
        Node craiova=new Node(9,"craiova");
        Node pitesi=new Node(10,"pitesi");
        Node fagaros=new Node(11,"fagaros");
        Node pitesti=new Node(12,"pitesti");
        Node bucharest=new Node(13,"bucharest");
        Node giurgiu=new Node(14,"giurgiu");
        Node urziceni=new Node(15,"urziceni");
        Node hirsova=new Node(16,"hirsova");
        Node eforie=new Node(17,"eforie");
        Node vaslui=new Node(18,"vaslui");
        Node lasi=new Node(19,"lasi");
        Node neamt=new Node(20,"neamt");
        Node rimnicu_vilcea=new Node(21,"rimnicu_vilcea");
        Graph graph=new Graph();
        graph.insertEdge( arad,zerind);
        graph.insertEdge( zerind,arad);

        graph.insertEdge( arad,timisora);
        graph.insertEdge( timisora,arad);

        graph.insertEdge( arad,sibiu);
        graph.insertEdge( sibiu,arad);

        graph.insertEdge( zerind,oradea);
        graph.insertEdge( oradea,zerind);

        graph.insertEdge( timisora,lugoj);
        graph.insertEdge( lugoj,timisora);

        graph.insertEdge( lugoj,mehadia);
        graph.insertEdge( mehadia,lugoj);

        graph.insertEdge( mehadia,dobreta);
        graph.insertEdge( dobreta,mehadia);

        graph.insertEdge( dobreta,craiova);
        graph.insertEdge( craiova,dobreta);

        graph.insertEdge( craiova,rimnicu_vilcea);
        graph.insertEdge( rimnicu_vilcea,craiova);

        graph.insertEdge( craiova,pitesi);
        graph.insertEdge( pitesi,craiova);

        graph.insertEdge( pitesi,bucharest);
        graph.insertEdge( bucharest,pitesi);

        graph.insertEdge( bucharest,giurgiu);
        graph.insertEdge( giurgiu,bucharest);

        graph.insertEdge( bucharest,urziceni);
        graph.insertEdge( urziceni,bucharest);

        graph.insertEdge( urziceni,hirsova);
        graph.insertEdge( hirsova,urziceni);

        graph.insertEdge( hirsova,eforie);
        graph.insertEdge( eforie,hirsova);

        graph.insertEdge( urziceni,vaslui);
        graph.insertEdge( vaslui,urziceni);

        graph.insertEdge( vaslui,lasi);
        graph.insertEdge( lasi,vaslui);

        graph.insertEdge( lasi,neamt);
        graph.insertEdge( neamt,lasi);


        graph.traverse();

        System.out.println(graph.hasEdge(arad,sibiu));
//        System.out.println(graph.hasEdge(d,a));
        graph.bfsTraverse(arad);




    }
}

import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Node start = new Node("Casa");

        Node A = new Node("A");

        Node B = new Node("B");

        Node C = new Node("C");

        Node D = new Node("D");

        Node E = new Node("E");

        Node end = new Node("Ufficio");

        start.addDestination(A , 2);

        start.addDestination(D , 8);

        A.addDestination(B , 6);

        A.addDestination(C , 2);

        B.addDestination(end , 5);

        C.addDestination(D , 2);

        C.addDestination(E , 9);

        D.addDestination(E , 3);

        E.addDestination(end , 1);

        Graph graph = new Graph();

        graph.addNode(start);

        graph.addNode(A);

        graph.addNode(B);

        graph.addNode(C);

        graph.addNode(D);

        graph.addNode(E);

        graph.addNode(end);

        graph = AlgorithmDijkstra.calculateShortestPathFromSource(graph , start);

        Set <Node> nodes = graph.getNodes();

        for (Node node : nodes)
        {
            System.out.println(node.getName() + " Peso: " + node.getDistance() + " Percorso minimo: " + node.getShortestPathNodes());
        }
    }
}

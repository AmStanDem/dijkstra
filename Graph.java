import java.util.HashSet;
import java.util.Set;

public class Graph {



    private Set <Node> nodes;

    public Graph() {
        nodes = new HashSet<>();
    }

    public Set<Node> getNodes() {
        return nodes;
    }


    public void addNode (Node newNode) {
        nodes.add(newNode);
    }


}

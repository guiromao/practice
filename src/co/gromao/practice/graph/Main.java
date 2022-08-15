package co.gromao.practice.graph;

public class Main {

    public static void main(String[] args) {
        Graph<Integer> graph = new Graph<>();

        graph.addVertex(10);
        graph.addVertex(20);
        graph.addVertex(30);
        graph.addVertex(40);

        graph.addEdge(10, 20);
        graph.addEdge(10, 40);
        graph.addEdge(20, 30);

        graph.showConnections();
    }

}

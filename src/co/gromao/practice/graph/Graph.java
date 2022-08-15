package co.gromao.practice.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

public class Graph<T> {

    private Map<Node<T>, Set<Node<T>>> nodesMap;
    private int numberOfNodes;

    public Graph() {
        this.nodesMap = new HashMap<>();
        this.numberOfNodes = 0;
    }

    public void addVertex(T value) {
        Node<T> node = new Node<>(value);

        if (!nodesMap.containsKey(node)) {
            nodesMap.put(node, new HashSet<>());
            this.numberOfNodes++;
        }
    }

    public void addEdge(T value1, T value2) {
        Node<T> node1 = new Node<>(value1);
        Node<T> node2 = new Node<>(value2);

        Objects.requireNonNull(nodesMap.getOrDefault(node1, null), "Cannot add Edge to non-existing Node");
        Objects.requireNonNull(nodesMap.getOrDefault(node2, null), "Cannot add Edge to non-existing Node");

        Set<Node<T>> firstNodeEdges = nodesMap.get(node1);
        Set<Node<T>> secondNodeEdges = nodesMap.get(node2);

        firstNodeEdges.add(node2);
        secondNodeEdges.add(node1);

        nodesMap.put(node1, firstNodeEdges);
        nodesMap.put(node2, secondNodeEdges);
    }

    public void showConnections() {
        nodesMap.entrySet().stream()
                .forEach(entry -> System.out.println(entry.getKey() + " --> " + entry.getValue()));
    }

    public int getNumberOfNodes() {
        return this.numberOfNodes;
    }

}

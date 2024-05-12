package DataStructures.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

public class MyGraph {
    private int numberOfNodes;
    private HashMap<Integer, List<Integer>> adjacentList;

    public MyGraph() {
        this.adjacentList = new HashMap<>();
        numberOfNodes = 0;
    }

    public void addVertex(int value) {
        adjacentList.put(value, new ArrayList<>());
        numberOfNodes++;
    }

    public void addEdge(int value1, int value2) {
        adjacentList.get(value1).add(value2);
        adjacentList.get(value2).add(value1);
    }

    public void showConnections() {
        Set<Integer> keys = adjacentList.keySet();
        for (int node : keys) {
            List<Integer> nodeConnections = adjacentList.get(node);
            StringBuilder connections = new StringBuilder();
            for (int edge : nodeConnections) {
                connections.append(edge).append(" ");
            }
            System.out.println(node + "-->" + connections);
        }
    }

    public int getNumberOfNodes() {
        return numberOfNodes;
    }

    public static void main(String[] args) {
        MyGraph graph = new MyGraph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addVertex(3);
        graph.addVertex(4);
        graph.addVertex(5);
        graph.addVertex(6);
        graph.addEdge(3, 1);
        graph.addEdge(3, 4);
        graph.addEdge(4, 2);
        graph.addEdge(4, 5);
        graph.addEdge(1, 2);
        graph.addEdge(1, 0);
        graph.addEdge(0, 2);
        graph.addEdge(6, 5);
        graph.showConnections();
    }
}

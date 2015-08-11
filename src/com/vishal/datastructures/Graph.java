package com.vishal.Datastructures;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Vishal Jadhav on 6/9/15.
 */

public class Graph {
    List<Vertex> vertices;
    int noOfVertices;

    public Graph() {
        noOfVertices = 1;
        vertices = new ArrayList<Vertex>();
    }

    void AddVertex(String v) {
        Vertex vertex = new Vertex(v, noOfVertices);
        vertices.add(vertex);
        noOfVertices++;
    }

    void AddEdges(int src, int dest) {
        //if()
        vertices.get(src).adjList.AddNode(dest);
    }


}

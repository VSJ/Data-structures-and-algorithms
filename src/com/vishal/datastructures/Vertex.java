package com.vishal.Datastructures;

/**
 * Created by vj028567 on 6/9/15.
 */
public class Vertex {
    int vertexIndex;
    String value;
    LinkedList adjList;
    public Vertex(String value, int vertexIndex) {
        this.vertexIndex = vertexIndex;
        this.value = value;
        adjList = new LinkedList();
    }
}


package co.gromao.practice.bst;

import java.util.Objects;

public class BinarySearchTree<T extends Number & Comparable<? super T>> {

    private Node<T> root;

    public void insert(T value) {
        Node<T> node = new Node<>(value);

        if (Objects.isNull(this.root)) {
            this.root = node;
        } else {
            insertFrom(this.root, node);
        }
    }

    public Node<T> lookup(T value) {
        Node<T> searchedNode = this.root;

        while (Objects.nonNull(searchedNode) && value.compareTo(searchedNode.getValue()) != 0) {
            searchedNode = value.compareTo(searchedNode.getValue()) < 0 ? searchedNode.getLeft() : searchedNode.getRight();
        }

        return Objects.nonNull(searchedNode) ? searchedNode : null;
    }

    public void remove(T value) {
        Node<T> searchedNode = this.root;
        boolean found = false;

        while (Objects.nonNull(searchedNode) && !found) {
            Node<T> nextNode = value.compareTo(searchedNode.getValue()) < 0 ? searchedNode.getLeft() : searchedNode.getRight();

            if (Objects.nonNull(nextNode) && nextNode.getValue().compareTo(value) == 0) {
                found = true;
            } else {
                searchedNode = nextNode;
            }
        }

        if (found) {
            Node<T> nodeToRemove = value.compareTo(searchedNode.getValue()) < 0 ? searchedNode.getLeft() : searchedNode.getRight();
            Node<T> leftOfRemoved = nodeToRemove.getLeft();
            Node<T> rightOfRemoved = nodeToRemove.getRight();

            if (searchedNode.getLeft().equals(nodeToRemove)) {
                searchedNode.setLeft(null);
            } else {
                searchedNode.setRight(null);
            }

            // Re-locate the children nodes of the removed one
            insertFrom(searchedNode, leftOfRemoved);
            insertFrom(searchedNode, rightOfRemoved);
        }
    }

    public void print() {
        System.out.println(this.root);
    }

    private void insertFrom(Node<T> referenceNode, Node<T> newNode) {
        boolean hasPlace = false;

        while (!hasPlace) {
            Node<T> currNode = newNode.getValue().compareTo(referenceNode.getValue()) < 0 ? referenceNode.getLeft() : referenceNode.getRight();

            if (Objects.isNull(currNode)) {
                hasPlace = true;
            } else {
                referenceNode = currNode;
            }
        }

        if (newNode.getValue().compareTo(referenceNode.getValue()) < 0) {
            referenceNode.setLeft(newNode);
        } else {
            referenceNode.setRight(newNode);
        }
    }

}

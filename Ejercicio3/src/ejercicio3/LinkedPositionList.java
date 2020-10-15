/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Iterator;
import javax.xml.xpath.XPathConstants;
import jdk.internal.jimage.ImageReader;
import material.Position;

/**
 *
 * @author miguel
 * @param <E>
 */
public class LinkedPositionList<E> implements MyListBetter<E> {

    public class PositionNode<E> implements Position<E> {

        private PositionNode prevNode;
        private E element;
        private PositionNode nextNode;

        @Override
        public E getElement() {
            return element;

        }

        public PositionNode(E element) {
            this.element = element;
        }

        public PositionNode(PositionNode prevNode, T element, PositionNode nextNode) {
            this.prevNode = prevNode;
            this.element = element;
            this.nextNode = nextNode;
        }

        public PositionNode getPrevNode() {
            return prevNode;
        }

        public void setPrevNode(PositionNode prevNode) {
            this.prevNode = prevNode;
        }

        public PositionNode getNextNode() {
            return nextNode;
        }

        public void setNextNode(PositionNode nextNode) {
            this.nextNode = nextNode;
        }

    }

    private Position head;
    private Position tail;
    private int size;

    public LinkedPositionList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    @Override
    public int size() {
        return size;

    }

    @Override
    public boolean isempty() {
        return size <= 0;

    }

    @Override
    public Position add(E value) {
        Position node = null;
        if (this.isempty()) {
            node = isemptyadd(node, value);

        } else {
            node = new PositionNode((PositionNode) head, value, null);
            this.head = node;

        }
        this.size++;
        return node;

    }

    private Position isemptyadd(Position node, E value) {
        node = new PositionNode(value);
        this.head = node;
        this.tail = node;
        return node;
    }

    @Override
    public Position<E> addAfter(Position<E> pos, E value) {
        Position node = null;
        if (this.isempty()) {
            node = isemptyadd(node, value);
        } else {
            PositionNode actualNode = (PositionNode) pos;
            PositionNode nextNode = actualNode.nextNode;
            Position valueNode = new PositionNode(actualNode, value, nextNode);
            actualNode.nextNode = (PositionNode) valueNode;
            nextNode.prevNode = (PositionNode) valueNode;

        }

        return node;

    }

    @Override
    public Position<E> addBefore(Position<E> pos, E value) {
        Position node = null;
        if (this.isempty()) {
            node = isemptyadd(node, value);
        } else {
            PositionNode actualNode = (PositionNode) pos;
            PositionNode prevNode = actualNode.prevNode;
            Position valueNode = new PositionNode(prevNode, value, actualNode);
            actualNode.prevNode = (PositionNode) valueNode;
            prevNode.nextNode = (PositionNode) valueNode;

        }

        return node;
    }

    @Override
    public E remove(Position pos) {
        PositionNode toremoveNode = (PositionNode) pos;
        PositionNode prevNode = toremoveNode.prevNode;
        PositionNode nexNode = toremoveNode.nextNode;

        nexNode.prevNode = prevNode;
        prevNode.nextNode = nexNode;
        toremoveNode.nextNode = null;
        toremoveNode.prevNode = null;
        return (E) toremoveNode.getElement();

    }

    @Override
    public Position get() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position set(Position pos, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position search(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean contains(Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Iterator iterator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}

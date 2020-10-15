/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3;

import java.util.Iterator;
import jdk.javadoc.internal.doclets.formats.html.markup.Head;
import material.Position;

/**
 *
 * @author miguel
 */
public class LinkedPositionList<E> implements MyListBetter<E> {

    public class PositionNode<T> implements Position<T> {

        private PositionNode prevNode;
        private T element;
        private PositionNode nextNode;

        @Override
        public T getElement() {
            return element;

        }

        public PositionNode(T element) {
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
        if (size > 0) {
            return false;
        }
        return true;

    }

    @Override
    public Position add(E value) {
        Position node = new PositionNode(value);
        this.head = node;
        this.tail = node;
        this.size++;

        return node;
        
        
    }

    @Override
    public Position addAfter(Position pos, ObObjectject value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Position addBefore(Position pos, Object value) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public Object remove(Position pos) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
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

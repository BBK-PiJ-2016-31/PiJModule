package com.damanjit;

/**
 * Created by D on 15/12/2016.
 */
public class ObjectNode {

    private int index=0;
    private ObjectNode nextObjectNode=null;
    private Object object=null;

    public ObjectNode(Object object){
        this.object=object;
    }

    public Object getObject(){
        return object;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public ObjectNode getNextObjectNode() {
        return nextObjectNode;
    }

    public void setNextObjectNode(ObjectNode next) {
        this.nextObjectNode = next;
    }

}
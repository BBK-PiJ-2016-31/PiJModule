

public class LinkedList implements List {

    private ObjectNode head = null; // pointer to the first Object in the list
    private ObjectNode tail = null; // pointer to the last object in the list

    @Override
    public boolean isEmpty(){
        return (head==null);        // No first element is present
    }

    /**
     * Returns the number of items currently in the list.
     *
     * @return the number of items currently in the list
     */
    @Override
    public int size(){
        if (isEmpty()) return 0;                // returns the size of the list
        return tail.getIndex()+1;                // returns the size of the list
    }

    /**
     * Returns the element at the given position.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
     */
    @Override
    public ReturnObject get(int index){
        if (isEmpty()){
            return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
        }
        if ((index<0) || (index>=size())){
            return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
        }
        return (new ReturnObjectImpl(getObjectNode(index).getObject()));
    }

    /**
     * Returns the elements at the given position and removes it
     * from the list. The indeces of elements after the removed
     * element must be updated accordignly.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * @param index the position in the list of the item to be retrieved
     * @return the element or an appropriate error message,
     *         encapsulated in a ReturnObject
     */
    @Override
    public ReturnObject remove(int index){
        if (isEmpty()){
            return (new ReturnObjectImpl(ErrorMessage.EMPTY_STRUCTURE));
        }
        if ((index<0) || (index>=size())) {
            return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
        }
        if (index>0){
            ObjectNode temp = getObjectNode(index-1);  // Get one before the actual object
            ObjectNode toReturn = temp.getNextObjectNode();
            temp.setNextObjectNode(temp.getNextObjectNode().getNextObjectNode());
            if (temp.getNextObjectNode()!=null) {    //
                setIndex(temp);
            }
            if (toReturn==tail){
                tail=temp;
            }
            return (new ReturnObjectImpl(toReturn.getObject()));
        }
        ObjectNode temp=head;
        head=head.getNextObjectNode();
        if (head!=null){
            head.setIndex(0);
            setIndex(head);
        }
        return (new ReturnObjectImpl(temp.getObject()));
    }

    private ObjectNode getObjectNode(int index){
        ObjectNode temp=head;
        do{
            if (temp.getIndex()==index){
                break;
            }
            temp=temp.getNextObjectNode();
        }while (temp.getNextObjectNode()!=null);
        return temp;
    }

    private void setIndex(ObjectNode temp){
        int counter=temp.getIndex();
        if (temp.getNextObjectNode()!=null) {
            do {
                counter++;
                temp.getNextObjectNode().setIndex(counter);
                temp = temp.getNextObjectNode();
            } while (temp.getNextObjectNode()!= null);
        }
    }

    /**
     * Adds an element to the list, inserting it at the given
     * position. The indeces of elements at and after that position
     * must be updated accordignly.
     *
     * If the index is negative or greater or equal than the size of
     * the list, then an appropriate error must be returned.
     *
     * If a null object is provided to insert in the list, the
     * request must be ignored and an appropriate error must be
     * returned.
     *
     * @param index the position at which the item should be inserted in
     *              the list
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful
     *         or containing an appropriate error message otherwise
     */
    @Override
    public ReturnObject add(int index, Object item){
        if (item==null){
            return (new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT));
        }
        if ((index<0) || ((index>0) && (head==null)) || (index>size())){
            return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
        }
        if (index==0){
            ObjectNode temp = new ObjectNode(item);
            temp.setNextObjectNode(head);
            temp.setIndex(0);
            setIndex(temp);
            head=temp;
            if (tail==null) {   // for first element which might get added
                tail=head;
            }
            return new ReturnObjectImpl(head.getObject());
        }
        if ((index==size())){
            return add(item);
        }
        ObjectNode temp = getObjectNode(index-1); // get the object before the target
        ObjectNode newOne = new ObjectNode(item);
        newOne.setIndex(index);
        newOne.setNextObjectNode(temp.getNextObjectNode());
        temp.setNextObjectNode(newOne);
        setIndex(newOne);
        return (new ReturnObjectImpl(newOne.getObject()));
    }

    /**
     * Adds an element at the end of the list.
     *
     * If a null object is provided to insert in the list, the
     * request must be ignored and an appropriate error must be
     * returned.
     *
     * @param item the value to insert into the list
     * @return an ReturnObject, empty if the operation is successful
     *         or containing an appropriate error message otherwise
     */
    @Override
    public ReturnObject add(Object item){
        if (item==null){
            return (new ReturnObjectImpl(ErrorMessage.INVALID_ARGUMENT));
        }
        ObjectNode newOne=new ObjectNode(item);
        if (head==null){
            tail=newOne;
            head=newOne;
            head.setIndex(0);
            return (new ReturnObjectImpl(head.getObject()));
        }
        tail.setNextObjectNode(newOne);
        tail.getNextObjectNode().setIndex(tail.getIndex()+1);
        tail=newOne;
        return (new ReturnObjectImpl(tail.getObject()));
    }

    public void printList(){
        if (head==null){
            System.out.println("Nothing to print!!");
            return;
        }
        ObjectNode temp=head;
        do{
            System.out.println("Index: "+temp.getIndex()+" Value: "+temp.getObject());
            temp=temp.getNextObjectNode();
        }while(temp!=null);
        System.out.println("***** --------- *****");

    }
}

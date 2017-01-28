

public class ArrayList implements List {

    private int arraySize=10;
    private Object[] objectArray=new Object[arraySize];
    private int nullLocation;

    /**
    * Default constructor. It initialises the object array base element as null
    * Assigns null location to keep a track of the null object. 
    */
    public ArrayList(){
        objectArray[0]=null;
        nullLocation=0;
    }

    @Override
    public boolean isEmpty(){
        return (objectArray[0]==null);  // No first element i.e. list is empty
    }

    /**
     * Returns the number of items currently in the list.
     *
     * @return the number of items currently in the list
     */
    @Override
    public int size(){
        if (isEmpty()) return 0;                // returns the size of the list
        return nullLocation;                // returns the size of the list
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
        if ((index<0) || (index>(size()-1))){
            return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
        }
        return (new ReturnObjectImpl(objectArray[index]));
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
        if ((index<0) || (index>=nullLocation)) {
            return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
        }
        Object toReturn = objectArray[index];
        // Overwrite the array at index by moving one step back
        for (int i=index; i<=nullLocation; i++){
            objectArray[i]=objectArray[i+1];
        }
        nullLocation--;
        return (new ReturnObjectImpl(toReturn));
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
        if ((index<0) || (index>nullLocation)) {
            return (new ReturnObjectImpl(ErrorMessage.INDEX_OUT_OF_BOUNDS));
        }
        arraySizeCheck();
        for (int i=nullLocation; i>=index; i--){
            objectArray[i+1]=objectArray[i];
        }
        nullLocation++;
        objectArray[index]=item;
        return (new ReturnObjectImpl(item));
    }

    /**
    * Size checking of the array
    * if array is full then call the method to make the array bigger
    */
    private void arraySizeCheck(){
        if (nullLocation==arraySize-1){ // need a bigger array
            makeArrayBigger();
        } // we have a bigger array now if needed
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
        arraySizeCheck();
        objectArray[nullLocation+1]=null;
        objectArray[nullLocation]=item;
        nullLocation++;
        return (new ReturnObjectImpl(objectArray[nullLocation-1]));
    }

    /**
    * Making the array bigger here. twice it's size
    * if the elements are greater than 10000 then it will increase by 30% size only and not double up.
    */
    private void makeArrayBigger(){
        if (arraySize>10000){
            arraySize+=(arraySize/30); // increase by 30%
        } else {
            arraySize*=2;       // else just double it
        }   // we have a new arraySize
        copyArrayContent();
    }
    /**
    * This method copies the content of the old array to the new array.
    */
    private void copyArrayContent(){
        // Create a new array
        Object[] temp = new Object[arraySize]; // with a new size
        for (int i=0; i<=nullLocation; i++){
            temp[i]=objectArray[i]; // upto the null location
        }
        objectArray=temp;   // objectArray to take over temp from now
        // we have a bigger array from here on
    }
    
    /**
    * Just a print method to check everything is ok!
    */
    public void printList(){
        if (isEmpty()){
            System.out.println("Nothing to print!! > nullLocation: "+nullLocation);
            return;
        }
        int index=0;
        do{
            System.out.println("Index: "+index+" Value: "+objectArray[index]);
            index++;
        }while(objectArray[index]!=null);
        System.out.println("***** nullLocation: "+nullLocation);
    }
}
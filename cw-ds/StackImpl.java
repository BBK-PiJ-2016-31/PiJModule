/**
 * Created by D on 29/12/2016.
 */
public class StackImpl extends AbstractStack {
    /**
     * The data structure where the elements on the stack are stored.
     * Default constructor
     */

    public StackImpl (List list){
        super(list);
        if(list==null){
            super.internalList=new ArrayList();
        }
    }

    @Override
    public boolean isEmpty(){
        return (internalList.isEmpty());
    }

    @Override
    public int size() {
        return internalList.size();
    }

    @Override
    public void push(Object item) {
        internalList.add(item);
    }

    @Override
    public ReturnObject top() {
        return internalList.get(internalList.size()-1);
    }

    @Override
    public ReturnObject pop() {
        return internalList.remove(internalList.size()-1);
    }

}

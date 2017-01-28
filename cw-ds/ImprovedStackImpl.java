

/**
 * Created by D on 29/12/2016.
 */
public class ImprovedStackImpl implements ImprovedStack {

    private List list;
    /**
    *Default constructor to initialise the List.
    *Creates a new ArrayList if the parameter is Null Object. 
    *Takes List as a parameter.
    */

    public ImprovedStackImpl(List list){
        this.list = list;
        if (list==null){
            this.list=new ArrayList();
        }
    }

    /**
    *Method to get the private list.
    *@return List
    */
    public List getList(){
        return this.list;
    }

    @Override
    public ImprovedStack reverse() {
        if (list.isEmpty()){
            return new ImprovedStackImpl(list);
        }
        List temp= new ArrayList();
        for (int i=0; i<size(); i++){
            temp.add(i,list.get(size()-1-i).getReturnValue());
        }
        return new ImprovedStackImpl(temp);
    }

    @Override
    public void remove(Object object) {
        for (int i=0; i<size(); i++){
            if (object.equals(list.get(i).getReturnValue())){
                list.remove(i);
            }
        }

    }

    @Override
    public void push(Object item) {
        list.add(item);
    }

    @Override
    public ReturnObject pop() {
        return list.remove(list.size()-1);
    }

    @Override
    public boolean isEmpty(){
        return (list.isEmpty());
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public ReturnObject top() {
        return list.get(list.size()-1);
    }
}

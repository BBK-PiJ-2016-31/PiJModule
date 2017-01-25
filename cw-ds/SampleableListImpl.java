/**
 * Created by D on 28/12/2016.
 */
public class SampleableListImpl extends FunctionalArrayList implements SampleableList {

    /**
     * Returns a list containing the first, third, fifth...
     * items of this list, or an empty list if the list is empty.
     *
     * @return a list containing the first, third, fifth... items of this list
     */

    public SampleableList sample(){
        SampleableList sampleList = new SampleableListImpl();
        if (isEmpty()){
            return sampleList;
        }
        for (int i=1; i<size(); i+=2){
            sampleList.add(super.get(i).getReturnValue());
        }
        return sampleList;
    }
}

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by D on 13/05/2017.
 */
public class TreeIntSet implements IntSet {

    private TreeIntSet left = null;
    private TreeIntSet right = null;
    private int value;

    @Override
    public void add(int i) {
        if (!contains(i)){
            if (i<value) {
                if (left==null) {
                    left=new TreeIntSet(i);
                }else{
                    left.add(i);
                }
            } else {
                if (right==null) {
                    right = new TreeIntSet(i);
                } else {
                    right.add(i);
                }
            }
        }
    }

    @Override
    public boolean contains(int j) {
        if (j==this.value) return true;
        if (j<this.value){
            if (left==null) return false;
            return left.contains(j);
        } else {
            if (right==null) return false;
            return right.contains(j);
        }

    }

    @Override
    public boolean containsVerbose(int k) {
        System.out.println("Current node value: "+ this.value);
        if (k==this.value) return true;
        if (k<this.value){
            if (left==null) return false;
            left.containsVerbose(k);
        } else {
            if (right==null) return false;
            right.containsVerbose(k);
        }
    }

    @Override
    public String toString(){
        String result="";
        result+= " "+Integer.toString(this.value);
        if (left!=null){

        }
    }
}

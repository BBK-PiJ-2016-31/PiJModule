/**
 * Created by D on 12/05/2017.
 */
public class IntegerTreeNode {
    int value;
    IntegerTreeNode left;
    IntegerTreeNode right;

    public IntegerTreeNode (int value){
        this.value=value;
    }
    public IntegerTreeNode (){

    }

    public void add (int newNumber){
        if (newNumber > this.value) {
            if (right == null) {
                right = new IntegerTreeNode(newNumber);
            } else { right.add(newNumber);
            }
        } else {
            if (left == null) {
                left = new IntegerTreeNode(newNumber);
            } else {
                left.add(newNumber);
            }
        }
    }

    public boolean contains(int n) {
        if (n == this.value) {
            return true;
        } else if (n > this.value) {
            if (right == null) {
                return false;
            } else {
                return right.contains(n);
            }
        } else {
            if (left == null) {
                return false;
            } else {
                return left.contains(n);
            }
        }
    }

    public void toString(int value){
        IntegerTreeNode pointer=null;

        if (value == this.value) {
            pointer=this;
        } else if (value > this.value) {
            if (right == null) {
                System.out.println("Value not found");
                if (pointer == null) System.out.println("Null pointer");
            } else {
                right.toString(value);
            }
        } else {
            if (left == null) {
                System.out.println("Value not found");
                if (pointer == null) System.out.println("Null pointer");

            } else {
                left.toString(value);
            }
        }
        if (!(pointer==null)){
            if (pointer.left!=null){
                System.out.println("L["+pointer.left.value+"]");
                toString(pointer.left.value);
            } else {
                if (pointer.right!=null){
                    System.out.println("R["+pointer.right.value+"]");
                    toString(pointer.right.value);
                }

            }
        }

    }

}

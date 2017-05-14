/**
 * Created by D on 14/05/2017.
 */
public class ExceptionChecker {

    public static void main(String[] args) {
        ExceptionChecker ex = new ExceptionChecker();
        ex.checkedFirst();
    }

    public void checkedFirst() {
        try {
            throw new CheckedOne("This is a checked exception thrown");
        } catch (CheckedOne n){
            System.out.println("Checked one caught");
        }
        uncheckedSecond();
    }

    public void uncheckedSecond(){
        try{
            throw new UncheckedOne("Unchecked exception");
        } catch (UncheckedOne e){
            System.out.println("Unchecked caught here");
        }
    }
}

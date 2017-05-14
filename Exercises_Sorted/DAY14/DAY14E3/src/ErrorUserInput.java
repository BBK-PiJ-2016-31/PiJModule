import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by D on 13/05/2017.
 */
public class ErrorUserInput {

    public static void main(String[] args) {
        ErrorUserInput e = new ErrorUserInput();
        e.launch();
    }

    public void launch(){
        System.out.print("How many numbers need averaging: ");
        int j = check();
        int result=0;
        for (int i=1; i<=j; i++){
            System.out.print("Enter "+ i+ " number: ");
            int y = check();
            if (y==-1){
                i-=1;
            }else{
                result+=y;
            }
        }
        System.out.println(""+ result/j+" > Average");
    }

    public int check(){
        String str=null;
        int num=-1;
        try{
            str = (new BufferedReader(new InputStreamReader(System.in))).readLine();
            num=Integer.parseInt(str);
        } catch (NumberFormatException e){
            System.out.println("Only enter numbers");
        } catch (IOException e) {
            e.printStackTrace();
        }
        return num;
    }
}

import java.util.ArrayList;
import java.util.List;

/**
 * Created by D on 23/02/2017.
 */
public class ResponsiveUI implements Runnable {

  private List<Integer> tasks = new ArrayList<>();

  public static void main(String[] args) {
    ResponsiveUI obj = new ResponsiveUI();
    for (int i=0; i<10; i++) {

      Thread thread = new Thread(obj);
      thread.start();
    }
  }

  @Override
  public void run() {

  }

  public void notifyFinish(int id) {
  }
}
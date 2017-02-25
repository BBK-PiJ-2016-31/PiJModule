/**
 * Created by D on 24/02/2017.
 */
public class Timer implements Runnable{
    private int id;
    private int time;
    private ResponsiveUI obj;

    public void Timer(int id, int time, ResponsiveUI obj){
      this.id = id;
      this.time = time;
      this.obj = obj;
    }

  @Override
  public void run() {
    try {
      Thread.sleep(this.time);
    } catch (InterruptedException e){
      e.printStackTrace();
    }
    obj.notifyFinish(id);
  }
}

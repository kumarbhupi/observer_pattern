import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Timer;
import java.util.TimerTask;

public class Interval  implements PropertyChangeListener {
  private LocalDateTime startTime;
  private LocalDateTime endTime;
  private Duration duration;

  Timer timer;

  public LocalDateTime getStartTime() {
    return startTime;
  }

  public LocalDateTime getEndTime() {
    return endTime;
  }


  public Duration getDuration() {
    return duration;
  }

  public void startInterval(){
    startTime = LocalDateTime.now();
    duration = Duration.ZERO;
  }

  public void updateInterval(){
    timer = new Timer();
    timer.schedule(new TimerTask() {
      @Override
      public void run() {
        duration = duration.plus(Duration.ofSeconds(1));
      }
    }, 1000);
  }


  public void endInterval(){
    timer.cancel();
    endTime = LocalDateTime.now();
  }

  public void addDuration(Duration time){
    this.duration = this.duration.plus(time);
  }


  @Override
  public void propertyChange(PropertyChangeEvent event) {
    this.addDuration((Duration) event.getNewValue());
  }
}

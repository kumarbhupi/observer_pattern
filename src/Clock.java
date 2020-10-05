import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.time.LocalDateTime;

public class Clock{
  private LocalDateTime time ;
  private PropertyChangeSupport support;

  public void addPropertyChangeListener(PropertyChangeListener listener){
    support.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener listener){
    support.removePropertyChangeListener(listener);
  }

  public void tick() {
    support.firePropertyChange("time", this.time, LocalDateTime.now());
    this.time = LocalDateTime.now();
  }
}

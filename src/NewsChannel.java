import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public class NewsChannel implements PropertyChangeListener {

  private String news;

  public void setNews(String news) {
    this.news = news;
  }

  public void propertyChange(PropertyChangeEvent evt) {
    this.setNews((String) evt.getNewValue());
  }

  @Override
  public String toString() {
    return "NewsChannel{" +
        "news='" + news + '\'' +
        '}';
  }
}

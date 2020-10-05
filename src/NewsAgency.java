import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.util.Date;

public class NewsAgency {
  private String news;
  private Date date;
  private PropertyChangeSupport support;

  public String getNews() {
    return news;
  }

  public Date getDate() {
    return date;
  }

  public NewsAgency(){
    support = new PropertyChangeSupport(this);
  }

  public void addPropertyChangeListener(PropertyChangeListener listener) {
    support.addPropertyChangeListener(listener);
  }

  public void removePropertyChangeListener(PropertyChangeListener propertyChangeListener){
    support.removePropertyChangeListener(propertyChangeListener);
  }

  public void setNews(String value){
    support.firePropertyChange("news", this.news, value);
    this.news = value;

  }


}

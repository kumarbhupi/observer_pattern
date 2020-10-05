public class Client {

  public static void main(String[] args) {
    NewsAgency observable = new NewsAgency();
    NewsChannel observer = new NewsChannel();

    observable.addPropertyChangeListener(observer);
    observable.setNews("PUTAS NOTICIAS!");

    System.out.println(observer.toString());





  }
}

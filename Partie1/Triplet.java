package Partie1;

public class Triplet<T> {

  private T objet1;
  private T objet2;
  private T objet3;

  public Triplet(T objet1, T objet2, T objet3) {
    this.objet1 = objet1;
    this.objet2 = objet2;
    this.objet3 = objet3;

  }

  public T getPremier() {
    return this.objet1;
  }

  public T getSecond() {
    return this.objet2;
  }

  public T getTroisieme() {
    return this.objet3;
  }

  @Override
  public String toString() {
    return "Premier objets : " + getPremier() + ", deuxieme objet : " + getSecond() + " et le troisieme objet : "
        + getTroisieme();
  }

  /*
   * Triplet<String, String, Integer> t = new Triplet<String, String,
   * Integer>("lala", "lolo", 11);
   * System.out.println("Hey");
   * System.out.println("Premier :" + t.getPremier());
   * t.toString()
   */

}
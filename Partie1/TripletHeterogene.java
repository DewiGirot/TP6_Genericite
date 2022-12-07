package Partie1;

public class TripletHeterogene<T, T2, T3> {

  private T objet1;
  private T2 objet2;
  private T3 objet3;

  public TripletHeterogene(T objet1, T2 objet2, T3 objet3) {
    this.objet1 = objet1;
    this.objet2 = objet2;
    this.objet3 = objet3;

  }

  public T getPremier() {
    return this.objet1;
  }

  public T2 getSecond() {
    return this.objet2;
  }

  public T3 getTroisieme() {
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
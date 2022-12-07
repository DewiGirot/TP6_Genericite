package Partie4;

public class CoupleNomme<T> extends Couple<T> {
  private T x, y;
  private String nom;

  // les deux éléments du couple
  public CoupleNomme(T premier, T second, String nom) {
    super(premier, second);
    this.nom = nom;
  }

  public String getNom() {
    return this.nom;
  }

  public void affiche() {
    System.out.println(super.toString() + " qui se nomment : " + getNom());
  }
}
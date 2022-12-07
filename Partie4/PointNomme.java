package Partie4;

public class PointNomme extends Couple<Integer> {

  private String nom;

  // les deux éléments du couple
  public PointNomme(Integer x, Integer y, String nom) {
    super(x, y);
    this.nom = nom;
  }

  public String getNom() {
    return this.nom;
  }

  public void affiche() {
    System.out.println(super.toString() + " qui se nomment : " + getNom());
  }
}
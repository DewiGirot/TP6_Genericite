package Partie3;

public class ex3<T> {

  // Méthode générique ex1
  public T afficher(T[] tab) {
    int n = (int) (Math.random() * tab.length);
    return tab[n];
  }

}
package Partie3;

public class ex3_2 {

  // Méthode générique ex1
  public static <T> T afficher(T x, T y) {
    int n = (int) (Math.random());
    return ((n == 0) ? x : y);
  }

}
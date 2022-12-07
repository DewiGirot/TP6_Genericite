package Partie5;

public class bigElement<T> {

  // Plus grand élément d'un tableau
  public static <T extends Comparable<T>> T biggerElement(T[] tab) {
    T tmp = tab[0];
    for(int i = 1; i<tab.length; i++){
      if(tmp.compareTo(tab[i]) < 0){
        tmp = tab[i];
      }
    }
    return tmp;
  }
}
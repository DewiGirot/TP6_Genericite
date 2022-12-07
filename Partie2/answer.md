# Answer :

## The question
class C < T > {
  T x;
  T[] t1;
  T[] t2;
  public static T inf;
  public static int n;
  void f() {
    x = new T();
    t2 = t1;
    t2 = new T[5];
  }
}

## The answer
1/ On n'a pas le droit de faire de tableau de type générique (T) (2 fois)
2/                        faire un static de type générique (T)
3/                        faire un new dans la fonction void
4/                        instancier un type générique (faire un "new T()") car on ne connait pas son constructeur de base 
5/                        mettre un INTEGER dans le tableau t2 de type générique(T);
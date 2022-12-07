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
1/ On n'a pas le droit de faire de tableau de T
2/                              un new
3/                              
# Exercice 2 réponses

Classes génériques :

### définition 1
*class C <T>{ ..... }*


###  définition 2
*class D<T> extends C<T> { ..... }*
<br>D<Object> hérite de C<Object> ET  D<Double> hérite de C<Double>


###  définition 3
*class D<T, U> extends C<T> { ..... }*
<br>D(Double, Integer), D(Double, Double), D(Integer, Double) héritent de C<Double>


###  définition 4
*class D<T extends Number> extends C<T> { ..... }*
<br>D<Double> hérite de C<Double> ET D<String> hérite de C<String>


###  définition 5
*class D<T> extends X { ..... }*
<br>D<Double> D<String> héritent de X 


###  définition 6
*class D<T> extends C<String>*
<br>D<String> hérite de C<String> ET D<Integer> hérite de C<Integer>
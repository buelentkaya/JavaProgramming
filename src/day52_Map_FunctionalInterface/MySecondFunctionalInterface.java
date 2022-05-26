package day52_Map_FunctionalInterface;
@FunctionalInterface
public interface MySecondFunctionalInterface<T> {//T U R any of these can be given as a generic type

    void test(T data);  // (T t)  for t can be used anything
    // T is used for any non primitive objects; Integer,String or Arraylist


}

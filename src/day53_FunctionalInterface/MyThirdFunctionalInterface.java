package day53_FunctionalInterface;

@FunctionalInterface
public interface MyThirdFunctionalInterface <T>{// <AnyName>

    T method(T data);   // return method but any non primitives pass here as we use generic type "T"


}

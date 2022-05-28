package day53_FunctionalInterface;

@FunctionalInterface
public interface ArrayFunction<T, R> {
    R apply(T[] array);
}


package prob3;

import java.util.function.Predicate;

@FunctionalInterface
public interface PredicateWithException<T> {

    boolean test(T t) throws Exception;


    public static <T>Predicate<T> unchecked(PredicateWithException<T> pred)  {
        return a -> {
            try {
                return pred.test(a);
            } catch (Exception exception) {
                throw new RuntimeException(exception);
            }
        };
    }

}

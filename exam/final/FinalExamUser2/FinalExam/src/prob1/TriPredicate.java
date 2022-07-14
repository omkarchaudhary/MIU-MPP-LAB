package prob1;

@FunctionalInterface
public interface TriPredicate<T, U, R> {
    public boolean test(T t, U u, R r);
}

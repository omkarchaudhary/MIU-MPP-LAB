package prob5;
import java.util.*;




public class AllPairs {
public static <T extends Comparable<? super T>> List<Pair<T, T>> allIncreasingPairs(List<T> list) {
List<Pair<T, T>> returnVal = new ArrayList<>();
for(T x: list) {
for(T y: list) {
if(x.compareTo(y) > 0) {
Pair<T, T> p = new Pair<>(x,y);
returnVal.add(p);
}
}
}
return returnVal;
}

//should work for string, Employees, LocalDates
}
package qualitypatternmodel.mqaftranslation;

import java.util.Objects;

/**
 * A simple generic Pair-like class that associates a name with a value.
 *
 * @param <N> the type of the name
 * @param <V> the type of the value
 */
public class Pair<N, V> {
    private final N name;
    private final V value;

    public Pair(N name, V value) {
        this.name = name;
        this.value = value;
    }

    public N name() {
        return name;
    }

    public V value() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Pair<?, ?> pair)) return false;
        return Objects.equals(name, pair.name) &&
               Objects.equals(value, pair.value);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    @Override
    public String toString() {
        return "Pair{" +
                "name=" + name +
                ", value=" + value +
                '}';
    }

    /**
     * Static factory method for convenience.
     */
    public static <N, V> Pair<N, V> of(N name, V value) {
        return new Pair<>(name, value);
    }
}
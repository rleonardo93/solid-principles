package pt.rleonardo.solid.ocp.solution;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class PrimeNumberGeneratorReversed extends PrimeNumberGenerator {

    public PrimeNumberGeneratorReversed() {
        this.comparator = Comparator.<Integer>naturalOrder().reversed();
    }
}

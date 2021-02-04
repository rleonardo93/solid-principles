package pt.rleonardo.solid.ocp.problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;

public class PrimeNumberGeneratorTest {

    @Test
    public void test_natural_order() {
        PrimeNumberGenerator generator = new PrimeNumberGenerator();
        List<Integer> expected = Arrays.asList(2,3,5,7,11,13);

        Assert.assertThat(generator.primes(15), is(expected));
    }

    @Test
    public void test_reverse_order() {
        PrimeNumberGenerator generator = new PrimeNumberGenerator();
        List<Integer> expected = Arrays.asList(13,11,7,5,3,2);

        Assert.assertThat(generator.primes(15), is(expected));
    }
}
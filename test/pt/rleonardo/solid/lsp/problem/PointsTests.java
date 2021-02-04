package pt.rleonardo.solid.lsp.problem;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

public class PointsTests {

    private final Point2D reference = new Point2D(3, 5);

    private final List<Point2D> test_points = Arrays.asList(
            new Point2D(2,3),
            new Point2D(3,5),
            new Point2D(4, 3));

    @Test
    public void test_equal_if_only_if_distance_0() {
        for (Point2D point: test_points) {
            Assert.assertEquals("test for " + reference + " and" + point,
                    reference.equals(point),
                    reference.distance(point) == 0);
        }
    }

}
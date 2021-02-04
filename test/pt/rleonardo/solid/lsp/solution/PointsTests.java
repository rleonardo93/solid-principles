package pt.rleonardo.solid.lsp.solution;

import org.junit.Assert;
import org.junit.Test;
import pt.rleonardo.solid.lsp.problem.Point2D;
import pt.rleonardo.solid.lsp.problem.Point3D;

import java.util.Arrays;
import java.util.List;

public class PointsTests {

    // this value shows the subtype Point3D can not safely replace the Point2D type
    private final pt.rleonardo.solid.lsp.problem.Point2D reference = new Point3D(3, 5, 1);

    private final List<pt.rleonardo.solid.lsp.problem.Point2D> test_points = Arrays.asList(
            new pt.rleonardo.solid.lsp.problem.Point2D(2,3),
            new pt.rleonardo.solid.lsp.problem.Point2D(3,5),
            new pt.rleonardo.solid.lsp.problem.Point2D(4, 3));

    @Test
    public void test_equal_if_only_if_distance_0() {
        for (Point2D point: test_points) {
            Assert.assertEquals("test for " + reference + " and" + point,
                    reference.equals(point),
                    reference.distance(point) == 0);
        }
    }

}
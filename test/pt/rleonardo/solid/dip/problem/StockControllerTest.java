package pt.rleonardo.solid.dip.problem;

import org.junit.Assert;
import org.junit.Test;
import pt.rleonardo.solid.dip.solution.business.StockController;
import pt.rleonardo.solid.dip.solution.bbdd.StockRepositoryImpl;

public class StockControllerTest {

    @Test
    public void test_stock_control() {
        StockController controller = new StockController(new StockRepositoryImpl());

        Assert.assertFalse(controller.needMoreItemsInShop("north shop", "table"));
        Assert.assertTrue(controller.needMoreItemsInShop("north shop", "lamp"));

    }

}
package pt.rleonardo.solid.dip.problem.bbdd;

public class StockRepository {

    // Database query method

    public int getStock(String shop, String product) {
        return DataBase.stocks.get(shop).get(product);
    }
}

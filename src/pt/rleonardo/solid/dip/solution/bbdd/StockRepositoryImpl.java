package pt.rleonardo.solid.dip.solution.bbdd;

import pt.rleonardo.solid.dip.solution.business.StockRepository;

public class StockRepositoryImpl implements StockRepository {

    @Override
    public int getStock(String shop, String product) {
        return DataBase.stocks.get(shop).get(product);
    }
}

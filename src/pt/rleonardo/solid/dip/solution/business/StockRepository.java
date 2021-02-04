package pt.rleonardo.solid.dip.solution.business;

import pt.rleonardo.solid.dip.solution.bbdd.DataBase;

public interface StockRepository {

    int getStock(String shop, String product);
}

package pt.rleonardo.solid.srp.solution;

import pt.rleonardo.solid.srp.problem.BBDD;
import pt.rleonardo.solid.srp.problem.Client;
import pt.rleonardo.solid.srp.problem.Movie;

import java.util.ArrayList;
import java.util.List;

public class Recommender {

    public List<Movie> recommendations(Client client) {
        List<Movie> recommended = new ArrayList<>();

        for (Movie favorite : client.getFavorites()) {
            recommended.addAll(BBDD.MOVIES_BY_DIRECTOR.get(favorite.getDirector()));
        }
        recommended.removeAll(client.getFavorites());

        return recommended;
    }
}

package pt.rleonardo.solid.srp.solution;

import pt.rleonardo.solid.srp.problem.Movie;

import java.util.List;
import java.util.stream.Collectors;

public class CSVExporter {

    public String export(List<Movie> movies) {
        return movies.stream()
                .map(p -> (p.getTitle() + "," + p.getDirector() + "," + p.getGenre()))
                .collect(Collectors.joining("\n"));
    }
}

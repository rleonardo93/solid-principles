package pt.rleonardo.solid.isp.solution;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public interface TextProcessor {

    void add(String word);

    String text();
}

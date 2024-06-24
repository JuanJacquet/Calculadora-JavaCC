package tarea;

import java.util.HashMap;
import java.util.Map;

public class SymbolTable {
    private Map<String, Double> symbols = new HashMap<>();

    public void put(String name, Double value) {
        symbols.put(name, value);
    }

    public Double get(String name) {
        if (!symbols.containsKey(name)) {
            throw new RuntimeException("Variable no definida: " + name);
        }
        return symbols.get(name);
    }
}

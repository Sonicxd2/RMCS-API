package ru.luvas.rmcs.api.table;

/**
 * Created by RINES on 04.09.17.
 */
public class Column {

    private final String name;
    private final int width;

    /**
     * Столбец таблицы.
     * @param name название столбца.
     * @param width его ширина в пикселях.
     */
    public Column(String name, int width) {
        this.name = name;
        this.width = width;
    }

    public String getName() {
        return this.name;
    }

    public int getWidth() {
        return this.width;
    }

}

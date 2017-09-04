package ru.luvas.rmcs.api.table;

/**
 * Created by RINES on 04.09.17.
 */
public interface TableAPI {

    /**
     * Создать таблицу.
     * @param table таблица.
     */
    void create(Table table);

    /**
     * Обновить данные (строки) таблицы.
     * @param table таблица.
     */
    void update(Table table);

    /**
     * Удалить данные о таблице.
     * @param table таблица.
     */
    void delete(Table table);

}

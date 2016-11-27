package ru.luvas.rmcs.api.sql;

import java.sql.ResultSet;

/**
 *
 * @author 0xC0deBabe
 */
public interface SqlConnector {

    /**
     * Добавить запрос в очередь запросов к базе данных.
     * @param query запрос.
     */
    public void addToQueue(String query);
    
    /**
     * Добавить форматированный запрос (String.format) в очередь запросов к базе данных.
     * @param query запрос.
     * @param args аргументы для форматирования запроса.
     */
    public void addToQueue(String query, Object... args);
    
    /**
     * Исполнить запрос к базе данных.
     * @param query запрос.
     * @return результат исполнения запроса.
     */
    public ResultSet query(String query);
    
    /**
     * Исполнить форматированный запрос (String.format) к базе данных.
     * @param query запрос.
     * @param args аргументы для форматирования запроса.
     * @return результат исполнения запроса.
     */
    public ResultSet query(String query, Object... args);
    
}

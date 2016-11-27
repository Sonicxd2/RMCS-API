package ru.luvas.rmcs.api.sql;

/**
 *
 * @author 0xC0deBabe
 */
public interface SqlManager {

    /**
     * Получение коннектора для работы с базой данных.
     * @param key уникальный ключ для данного коннектора.
     * @return коннектор к базе данных.
     */
    public SqlConnector getConnector(String key);
    
}

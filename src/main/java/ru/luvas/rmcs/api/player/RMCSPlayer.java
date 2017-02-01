package ru.luvas.rmcs.api.player;

import org.bukkit.entity.Player;

/**
 *
 * @author 0xC0deBabe
 */
public interface RMCSPlayer {

    /**
     * Ник игрока.
     * @return ник игрока.
     */
    String getName();
    
    /**
     * Проверка на то, скрывается ли игрок под ником другого игрока (/hide).
     * @return true, если он скрывается.
     */
    boolean isHidden();
    
    /**
     * Если игрок скрывается под ником другого игрока, эта функция выведет ник, под которым он скрывается.
     * @return ник, под которым скрывается данный игрок.
     */
    String getVisibleName();
    
    /**
     * Возвращает короткий префикс (который используется в табе) данного игрока.
     * @return короткий префикс игрока.
     */
    String getShortPrefix();
    
    /**
     * Возвращает длинный префикс (который используется в чате) данного игрока.
     * @return длинный префикс игрока.
     */
    String getLongPrefix();
    
    /**
     * Возвращает суффикс данного игрока (например, звание).
     * @return суффикс игрока.
     */
    String getSuffix();
    
    /**
     * Возвращает полное имя игрока в табе (с учетом того, что он может скрываться под другим именем).
     * @return полное имя игрока в табе.
     */
    String getTabName();
    
    /**
     * Возвращает полное имя игрока в чате (с учетом того, что он может скрываться под другим именем).
     * @return полное имя игрока в чате.
     */
    String getColoredName();
    
    /**
     * Возвращает bukkit-объект данного игрока.
     * @return bukkit-объект игрока.
     */
    Player getPlayer();
    
    /**
     * Проверка на то, является ли игрок випом (или выше).
     * @return true, если игрок VIP или выше.
     */
    boolean isVip();
    
    /**
     * Проверка на то, является ли игрок вип+сом (или выше).
     * @return true, если игрок VIP+ или выше.
     */
    boolean isVipPlus();
    
    /**
     * Проверка на то, является ли игрок спонсором (или выше).
     * @return true, если игрок RICH или выше.
     */
    boolean isRich();
    
    /**
     * Проверка на то, является ли игрок ютубером (или выше).
     * @return true, если игрок YOUTUBE или выше.
     */
    boolean isYoutuber();
    
    /**
     * Проверка на то, является ли игрок ютубером+ (или выше).
     * @return true, если игрок YOUTUBE+ или выше.
     */
    boolean isYoutuberPlus();
    
    /**
     * Проверка на то, является ли игрок ютубером++ (или выше).
     * @return true, если игрок YOUTUBE++ или выше.
     */
    boolean isYoutuberPlusPlus();
    
    /**
     * Проверка на то, является ли игрок тестером (или выше).
     * @return true, если игрок Tester или выше.
     */
    boolean isTester();
    
    /**
     * Делает то же, что и isJuniorModerator()
     * @return то же, что и isJuniorModerator()
     */
    boolean isHelper();
    
    /**
     * Делает то же, что и isJuniorModerator()
     * @return то же, что и isJuniorModerator()
     */
    boolean isJrModerator();
    
    /**
     * Проверка на то, является ли игрок младшим модератором (или выше).
     * @return true, если игрок младший модератор или выше.
     */
    boolean isJuniorModerator();
    
    /**
     * Проверка на то, является ли игрок модератором (или выше).
     * @return true, если игрок Moderator или выше.
     */
    boolean isModerator();
    
    /**
     * Делает то же, что и isSeniorModerator()
     * @return то же, что и isSeniorModerator()
     */
    boolean isSrModerator();
    
    /**
     * Проверка на то, является ли игрок старшим модератором (или выше).
     * @return true, если игрок старший модератор или выше.
     */
    boolean isSeniorModerator();
    
    /**
     * Проверка на то, является ли игрок администратором (или выше).
     * @return true, если игрок Administrator или выше.
     */
    boolean isAdministrator();
    
    /**
     * Модификатор получения серебра для данного игрока.
     * @return модификатор получения серебра.
     */
    float getCoinsMultiplier();
    
    /**
     * Получение количества золота у игрока.
     * @return количество золота игрока.
     */
    int getGold();
    
    /**
     * Получение межсерверного уровня игрока.
     * @return межсерверный уровень игрока.
     */
    int getLevel();
    
    /**
     * Получение межсерверного опыта игрока.
     * @return межсерверный опыт игрока.
     */
    int getExperience();
    
    /**
     * Получение названия гильдии игрока.
     * @return null, если игрок не в гильдии; иначе название гильдии.
     */
    String getGuildName();
    
    
    
    /* SECURED SECTION *\
    
        Все методы ниже требуют особых разрешений у вашего плагина, которые
        обычно отсутствуют на тестовых серверах, но, в случае необходимости,
        выдаются на продакшн-серверах.
    
    */
    
    /**
     * Выдает случайный сундук игроку.
     * Требует у плагина разрешение giveAncientChest.
     * @throws SecurityException в случае, если требуемого разрешения нет.
     */
    void addRandomChestSecured() throws SecurityException;
    
    /**
     * Выдает случайный сундук игроку.
     * Требует у плагина разрешение giveAncientChest.
     * В случае отсутствия разрешения, ничего не происходит.
     */
    void addRandomChest();
    
    /**
     * Изменить количество золота у игрока.
     * Требует у плагина разрешение changeGold.
     * @param amount величина, на которую необходимо изменить золото.
     * @throws SecurityException в случае, если требуемого разрешения нет.
     */
    void changeGoldSecured(int amount) throws SecurityException;
    
    /**
     * Изменить количество золота у игрока.
     * Требует у плагина разрешение changeGold.
     * В случае отсутствия разрешения, ничего не происходит.
     * @param amount величина, на которую необходимо изменить золото.
     */
    void changeGold(int amount);
    
    /**
     * Добавить опыт игроку.
     * Требует у плагина разрешение changeExperience.
     * @param amount количество добавляемого опыта (не может быть отрицательным).
     * @throws SecurityException в случае, если требуемого разрешения нет.
     */
    void addExperienceSecured(int amount) throws SecurityException;
    
    /**
     * Добавить опыт игроку.
     * Требует у плагина разрешение changeExperience.
     * В случае отсутствия разрешения, ничего не происходит.
     * @param amount количество добавляемого опыта (не может быть отрицательным).
     */
    void addExperience(int amount);
    
    /**
     * Добавить игроку достижение с указанным названием.
     * Требует у плагина разрешение addAchievement_%категория достижений% (например, addAchievement_ANNIHILATION).
     * @param achievementName название достижения (не видимое, а техническое).
     * @throws SecurityException в случае, если требуемого разрешения нет.
     */
    void addAchievementSecured(String achievementName) throws SecurityException;
    
    /**
     * Добавить игроку достижение с указанным названием.
     * Требует у плагина разрешение addAchievement_%категория достижений% (например, addAchievement_ANNIHILATION).
     * В случае отсутствия разрешения, ничего не происходит.
     * @param achievementName название достижения (не видимое, а техническое).
     */
    void addAchievement(String achievementName);
    
}

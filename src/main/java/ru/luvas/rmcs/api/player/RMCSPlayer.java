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
    public String getName();
    
    /**
     * Проверка на то, скрывается ли игрок под ником другого игрока (/hide).
     * @return true, если он скрывается.
     */
    public boolean isHidden();
    
    /**
     * Если игрок скрывается под ником другого игрока, эта функция выведет ник, под которым он скрывается.
     * @return ник, под которым скрывается данный игрок.
     */
    public String getVisibleName();
    
    /**
     * Возвращает короткий префикс (который используется в табе) данного игрока.
     * @return короткий префикс игрока.
     */
    public String getShortPrefix();
    
    /**
     * Возвращает длинный префикс (который используется в чате) данного игрока.
     * @return длинный префикс игрока.
     */
    public String getLongPrefix();
    
    /**
     * Возвращает суффикс данного игрока (например, звание).
     * @return суффикс игрока.
     */
    public String getSuffix();
    
    /**
     * Возвращает полное имя игрока в табе (с учетом того, что он может скрываться под другим именем).
     * @return полное имя игрока в табе.
     */
    public String getTabName();
    
    /**
     * Возвращает полное имя игрока в чате (с учетом того, что он может скрываться под другим именем).
     * @return полное имя игрока в чате.
     */
    public String getColoredName();
    
    /**
     * Возвращает bukkit-объект данного игрока.
     * @return bukkit-объект игрока.
     */
    public Player getPlayer();
    
    /**
     * Проверка на то, является ли игрок випом (или выше).
     * @return true, если игрок VIP или выше.
     */
    public boolean isVip();
    
    /**
     * Проверка на то, является ли игрок вип+сом (или выше).
     * @return true, если игрок VIP+ или выше.
     */
    public boolean isVipPlus();
    
    /**
     * Проверка на то, является ли игрок ричем (или выше).
     * @return true, если игрок RICH или выше.
     */
    public boolean isRich();
    
    /**
     * Проверка на то, является ли игрок тестером (или выше).
     * @return true, если игрок QA или выше.
     */
    public boolean isQA();
    
    /**
     * Проверка на то, является ли игрок хелпером (или выше).
     * @return true, если игрок Helper или выше.
     */
    public boolean isHelper();
    
    /**
     * Проверка на то, является ли игрок модератором (или выше).
     * @return true, если игрок Moderator или выше.
     */
    public boolean isModerator();
    
    /**
     * Проверка на то, является ли игрок администратором (или выше).
     * @return true, если игрок Administrator или выше.
     */
    public boolean isAdministrator();
    
    /**
     * Модификатор получения серебра для данного игрока.
     * @return модификатор получения серебра.
     */
    public float getCoinsMultiplier();
    
}

package ru.luvas.rmcs.api.party;

/**
 * @author RINES
 */
public final class PartyMember {

    private final String nickname;
    private final String coloredNickname;
    private final String server;

    public PartyMember(String nickname, String coloredNickname, String server) {
        this.nickname = nickname;
        this.coloredNickname = coloredNickname;
        this.server = server;
    }

    /**
     * Метод, возвращающий ник данного члена группы.
     * @return ник игрока.
     */
    public String getNickname() {
        return this.nickname;
    }

    /**
     * Метод, возвращающий ник данного члена группы со всеми префиксами/суффиксами и обработанными цветовыми кодами.
     * @return полный цветной ник игрока.
     */
    public String getColoredNickname() {
        return this.nickname;
    }

    /**
     * Метод, возвращающий сервер, на котором находится данный член группы.
     * @return название сервера, на котором находится игрок.
     */
    public String getServer() {
        return this.server;
    }

}

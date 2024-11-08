public class Account {
    private int id;
    private String name;
    private Enum<AccessLevel> accessLevel;
    private DataBase db;

    Account(int id, String name, String password, DataBase db) {
        this.id = id;
        this.db = db;
        this.accessLevel = db.getAccessLevel(id);
        this.name = name;
    }

    public Row getData(int id) {
        if (this.id == id || this.accessLevel == AccessLevel.ADMIN) {
            return db.getRowWithPermission(id);
        }
        return db.getRow(id);
    }
}

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

public class DataBase {
    public HashMap<Integer, Row> db;
    private int id = 0;

    public DataBase() {
        this.db = new HashMap<Integer, Row>();
    }

    public void addRow(String name, Enum<AccessLevel> accessLevel, String secretInformation) {
        this.db.put(id++, new Row(name, accessLevel, secretInformation));
    }

    public void removeRow(int id) {
        this.db.remove(id);
    }

    public Row getRowWithPermission(int id) {
        return this.db.get(id);
    }

    public Row getRow(int id) {
        Row old = this.db.get(id);
        return new Row(old.name, old.accessLevel, "You have not permission");
    }

    public Enum<AccessLevel> getAccessLevel(int id) {
        for (Map.Entry<Integer, Row> row : db.entrySet()) {
            if (row.getKey() == id) {
                return row.getValue().accessLevel;
            }
        }
        return AccessLevel.GUEST;
    }
}

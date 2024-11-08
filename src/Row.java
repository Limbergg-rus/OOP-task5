import java.util.ArrayList;

public class Row {
    public String name;
    public Enum<AccessLevel> accessLevel;
    public String secretInformation;

    public Row(String name, Enum<AccessLevel> accessLevel, String secretInformation) {
        this.name = name;
        this.accessLevel = accessLevel;
        this.secretInformation = secretInformation;
    }

    @Override
    public String toString() {
        return "name='" + name + '\'' +
                ", accessLevel=" + accessLevel +
                ", secretInformation='" + secretInformation + '\'';
    }
}

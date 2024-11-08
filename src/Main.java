public class Main {
    public static void main(String[] args) {
        DataBase db= new DataBase();
        db.addRow("petux", AccessLevel.ADMIN, "perux" );
        db.addRow("lox", AccessLevel.ADMIN, "lox" );
        db.addRow("gigachad", AccessLevel.USER, "sigma" );
        db.addRow("krutoichel", AccessLevel.USER, "perux" );
        db.addRow("sigma", AccessLevel.USER, "perux" );
        db.addRow("pudge", AccessLevel.USER, "meta play" );
        db.addRow("huskar", AccessLevel.USER, "low skill" );
        db.addRow("tusk", AccessLevel.USER, "6*daedalus" );
        db.addRow("underlord", AccessLevel.USER, "tp to thron" );
        db.addRow("tidehunter", AccessLevel.USER, "arbuz" );
        Account a = new Account(1, "asd", "1231", db);
        System.out.println("WITH ADMIN PERMISSION(YOUR ID = 1)");
        System.out.println("id: "+ 1 + ", " +a.getData(1).toString());
        System.out.println("id: "+ 2 + ", " +a.getData(2).toString());

        System.out.println("WITH USER PERMISSION(YOUR ID = 5)");
        a = new Account(5, "asd", "1231", db);
        System.out.println("id: "+ 5 + ", " +a.getData(5).toString());
        System.out.println("id: "+ 6 + ", " +a.getData(6).toString());

    }
}
package hospitalmanager;

public class bazalog {

    static String login = "admin1";
    static String pass = "zxcvbnm";
    static String database="master"; //ma byc masster#@!!#@%
    static String server = "HP-PC\\SQLEXPRESS";
    static int port =1433;

    public static void SetLog(String logg) {
        login = logg;

    }

    public static void SetPas(String pasw) {
        pass = pasw;
    }

    public static void SetDatabase(String data) {
        database = data;

    }

    public static void SetServer(String serv) {
        server = serv;
    }

    public static void SetPort(int po) {
        port = po;
    }
}

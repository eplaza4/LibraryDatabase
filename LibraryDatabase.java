package JDBC;

import javax.xml.crypto.Data;
import java.util.ArrayList;
import java.util.List;
public abstract class LibraryDatabase {
    private static JDBC db1 = new JDBC();

    public static void main( String[] args ) {
        JDBC db1 = new JDBC();
        ArrayList<ArrayList<Object>> data = db1.getExecuteResult("select * from book;");
        printDatabase(data);

        db1.delete("first_name", "last_name");
        System.out.println("Deleted");

        data = db1.getExecuteResult("select * from book;");
        System.out.println("\nHere is the contents of the database:\n");
        printDatabase(data);
    }

    private static void printDatabase( ArrayList<ArrayList<Object>> data ) {
        for (List<Object> record : data) {
            System.out.println(record.toString());
        }
    }
}
import java.sql.*;

public class aug05_jdbc {
    private static final String url = "jdbc:mysql://localhost:3306/trail_db";
    private static final String username = "root";
    private static final String password = "Shahroz@3173";

    private static void createTable() {
        String query = "CREATE TABLE IF NOT EXISTS user ("
                + "id INT AUTO_INCREMENT PRIMARY KEY, "
                + "name VARCHAR(255), "
                + "email VARCHAR(255)"
                + ");";

        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            stmt.executeUpdate(query);
            System.out.println("Table created successfully (if it didn't exist already).");
            con.close();
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
    private static void insertTABLE(String name , String email){
        String query = "INSERT INTO USER (name, email) VALUES (?,?)";
        try{Connection con = DriverManager.getConnection(url,username,password);
            PreparedStatement ptmt = con.prepareStatement(query);

            ptmt.setString(1,name);
            ptmt.setString(2,email);
            ptmt.executeUpdate();
            System.out.println("data inserted sucessfully");

        } catch (Exception e) {
            System.out.println("error: "+ e.getMessage());
        }

    }
    private static void retrieveTable() {
        String query1 = "SELECT * FROM user";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(query1);

            System.out.println("\n--- User Table Data ---");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                System.out.println("ID: " + id + ", Name: " + name + ", Email: " + email);
            }

            con.close();
        } catch (Exception e) {
            System.out.println("Error retrieving data: " + e.getMessage());
        }
    }

    public static void Update_user(int id, String newName, String newEmail){
        String query2 = "UPDATE user SET name = ?, email = ? WHERE id = ?";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement(query2);
            pstmt.setString(1, newName);
            pstmt.setString(2, newEmail);
            pstmt.setInt(3, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) updated.");
            con.close();
        } catch (Exception e) {
            System.out.println("Error updating user: " + e.getMessage());
        }
    }


    public static void deleteUser(int id ){
        String query3 = "DELETE FROM user WHERE id = ?";
        try {
            Connection con = DriverManager.getConnection(url, username, password);
            PreparedStatement pstmt = con.prepareStatement(query3);
            pstmt.setInt(1, id);
            int rows = pstmt.executeUpdate();
            System.out.println(rows + " row(s) deleted.");
            con.close();
        } catch (Exception e) {
            System.out.println("Error deleting user: " + e.getMessage());
        }
    }



    public static void main(String[] args) {
//        createTable();
//        insertTABLE("shahroz","shahroz@email.com");
//        insertTABLE("ankit","ankit@example.com");
//        retrieveTable();
//
//        Update_user(1, "Shahroz Updated", "updated@email.com");
//        retrieveTable();
//        deleteUser(3);
//        deleteUser(4);
//        deleteUser(5);
//        deleteUser(6);

        retrieveTable();



    }
}

import javax.swing.plaf.nimbus.State;
import java.util.Scanner;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.Statement;
import java.sql.SQLException;
import java.sql.ResultSet;

public class Main {

    private static final String url = "jdbc:mysql://localhost:3306/reservation";

    private static final String username = "root";

    private static final String password = "rodrigos@250";

    public static void main(String args[]) throws ClassNotFoundException, SQLException {
        // Establishing the connection and Displaying the Menu Options
        try {
            Class.forName("com.sql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        }

        try {
            Connection connect = DriverManager.getConnection(url, username, password);
            while (true) {
                System.out.println();
                System.out.println("Welcome to Hilton Group of Hotels !");
                System.out.println();
                Scanner sc = new Scanner(System.in);
                System.out.println("1. Reserve a room");
                System.out.println("2. View Reservations");
                System.out.println("3. Get Room Number");
                System.out.println("4. Update Reservations");
                System.out.println("5. Delete Reservations");
                System.out.println("0. Exit");
                System.out.print("Choose an option: ");
                System.out.println();
                int choice = sc.nextInt();
                switch (choice) {
                    case 1:
                        reserveRoom(connect, sc);
                        break;
                    case 2:
                        viewReservations(connect, sc);
                        break;
                    case 3:
                        getRoomNumber(connect, sc);
                        break;
                    case 4:
                        updateReservation(connect, sc);
                        break;
                    case 5:
                        deleteReservation(connect, sc);
                        break;
                    case 0:
                        exit();
                        sc.close();
                        // Exiting our of the Loop
                        return;
                    default:
                        System.out.println("Invalid Choice ! Kindly try again ...");
                }
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException i) {
            System.out.println(i.getMessage());
        }
    }

    private static void reserveRoom(Connection connect, Scanner sc) {
        try {
            System.out.println("Enter your name : ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter the room number : ");
            int room_no = sc.nextInt();
            System.out.println("Enter the contact number :");
            int number = sc.nextInt();

            //Creating an SQL query which will be executed using the connect variable Statement stat = connect.createStatement(query)
            // The same information will be read by ResultSet Variable
            String retrieveQuery = "INSERT INTO info (guest_name,room_no,contact) VALUES ('"+name+"',"+room_no+","+number+");";
            //updating th same
            try (Statement stat = connect.createStatement()) {
                int rowsAffected = stat.executeUpdate(retrieveQuery);
                if (rowsAffected > 0) {
                    System.out.println("Reservation is Successful !");
                } else {
                    System.out.println("Reservation Failed !");
                }

            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    private static void viewReservations(Connection connect, Scanner sc) throws SQLException {
        //Here we will be retrieving all  the reservations currently available in the database
        String query = "SELECT * FROM info;";
        try (Statement stat = connect.createStatement(); ResultSet rs = stat.executeQuery(query)) {
            System.out.println("Current Reservations:");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
            System.out.println("| Reservation ID | Guest           | Room Number   | Contact Number       | Reservation Date        |");
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");

            while (rs.next()) {
                int reservationId = rs.getInt("id");
                String guestName = rs.getString("guest_name");
                int roomNumber = rs.getInt("room_no");
                String contactNumber = rs.getString("contact");
                String reservationDate = rs.getTimestamp("date").toString();

                // Format and display the reservation data in a table-like format
                System.out.printf("| %-14d | %-15s | %-13d | %-20s | %-19s   |\n",
                        reservationId, guestName, roomNumber, contactNumber, reservationDate);
            }
            System.out.println("+----------------+-----------------+---------------+----------------------+-------------------------+");
        }
    }

    private static void getRoomNumber(Connection connect, Scanner sc) {
        // retrieving the room number for a person name and reservation id
        System.out.println("Enter your reservation id :");
        int id = sc.nextInt();
        System.out.println("Enter guest name : ");
        String name = sc.next();
        sc.nextLine();

        String query = "SELECT room_no FROM info WHERE id=" + id + "AND guest_name=" + name + ";";
        try (Statement stat = connect.createStatement();
             ResultSet rs = stat.executeQuery(query)) {


            System.out.println("+-----------------+");
            System.out.println("|  Room Number    |");
            System.out.println("+-----------------+");

            // Reading the Data using
            if (rs.next()) {
                int room = rs.getInt("room_no");
                System.out.println(room);

            } else {
                System.out.println("Room number not found for given reservation number ");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void updateReservation(Connection connect, Scanner sc) {
        try {
            System.out.println("Enter the Reservation ID :");
            int id = sc.nextInt();
            sc.nextLine();  // To press the enter button for continuing

            // Checking if the reservation exists or not
            if (!reservationExists(connect, id)) {
                System.out.println("The Entered reservation does not exists !");
                return;
            }
            //else
            System.out.println("Enter the New Updated name : ");
            String name = sc.next();
            sc.nextLine();
            System.out.println("Enter the new room number : ");
            int room_no = sc.nextInt();
            System.out.println("Enter the contact number ");
            int number = sc.nextInt();

            String query = "UPDATE info SET guest_name='"+ name +"',contact=" + number + ",room_no=" + room_no + " WHERE id=" + id + ";";

            try {
                Statement stat = connect.createStatement();
                int affectedRows = stat.executeUpdate(query);
                if (affectedRows > 0) {
                    System.out.println("Updation is Successful :) !");
                } else {
                    System.out.println("Updation is not Successful :( ");
                }
            } catch (SQLException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }


    // Method to check whether a reservation exists or not before actually deleting it
    private static boolean reservationExists(Connection connect, int rsid) {
        // We will run a query for retrieving the data if the data s=is read return true else if the
        // SQL Exception Occurs returns false
        try {
            String query = "SELECT id FROM info WHERE id=" + rsid + ";";
            Statement stat = connect.createStatement();
            ResultSet rs = stat.executeQuery(query);

            return rs.next();
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private static void deleteReservation(Connection connection, Scanner scanner) {
        try {
            System.out.print("Enter reservation ID to delete: ");
            int reservationId = scanner.nextInt();

            if (!reservationExists(connection, reservationId)) {
                System.out.println("Reservation not found for the given ID.");
                return;
            }

            String sql = "DELETE FROM info WHERE id = "+ reservationId+";";

            try (Statement statement = connection.createStatement()) {
                int affectedRows = statement.executeUpdate(sql);

                if (affectedRows > 0) {
                    System.out.println("Reservation deleted successfully!");
                } else {
                    System.out.println("Reservation deletion failed.");
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

// Sleep has to be handled for the interrupted exception
    private static void exit() throws  InterruptedException{
        System.out.print("Exiting System");
        int i = 5;
        while (i != 0) {
            System.out.print(".");
            Thread.sleep(1000);
            i--;
        }
        System.out.println();
        System.out.println("ThankYou For Using Hotel Reservation System!!!");
    }


}


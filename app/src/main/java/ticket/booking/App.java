/*
 * This source file was generated by the Gradle 'init' task
 */
package ticket.booking;

import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.services.UserBookingService;
import ticket.booking.utils.UserServiceUtil;

import java.io.IOException;
import java.util.*;

public class App {
    public static void main(String[] args) {
        System.out.println("Running Train Booking System");
        Scanner sc = new Scanner(System.in);
        int option = 0;
        UserBookingService userBookingService;
        try {
            userBookingService = new UserBookingService();
        } catch (IOException e) {
            System.out.println("Something went Wrong !" + e.getMessage());
            return;
        }
        while (option != 7) {
            System.out.println("Choose option: ");
            System.out.println("1. Sign up");
            System.out.println("2. Login");
            System.out.println("3. Fetch Booking");
            System.out.println("4. Search Trains");
            System.out.println("5. Book a Seat");
            System.out.println("6. Cancel My Ticket");
            System.out.println("7. Exit the App");
            option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.print("Enter the username to signup");
                    String nameToSignUp = sc.next();
                    System.out.print("Enter your password: ");
                    String passwordToSignUp = sc.next();
                    User userToSignUp = new User(nameToSignUp, passwordToSignUp, UserServiceUtil.hashPassword(passwordToSignUp), new ArrayList<>(), UUID.randomUUID().toString()); // UUID  generates random id
                    userBookingService.signUp(userToSignUp);
                    break;
                case 2:
                    System.out.print("Enter username to login: ");
                    String nameToLogin = sc.next();
                    System.out.print("Enter password to login: ");
                    String passwordToLogin = sc.next();
                    User userToLogin = new User(nameToLogin, passwordToLogin, UserServiceUtil.hashPassword(passwordToLogin), new ArrayList<>(), UUID.randomUUID().toString());
                    try {
                        userBookingService = new UserBookingService(userToLogin);
                    } catch (IOException ex) {
                        return;
                    }
                    break;
                case 3:
                    System.out.println("Fetched Bookings: ");
                    userBookingService.fetchBooking();
//                case 4:
//                    System.out.print("Type your source station: ");
//                    String source = sc.next();
//                    System.out.println("Type your destination: ");
//                    String desti = sc.next();
//                    List<Train> trains = userBookingService.getTrains(source, desti);
//                    int index = 1;
//                    for(Train t: trains){
//                        System.out.println(index + "Train id: "+t.getTrainId());
//                        for (Map.Entry<String, String> entry: t.getStationTimes().entrySet()){
//                            System.out.println("Station "+entry.getKey()+"time: "+entry.getValue());
//                        }
//                    }
//                    System.out.println("Select a train by searching by typing 1,2,3 ...");
            }
        }
    }
}
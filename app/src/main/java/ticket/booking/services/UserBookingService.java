package ticket.booking.services;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import ticket.booking.entities.Train;
import ticket.booking.entities.User;
import ticket.booking.utils.UserServiceUtil;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class UserBookingService {
    private User user;
    private List<User> userList;

    private ObjectMapper objectMapper = new ObjectMapper();

    private static final String USERS_PATH = "app/src/main/java/ticket/booking/localDB/users.json";

    public UserBookingService() throws IOException{
        loadUsers();
    }

    public List<User> loadUsers() throws IOException{
        File users = new File(USERS_PATH);
        return objectMapper.readValue(users, new TypeReference<List<User>>() {
        });
    }

    public UserBookingService(User user1) throws IOException {
        this.user = user1;
        loadUsers();
    }

    public Boolean loginUser() {
        Optional<User> foundUser = userList.stream().filter(user1 -> {
            return user1.getName().equals(user.getName()) && UserServiceUtil.checkPassword(user.getPassword(), user1.getPassword());
        }).findFirst();
        return foundUser.isPresent();
    }

    public Boolean signUp(User user1) {
        try {
            userList.add(user1);
            saveUserListToFile();
            return Boolean.TRUE;
        } catch (IOException ex) {
            return Boolean.FALSE;
        }
    }

    private void saveUserListToFile() throws IOException {
        File userFile = new File(USERS_PATH);
        objectMapper.writeValue(userFile, userList);
    }
//    json -> Object(user) (Deserialize).
//    Object(user) -> json (Serialize).

    public void fetchBooking() {
        user.printTickets();
    }

    public Boolean cancelBooking(String ticketId) {
        // Pending
        return Boolean.FALSE;
    }
    public List<Train> getTrains(String source, String destination){
        try{
         TrainService trainService = new TrainService();
         return trainService.searchTrains(source, destination);
        } catch (Exception e) {
                return new ArrayList<>();
        }
    }
}
package ticket.booking.entities;

import java.util.List;

public class User {
    private String name;
    private String password;
    private String hashPassword;
    private List<Ticket> ticketBooked;
    private String userId;

    public User(String name, String password, String hashPassword, List<Ticket> ticketBooked, String userId) {
        this.name = name;
        this.password = password;
        this.hashPassword = hashPassword;
        this.ticketBooked = ticketBooked;
        this.userId = userId;
    }
    public User() {};

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getHashPassword() {
        return hashPassword;
    }

    public void setHashPassword(String hashPassword) {
        this.hashPassword = hashPassword;
    }

    public List<Ticket> getTicketBooked() {
        return ticketBooked;
    }

    public void setTicketBooked(List<Ticket> ticketBooked) {
        this.ticketBooked = ticketBooked;
    }

    public Object getHashedPassword() {
        return ticketBooked;
    }

    public void printTickets(){
        for(int i=0; i<ticketBooked.size(); i++){
            System.out.println(ticketBooked.get(i).getTicketInfo());
        }
    }
}
package ticket.booking.entities;

import java.util.Date;


public class Ticket {
   private String tickedId;
   private String userId;
   private String source;
   private String destination;
   private Date dateOfTravel;
   private Train train;

   public Ticket(String tickedId, String userId, String source, String destination, Date dateOfTravel, Train train) {
      this.tickedId = tickedId;
      this.userId = userId;
      this.source = source;
      this.destination = destination;
      this.dateOfTravel = dateOfTravel;
      this.train = train;
   }

   public String getTicketInfo(){
      return String.format("Ticket ID: %s belongs to User %s from %s to %s on %s", tickedId, userId, source, destination, dateOfTravel);
   }

   public String getTickedId() {
      return tickedId;
   }

   public void setTickedId(String tickedId) {
      this.tickedId = tickedId;
   }

   public String getUserId() {
      return userId;
   }

   public void setUserId(String userId) {
      this.userId = userId;
   }

   public String getSource() {
      return source;
   }

   public void setSource(String source) {
      this.source = source;
   }

   public String getDestination() {
      return destination;
   }

   public void setDestination(String destination) {
      this.destination = destination;
   }

   public Date getDateOfTravel() {
      return dateOfTravel;
   }

   public void setDateOfTravel(Date dateOfTravel) {
      this.dateOfTravel = dateOfTravel;
   }

   public Train getTrain() {
      return train;
   }

   public void setTrain(Train train) {
      this.train = train;
   }
}
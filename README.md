# TrainBooking-CLI_JAVA

Java CLI-Based Train Booking System
This project is a Command-Line Interface (CLI) Train Booking System developed in Java. It demonstrates the use of Java Streams, Collections, Hashing, and JSON for local data storage. The application enables users to search for trains, book tickets, and store booking information in a secure, efficient way. The system is designed with a simple architecture, using core Java components and libraries for user authentication and booking management.


**Features**
-- User Authentication:
Securely hash and store user passwords using BCrypt for safe login and user account management.

-- Train Search and Booking:
Users can browse available trains, filter them based on specific criteria, and book tickets.

-- Data Persistence:
Stores user and train data in JSON files (user.json and train.json), simulating a lightweight local database for easy data management.

-- Stream Processing and Filtering:
Utilizes Java Streams to efficiently process and filter collections, making train search and booking faster and more readable.

*Project Structure*
1. entity Package
Contains entity classes that represent core elements of the system:

Ticket: Represents a booked ticket with details of the booking, user, and train.
Train: Contains train information, such as train ID, route, schedule, and available seats.
User: Represents user details, including ID, name, and hashed password.

2. services Package
Includes services that handle core functionalities:

-- TrainService.java:
Provides methods for searching and filtering trains, checking availability, and retrieving train data from train.json.

-- UserBookingService.java:
Manages user login, registration (with password hashing using BCrypt), and ticket booking operations, ensuring each booking is securely recorded.

3. Local JSON Database
The application simulates a local database using JSON files:

- user.json: Stores registered user details, including IDs, names, and hashed passwords for secure authentication.
- train.json: Maintains available train information, such as routes, schedules, and seating data.
  
*Technologies and Libraries Used*
Java Collections (ArrayList, Map)
Java Streams (filter, map)
BCrypt for Password Hashing: Ensures passwords are securely stored.
JSON for Data Persistence: Simulates local storage for users and train details.

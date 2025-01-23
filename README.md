

# CricketVerse - IPL Team Management System 🏏

**CricketVerse** is a comprehensive IPL team management system built using **Java**, **JDBC**, **Maven**, and **MySQL**. The system allows users to manage IPL teams and players efficiently, with CRUD operations and an easy-to-use menu-driven interface.

---

## Features

- **Add Teams and Players**: Add new teams and players with attributes like name, age, gender, and specialization.
- **View Teams and Players**:
  - List all IPL teams.
  - Display all players of a specific team.
- **Update Player Details**: Modify existing player information.
- **Delete Teams and Players**: Remove a team or player from the system.
- **Filter Players**:
  - Search players by specialization, age, or gender.

---

## Tech Stack

- **Backend**: Java with JDBC
- **Database**: MySQL
- **Dependency Management**: Maven
- **Design Pattern**: Multi-layered architecture (Entity, DAO, Service, Controller, Client)

---

## Project Structure

```plaintext
CricketVerse/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.cricketverse/
│   │   │   │   ├── entity/        # Players POJO class
│   │   │   │   ├── dao/           # JDBC-based data access
│   │   │   │   ├── service/       # Business logic
│   │   │   │   ├── controller/    # Request handling
│   │   │   │   ├── client/        # Main method and menu
│   │   ├── resources/
├── pom.xml                        # Maven dependencies

```
---

## Database Schema

The project uses a MySQL database with the following schema for the `product` table:

| Column    | Data Type | Description                   |
|-----------|-----------|--------------------------------
|player_id	|   INT	    | Primary key (Auto-incremented)|
| name	    | VARCHAR   |	Name of the player.           |
| age	      |  INT      |	  Age of the player.          |
| gender	  | VARCHAR	  | Gender of the player.         |
| team_name |	VARCHAR	  | Name of the team.             |
|specialization|	VARCHAR	|Specialization (e.g., Batsman, Bowler).|

---

## Setup and Installation

1. Clone the repository:  
   ```bash
   git clone https://github.com/yourusername/cricketverse.git
   cd cricketverse
   ```
 
2. Configure the database connection in the DAO layer:

   ```java
    String url = "jdbc:mysql://localhost:3306/cricketverse_db";
   String username = "your-username";
   String password = "your-password";
   Connection connection = DriverManager.getConnection(url, username, password);


   ```

3. Create the cricketverse_db database and import the provided SQL script to create tables.

4. Build the project using Maven: 
   ```bash
    mvn clean install

   ```

5. Run the application:
     Navigate to the Client class and execute the main method.

---



## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---



## Contact

For questions or feedback, feel free to reach out:

- **Email**: atharvajadhav451311@gmail.com
- **GitHub**: [atharva1311](https://github.com/atharva1311)

---

### Happy Coding! 🚀

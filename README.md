#  CricketVerse 🏏

**CricketVerse** is an IPL team management system that allows users to manage and analyze IPL teams and players. Built with Hibernate and Maven, it supports CRUD operations to add, update, delete, and retrieve information about players and teams.

---

## Features 🌟

- **Player Management**:
  - Add, update, delete, and view player details.
- **Team Management**:
  - Organize players by IPL teams.
  - Retrieve team-wise player lists.
- **Filtering and Sorting**:
  - Filter players by age, gender, or specialization.
- **Hibernate Integration**:
  - Efficient database interaction using Hibernate ORM.
- **Menu-Driven Interface**:
  - Easy-to-use client menu for seamless interaction.

---


## Project Structure

```plaintext
CricketVerse/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.cricketverse/
│   │   │   │   ├── entity/        # Players POJO class
│   │   │   │   ├── dao/           # Hibernate-based data access
│   │   │   │   ├── service/       # Business logic
│   │   │   │   ├── controller/    # Request handling
│   │   │   │   ├── client/        # Main method and menu
│   │   ├── resources/
│   │   │   ├── hibernate.cfg.xml  # Hibernate configuration
├── pom.xml                        # Maven dependencies
```
---
# Prodify - Product Management System

**Prodify** is a robust and efficient product management system built using **Spring Boot**, **JSP**, **JDBC**, and **MySQL**. The system allows users to perform CRUD operations on product data, providing a user-friendly interface and seamless functionality.

---

## Features

- **Add Product**: Add new products with details such as name, price, quantity, and category.
- **View All Products**: Display all products in a structured table format.
- **Update Product**: Modify existing product details.
- **Delete Product**: Remove products from the system.
- **Search Products**: Filter and search for products by category, name, or other attributes.

---

## Tech Stack

- **Backend**: Spring Boot
- **Frontend**: JSP (Java Server Pages) with custom CSS
- **Database**: MySQL
- **Database Interaction**: JDBC
- **Design**: Clean and modern UI with an external CSS file for styling

---

## Project Structure

```plaintext
Prodify/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   ├── com.prodify/
│   │   │   │   ├── controller/   # Controllers to handle requests
│   │   │   │   ├── service/      # Business logic layer
│   │   │   │   ├── dao/          # Data Access Objects
│   │   │   │   ├── model/        # Entity classes
│   │   ├── resources/
│   │   │   ├── application.properties  # Database and app configurations
│   │   ├── webapp/
│   │   │   ├── WEB-INF/
│   │   │   │   ├── jsp/          # JSP files (Frontend pages)
│   │   │   ├── css/              # External CSS files
│   ├── test/
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
 
2. Configure the database connection in hibernate.cfg.xml:

   ```xml
  <property name="hibernate.connection.url">jdbc:mysql://localhost:3306/cricketverse_db</property>
<property name="hibernate.connection.username">your-username</property>
<property name="hibernate.connection.password">your-password</property>

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

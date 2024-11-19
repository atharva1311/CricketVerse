# IPL Team Management System  

## Description  
The IPL Team Management System is a Java-based application designed to manage IPL teams and players effectively. It provides functionalities such as viewing all teams, managing player data, and analyzing player performance. The project incorporates CRUD operations using JDBC and uses Maven for dependency management and build automation.  

## Features  
### Team Management  
- View all IPL teams.  
- Display players of a specific team.  

### Player Management  
- View detailed player statistics.  
- Add new players to the database.  
- Remove players dynamically.  

### Performance Analysis  
- List top-performing batsmen with over 4,000 runs.  
- Identify best bowlers with more than 100 wickets.  
- Display team-specific batsmen (runs > 2,000) and bowlers (wickets > 50).  

## Technologies Used  
- **Programming Language**: Java  
- **Database Connectivity**: JDBC  
- **Build Tool**: Maven  
- **Collections Framework**: List, Set  

## Project Structure  
```plaintext
IPL-Team-Management-System
├── src
│   ├── entity       # Contains the Player POJO class
│   ├── dao          # Handles database operations using JDBC
│   ├── service      # Contains business logic and functionality
│   ├── controller   # Calls methods from the service layer
│   └── client       # Main method with menu-driven interface
├── pom.xml          # Maven configuration file
└── README.md        # Project documentation
```

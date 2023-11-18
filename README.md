# Back-end dslist / Game List

This Java project with Spring Boot serves as the backend for a gaming website, providing endpoints to retrieve summarized data for all games in a specific list or for a particular game. Additionally, it allows for the functionality to update the display order of games in the list. The PostgreSQL test environment is managed via Docker.

## Prerequisites

- Java (17)
- Spring Boot (3.0.12)
- Docker

## Database Configuration

I used Docker to set up a PostgreSQL test environment. Make sure you have Docker installed and execute the following command:

```bash
docker-compose up -d
Project Configuration
Clone the repository:
bash
Copy code
git clone https://github.com/your-username/your-project.git
Open the project in your preferred IDE.

Configure the database properties in the application.properties file:

properties
Copy code
spring.datasource.url=jdbc:postgresql://localhost:5432/your-database
spring.datasource.username=your-username
spring.datasource.password=your-password
Run the Spring Boot application.
Endpoints
To retrieve all games, use:
GET /games

To retrieve specific games, use:
GET /games/{id}

To update the order of games, use:
PUT/lists/{id_list}/replacement

Request Body:

json
Copy code
{
  "sourceIndex": 3,
  "destinationIndex": 1
}


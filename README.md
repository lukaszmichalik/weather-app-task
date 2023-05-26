# weather-app-task

Spring Boot app providing weather information from external API.

## Running the Application

- download the source code from `Github` repository,

- In the root folder of the application -> `/weather-app-task`

run:

```bash
$ mvn install
```

- In order to create and run docker containers containing `database` and `weather-app-task`, run following command in the same directory (`/weather-app-task`):

```bash
$ docker compose up
```
Note: `maven`, `docker` and `docker compose` must be installed and the `docker daemon` must be running.

## Testing API with Postman

- In order to test api import file -> `weather-app-task.postman_collection.json` into Postman.

## Accessing PostgreSQL database container

Accessing database allows to check the contents of database after API testing.

- In new command prompt run:

```bash
$ docker exec -it weather-app-db psql -U postgres
```
- Once connected to the PostgreSQL container, use `\c` to connect to `weather_app_db`. Run following command:

```sql
postgres=# \c weather_app_db
```

- Check the contens of family table:

```sql
weather_app_db=# SELECT * FROM requests;
```

## Stopping and Removing docker containers

- In order to stop and remove running containers, you can run following command in the root directory of application (`\weather-app-task`):

```bash
$ docker compose down
```

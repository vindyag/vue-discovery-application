## Steps 

### 1. Set up Consul:
Extract or download consul and navigate to the folder.
Start the Consul server: 
```
./consul agent -dev
```
Register your Spring Boot application with Consul as in the application.properties file.

### 2. Configure Traefik:
Add the necessary configuration options to the traefik.toml file.
Start it up using the docker-compose file
```
docker-compose up
```

### 3. Configure Spring Boot
Configure Spring Boot as in this project and startup

### 3. Verify
Verify that your application is registered with Consul and visible in the Consul UI.
Verify that your application is accessible through Traefik by making requests to the defined endpoints.

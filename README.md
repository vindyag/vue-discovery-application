## Structure

### 

## Steps 

### 1. Set up Consul:
Extract or download consul and navigate to the folder.
Start the Consul server: 
```
./consul agent -dev
```
Register your Spring Boot application with Consul as in the application.properties file.

### 2. Setup Traefik:
Add the necessary configuration options to the traefik.toml file.
Start it up using the docker-compose file
```
docker-compose up
docker-compose down
```
### 3. Build the Vue files
Build and bundle the Vue files using a package manager
```
yarn build or npm run build
```
Then copy the web file in dist folder to gateway-service:server src/main/resources/static folder
You use following gradle task under gateway-service -> tasks -> application -> ```copyVueApp```

### 3. Deploy web app in Spring Boot embedded tomcat
You use following gradle task under gateway-service -> tasks -> other -> ```bootRun```

### 3. Verify
Verify that your application is registered with Consul and visible in the Consul UI.
Verify that your application is accessible through Traefik by making requests to the defined endpoints.
Verify that your backend applications are routed via Zuul Gateway

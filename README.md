# Salesforce Platform Event Subscriber

This project is a Spring Boot application designed to subscribe to Salesforce Platform Events. It leverages gRPC, Protobuf, and OpenFeign for robust event-driven integration with Salesforce.

## Features

- Subscribes to Salesforce Platform Events in real-time.
- Uses Spring Boot for rapid development and configuration.
- Integrates with Salesforce using OpenFeign clients.
- Supports gRPC and Protobuf for efficient communication.
- Easily configurable via `application.yml`.

## Prerequisites

- Java 17 or later
- Maven 3.8+
- Salesforce account with Platform Events enabled

## Getting Started

1. **Clone the repository:**
   ```bash
   git clone https://github.com/auyongjinyoo/salesforce-platform-event-subscriber.git
   cd salesforce-platform-event-subscriber
   ```

2. **Configure application properties:**
   Edit `src/main/resources/application.yml` with your Salesforce credentials and event details.

3. **Build the project:**
   ```bash
   ./mvnw clean package
   ```

4. **Run the application:**
   ```bash
   ./mvnw spring-boot:run
   ```

## Configuration

All configuration is managed via `src/main/resources/application.yml`. Make sure to set:
- Salesforce authentication details (client ID, secret, username, password)
- Platform Event API names
- Any custom settings for your integration

## Dependencies

Key dependencies (see `pom.xml` for full list):
- Spring Boot Starter
- Spring Cloud OpenFeign
- gRPC (Netty, Protobuf, Stub)
- Lombok (for code generation)

## Project Structure

```
src/
  main/
    java/
      com/auyongjinyoo/salesforce/demo/   # Main application code
    resources/
      application.yml                     # Main configuration
  test/
    java/                                 # Unit and integration tests
pom.xml                                   # Maven dependencies and build config
```

## Contributing

Contributions are welcome! Please fork the repository and submit a pull request.

## License

This project is licensed under the MIT License.

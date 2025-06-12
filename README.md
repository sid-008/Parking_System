# Parking Management System

## Supported versions:

- Java 21
- Spring boot 3.2.2
- MongoDB 7.0
- MongoDB Java driver 4.11.1
- Maven 3.8.7
- OpenAPI 3

## Commands

- Start the server in a console with `mvn spring-boot:run`.

## Swagger & OpenAPI 3
- `springdoc-openapi-starter-webmvc-ui` library dependency is in the `pom.xml`.
- The Swagger UI can be seen at [http://localhost:8080/swagger-ui/index.html](http://localhost:8080/swagger-ui/index.html).
- The JSON Open API documentation 3.0.1 is at [http://localhost:8080/v3/api-docs](http://localhost:8080/v3/api-docs).
- The YAML Open API documentation 3.0.1 is at [http://localhost:8080/v3/api-docs.yaml](http://localhost:8080/v3/api-docs.yaml).

## Example API Calls

```bash
curl -X 'POST' \
  'http://localhost:8080/api/person' \
  -H 'accept: */*' \
  -H 'Content-Type: application/json' \
  -d '{
  "firstName": "Maxime",
  "lastName": "Beugnet",
  "age": 35,
  "address": {
    "number": 123,
    "street": "avenue des Champs-Elysées",
    "postcode": "75000",
    "city": "Paris",
    "country": "France"
  },
  "insurance": true,
  "cars": [
    {
      "brand": "Peugeot",
      "model": "3008",
      "maxSpeedKmH": 280
    }
  ]
}'
```

```bash
curl -X 'GET' 'http://localhost:8080/api/persons' -H 'accept: */*'
```

# TODO
- Implement a react/nextjs site for this

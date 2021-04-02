## Spring Boot Libraries

This module contains articles about various Spring Boot libraries

### The Course
The "REST With Spring" Classes: http://bit.ly/restwithspring

### Relevant Articles:

- [Guide to ShedLock with Spring](https://www.nabgc.com/shedlock-spring)
- [A Guide to the Problem Spring Web Library](https://www.nabgc.com/problem-spring-web)
- [Generating Barcodes and QR Codes in Java](https://www.nabgc.com/java-generating-barcodes-qr-codes)
- [Rate Limiting a Spring API Using Bucket4j](https://www.nabgc.com/spring-bucket4j)
- [Spring Boot and Caffeine Cache](https://www.nabgc.com/spring-boot-caffeine-cache)
- [Spring Boot and Togglz Aspect](https://www.nabgc.com/spring-togglz)
- [Getting Started with GraphQL and Spring Boot](https://www.nabgc.com/spring-graphql)
- [An Introduction to Kong](https://www.nabgc.com/kong)

### GraphQL sample queries

Query
```shell script
curl \
--request POST 'localhost:8081/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"query {\n    recentPosts(count: 2, offset: 0) {\n        id\n        title\n        author {\n            id\n            posts {\n                id\n            }\n        }\n    }\n}"}'
```

Mutation
```shell script
curl \
--request POST 'localhost:8081/graphql' \
--header 'Content-Type: application/json' \
--data-raw '{"query":"mutation {\n    writePost(title: \"New Title\", author: \"Author2\", text: \"New Text\") {\n        id\n        category\n        author {\n            id\n            name\n        }\n    }\n}"}'
```

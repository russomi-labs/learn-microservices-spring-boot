# Notes

- Start RabbitMQ

``` shell
docker-compose up -d
```

- Start multiplication

``` shell
cd multiplication
./gradlew bootRun
```

- Start gamefication

``` shell
cd gamefication
./gradlew bootRun
```

- Run the frontend

``` shell
cd challenges-frontend
npm run start
```

- Use to create successful attempts

``` shell
http POST :8080/attempts factorA=15 factorB=20 userAlias=test1 guess=300
```

- Open RabitMQ UI

``` shell
open http://localhost:15672
```

## Gamefication becomes unavailable

- Stop Gamefication

- Send attempts

``` shell
http POST :8080/attempts factorA=15 factorB=20 userAlias=test1 guess=300
```

- Open RabitMQ UI and confirm they are queued

``` shell
open http://localhost:15672
```

- Start gamefication

``` shell
cd gamefication
./gradlew bootRun
```

- Confirm the messages are processed and the leaderboard updates

## Message Broker becomes unavailable

- TODO

## Transactionality

- TODO

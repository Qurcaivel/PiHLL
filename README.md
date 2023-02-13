# PiHLL workspace

This repository contains project dedicated to practice works
(aka laboratory works) on PiHLL (Programming in high-level languages).

## Environment

There are following tools was used for project development:

_Java_
```
❯ java --version
java 19.0.2 2023-01-17
Java(TM) SE Runtime Environment (build 19.0.2+7-44)
Java HotSpot(TM) 64-Bit Server VM (build 19.0.2+7-44, mixed mode, sharing)
```

_Maven_
```
❯ mvn --version
Apache Maven 3.8.7 (b89d5959fcde851dcb1c8946a785a163f14e1e29)
...
```

## Development stages

Practice work tasks:

1. Intro
   - Создать и запустить локально простой веб/REST сервис, используя любой открытый (например, в открытом доступе в сети  интернет) пример с использованием Java stack: Spring (Spring Boot)/maven/gradle/Jersey/Spring MVC. 
   - Добавить GET endpoint, принимающий входные параметры в качестве queryParams в URL и возвращающий результат в виде JSON согласно варианту. 

2. Error logging/handling
   - Добавить валидацию входных параметров с возвращением 400 ошибки.
   - Добавить обработку внутренних unchecked ошибок с возвратом 500 ошибки.
   - Добавить логирование действий и ошибок.
   - Написать unit test.

3. Collections intro, project structure 
   - Добавить простейший кэш в виде in-memory Map для сервиса. Map должна содержаться в отдельном бине/классе, который должен добавляться в основной сервис с помощью dependency injection механизм Spring.

4. Concurrency 
   - Добавить сервис для подсчёта обращений к основному сервису. Счётчик должен быть реализован в виде отдельного класса, доступ к которому должен быть синхронизирован. 
   - Используя jmeter/postman или любые другие средвста сконфигурировать нагрузочный тест и убедиться, что счётчик обращений работает правильно при большой нагрузке.

5. Functional programming with Java 8
   - Преобразовать исходный сервис для работы со списком параметров для bulk операций используя Java 8 лямбда выражения.
   - Добавить POST метод для вызова bulk операции и передачи списка параметров в виде JSON.

6. Functional filtering and mapping
   - Добавить аггрегирующий функционал (подсчёт макс, мин, средних значений) для входных параметров и результатов с использованием Java 8 map/filters функций. Расширить результат POST соотвественно.

7. Data persistence
   - Добавить возможность сохранения всех результатов вычислений в базе данных или файле, используя стандартные persistence фреймворки Java (Spring Data/Hibernate/MyBatis).

8. Asynchronous calls
   - Добавить возможность асинхронного вызова сервиса используя future, возвращать статус вызова REST сервиса не дожидаясь результатов подсчётов. Результаты подсчётов должны быть представлены в БД по предопределённой ID.

## Personal task (variant 10)

Сервис должен принимать один параметр (строка) и вернуть результат проверки предоставленной параметром строки на полином («палиндром»/«не палиндром»).

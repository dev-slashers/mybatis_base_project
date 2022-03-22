![This is an image](https://mybatis.org/images/mybatis-logo.png)


#### This project contains base springboot application with MyBatis 3.


#### Create default user:
```
$   curl --location --request POST 'http://localhost:8000/user/add' \
    --header 'Content-Type: application/json' \
    --data-raw '{
    "name": "You Name",
    "surname": "You Lastname"
    }'
```

####  Get user by id:
```
$   curl --location --request GET 'http://localhost:8000/user/<You user ID>
```

## How to setup local database with User table

#### Run instance MySQL with PHPMyAdmin
```
$   docker-compose -f docker-compose.yml up -d
```


#### Login from url `http://localhost:8080` with credentials:

```
Server: db
Username: root
Password: example
```

#### create table with insert
```
create table user(
    id int not null primary key auto_increment
    name varchar(24) default null,
    surname varchar(24) default null
);
```


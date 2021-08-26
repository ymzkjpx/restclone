----------------------------- greeting
DROP TABLE IF EXISTS greeting;
DROP SCHEMA if EXISTS greeting;
CREATE SCHEMA greeting;
DROP SEQUENCE if EXISTS greeting.request_id;
CREATE SEQUENCE greeting.request_id;
DROP TABLE if EXISTS greeting.requests;

CREATE TABLE greeting.requests
(
    request_id INTEGER NOT NULL ,
    greet_to VARCHAR(50) NOT NULL DEFAULT 'anonymous' ,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);


----------------------------- account
DROP TABLE IF EXISTS users;
DROP SEQUENCE IF EXISTS user_id;
DROP SCHEMA IF EXISTS account CASCADE;
CREATE SCHEMA account;

CREATE TABLE account.users
(
    user_id INTEGER PRIMARY KEY ,
    screen_name TEXT NOT NULL ,
    created_at TIMESTAMP WITH TIME ZONE
);


----------------------------- message
DROP TABLE IF EXISTS messages, routing;
DROP SEQUENCE IF EXISTS message_id;
CREATE SEQUENCE message_id;
DROP SCHEMA IF EXISTS message CASCADE;
CREATE SCHEMA message;

CREATE TABLE message.routing
(
    message_id INTEGER PRIMARY KEY ,
    sentence TEXT NOT NULL ,
    created_at TIMESTAMP WITH TIME ZONE
);

CREATE TABLE message.messages
(
    message_id INTEGER PRIMARY KEY ,
    from_user_id INTEGER NOT NULL ,
    to_user_id INTEGER NOT NULL ,
    created_at TIMESTAMP WITH TIME ZONE ,
    FOREIGN KEY (message_id)
        REFERENCES message.routing (message_id) ,
    FOREIGN KEY (from_user_id)
        REFERENCES account.users (user_id) ,
    FOREIGN KEY (to_user_id)
        REFERENCES account.users (user_id)
);

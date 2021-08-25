DROP TABLE IF EXISTS user_accounts, greeting;

DROP SCHEMA if EXISTS greeting;
CREATE SCHEMA greeting;

DROP SEQUENCE if EXISTS greeting.request_id;
CREATE SEQUENCE greeting.request_id;

DROP TABLE if EXISTS greeting.requests;
CREATE TABLE greeting.requests
(
    request_id INTEGER     NOT NULL,
    greet_to   VARCHAR(50) NOT NULL DEFAULT 'anonymous',
    created_at TIMESTAMP            DEFAULT CURRENT_TIMESTAMP
);



-- Original GreetingAPI
DROP SEQUENCE IF EXISTS user_id;
DROP SCHEMA IF EXISTS users CASCADE;
CREATE SCHEMA users;

CREATE TABLE users.user_accounts
(
    user_id Integer PRIMARY KEY
    , screen_name TEXT NOT NULL
    , created_at timestamp WITH time ZONE
);


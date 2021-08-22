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
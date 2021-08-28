INSERT INTO
    greeting.requests (request_id, greet_to)
VALUES
    (1, 'Alice')
  , (2, 'Bob')
  , (3, 'サトシ');


----------------------------- account
INSERT INTO
    account.users
    (user_id, screen_name)
VALUES
    (1, 'Alice')
  , (2, 'Bob')
  , (3, 'Carol')
;

----------------------------- message

INSERT INTO message.routing (message_id, sentence)
VALUES
    (1, 'HelloBob'),
    (2, 'HelloCarol'),
    (3, 'HelloAlice')
;

insert into message.messages
(message_id, from_user_id, to_user_id)
VALUES
(1, 1, 2),
(2, 2, 3),
(3, 3, 1)
;
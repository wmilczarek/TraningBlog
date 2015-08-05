
CREATE DATABASE blog;

CREATE TYPE role AS ENUM ('user', 'admin', 'masterAdmin');


CREATE TABLE users (
  id SERIAL PRIMARY KEY,
  email VARCHAR(120) NOT NULL,
  login VARCHAR(75) NOT NULL,
  password VARCHAR(75) NOT NULL,
  role role default 'user'
);

CREATE TABLE posts (
  id SERIAL PRIMARY KEY,
  user_id INTEGER REFERENCES users(id) NOT NULL,
  isActive BOOLEAN DEFAULT TRUE,
  author_login Varchar(75) NOT NULL
);

CREATE TABLE comment (
  id SERIAL PRIMARY KEY,
  user_id INTEGER REFERENCES users(id) NOT NULL,
  post_id INTEGER REFERENCES posts(id) NOT NULL,
  approved BOOLEAN DEFAULT TRUE,
  isActive BOOLEAN DEFAULT TRUE,
  htmlBody Text NOT NULL
);

CREATE TABLE shouts (
  id SERIAL PRIMARY KEY,
  is_active BOOLEAN DEFAULT TRUE,
  user_id INTEGER REFERENCES users(id),
  timestamp Date,
  shout_comment VARCHAR(255) NOT NULL
);

commit;
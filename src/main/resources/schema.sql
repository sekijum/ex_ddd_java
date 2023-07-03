DROP SCHEMA IF EXISTS example CASCADE;

CREATE SCHEMA example;

CREATE TABLE example.members (
  id INTEGER PRIMARY KEY UNIQUE,
  full_name VARCHAR(40) NOT NULL,
  mail_address VARCHAR(255) NOT NULL UNIQUE,
  phone_number VARCHAR(13) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);

CREATE SEQUENCE example.member_Id;

CREATE TABLE example.member_settings (
  member_id INTEGER NOT NULL UNIQUE,
  theme VARCHAR(30) NOT NULL,
  autologin BOOLEAN NOT NULL
    ,FOREIGN KEY (member_id) REFERENCES example.members(id)
);

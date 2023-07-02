DROP SCHEMA IF EXISTS todo CASCADE;
CREATE SCHEMA todo;

CREATE TABLE todo.members (
  member_Id  INTEGER PRIMARY KEY,
  name VARCHAR(40) NOT NULL,
  mail_address VARCHAR(255) NOT NULL,
  phone_number VARCHAR(13) NOT NULL,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP
);
CREATE SEQUENCE todo.member_Id;

CREATE TABLE todo.member_profiles (
  member_profile_id  INTEGER PRIMARY KEY,
  created_at TIMESTAMP NOT NULL DEFAULT CURRENT_TIMESTAMP,
    FOREIGN KEY (member_profile_id) REFERENCES todo.members(member_Id)
);
CREATE SEQUENCE todo.member_profile_id;

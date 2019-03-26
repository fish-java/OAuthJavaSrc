create database if not exists
  oauth;
use oauth;

CREATE USER 'oauth_user'@'%'
  IDENTIFIED BY 'qwe123';

GRANT ALL PRIVILEGES ON oauth.*
  TO 'oauth_user'@'%'
  WITH GRANT OPTION;
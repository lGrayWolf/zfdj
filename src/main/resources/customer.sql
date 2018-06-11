CREATE  TABLE  customer(
  id int(20) NOT NULL PRIMARY KEY AUTO_INCREMENT,
  name VARCHAR(255) DEFAULT NULL ,
  contact VARCHAR (255) DEFAULT NULL ,
  telephone VARCHAR (11) DEFAULT NULL ,
  email VARCHAR (255) DEFAULT NULL ,
  remark text
)
INSERT into customer values(1,'customer1','jack','13585967192','jack@gmail.com',null);
INSERT into customer values(2,'customer2','rose','13994212156','rose@gmail.com',null);
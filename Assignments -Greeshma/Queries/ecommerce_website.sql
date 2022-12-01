CREATE TABLE Customer(
customerId int PRIMARY KEY AUTO_INCREMENT,
customerName varchar(30) NOT NULL,
phoneNumber int);

CREATE TABLE Address(
customerId int,
 FOREIGN KEY (customerId) REFERENCES Customer(customerId) ON DELETE CASCADE,
street varchar(45),
city varchar(30),
pincode int);

CREATE TABLE Product(
productId int PRIMARY KEY,
productName varchar(30) NOT NULL,
productPrice float NOT NULL,
productType varchar(40));

CREATE TABLE OrderList(
orderId int PRIMARY KEY,
customerId int,
foreign key (customerId) REFERENCES Customer(customerId) ON DELETE CASCADE, 
productId int,
foreign key (productId) references product(productId) ON DELETE cascade,
amount float NOT NULL,
orderDate date);

drop table orderlist;

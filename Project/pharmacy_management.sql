create database pharmacy_management;

use pharmacy_management;

DESC pharmacy_management.ROLE;

INSERT INTO `pharmacy_management`.`role`
(`ROLE_ID`,
`ROLE_NAME`)
VALUES
(1,'ADMIN');

INSERT INTO `pharmacy_management`.`role`
(`ROLE_ID`,
`ROLE_NAME`)
VALUES
(2,'PHARMACIST');

select * from ROLE;
--------------------------------------------------------
DESC pharmacy_management.medicine_category;

INSERT INTO `pharmacy_management`.`medicine_category`
(`CATEGORY_ID`,
`CATEGORY_NAME`)
VALUES
(100,'General Sales');

INSERT INTO `pharmacy_management`.`medicine_category`
(`CATEGORY_ID`,
`CATEGORY_NAME`)
VALUES
(101,'Pharmacy Medicines');

INSERT INTO `pharmacy_management`.`medicine_category`
(`CATEGORY_ID`,
`CATEGORY_NAME`)
VALUES
(102,'Prescription Only Medicine');

INSERT INTO `pharmacy_management`.`medicine_category`
(`CATEGORY_ID`,
`CATEGORY_NAME`)
VALUES
(103,'Controled Drugs');


select * from medicine_category;

--------------------------------------------------------

DESC pharmacy_management.customer;

select * from customer;

--------------------------------------------------------

DESC pharmacy_management.prescription;

select * from prescription;

--------------------------------------------------------

DESC pharmacy_management.medicine;

select * from medicine;

--------------------------------------------------------

DESC pharmacy_management.user;

select * from user;

delete user
where role_id is null;


--------------------------------------------------------

DESC pharmacy_management.inventory;

select * from inventory;

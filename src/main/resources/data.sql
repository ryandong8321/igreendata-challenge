Insert into Customer_INFO (name) values ('test1');
Insert into Customer_INFO (name) values ('test2');
Insert into Customer_INFO (name) values ('test3');

Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_1','001001001','111111',1);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_2','001001002','111111',1);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_3','001001003','111111',1);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_4','001001004','111111',1);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('nab_1','001001001','222222',1);

Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_1','001002001','111111',2);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_2','001002002','111111',2);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_3','001002003','111111',2);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('anz_4','001002004','111111',2);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('nab_1','001002001','222222',2);
Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('nab_2','001002002','222222',2);

Insert into ACCOUNT_INFO (account_name,account_number,bsb,customer_id) values ('nab_01','001003001','222222',3);

Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_2', '001001002',400.20,'111111', now(),'','Test1','ONLINE',1);
Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_3', '001001003',30.20,'111111', now(),'','Test1','ONLINE',1);
Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_4', '001001004',400.20,'111111', now(),'','Test1','OFFLINE',1);
Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_1', '001002001',50.20,'222222', now(),'','Test1','ONLINE',1);
Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_2', '001002002',400.20,'222222', now(),'','Test1','OFFLINE',1);
Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_3', '001002002',2.20,'222222', now(),'','Test1','ONLINE',1);
Insert into TRANSACTION_INFO (ACCOUNT_NAME ,ACCOUNT_NUMBER ,AMOUNT ,BSB ,DATE ,DESCRIPTION ,PAID_BY ,PAYMENT_TYPE ,ACCOUNT_ID ) values ('anz_4', '001002004',23.20,'222222', now(),'','Test1','PAYEE',1);
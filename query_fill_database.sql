/*
Query para popular banco de dados

As informações abaixo são ficcionais, criadas apenas para fins de 
testes de inserção e manipulação de dados no database.
Os números de CPNJ, CPF e telefones foram gerados aleatoriamente através
do serviço hospedado em www.4devs.com  
*/

use distribuidorabr;

# Table Company
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('045c3d24-8174-467e-b523-220331bb4a90', '-', '')),'Brazil', 'companysp@email.com', '(12) 2072-1216', 'SP', 'CUSTOMER', '32752152000137', 'SP Company Ltda.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('d407ec8d-2ad2-4be8-b6d7-dc5305df8ee5', '-', '')),'Brazil', 'spenterprise@email.com', '(12) 3431-2901', 'SP', 'SUPPLIER', '00925854000189', 'Enterprise SP S.A.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('f185348f-9b36-4441-bda5-d8924d2192be', '-', '')),'Brazil', 'baenterprise@email.com', '(74) 3227-2555', 'BA', 'CUSTOMER', '04017753000160', 'BA Enterprise S.A.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('52ea440f-12a6-4281-a5ea-939ae7e4cdf4', '-', '')),'Brazil', 'companyrj@email.com', '(22) 3739-4531', 'RJ', 'CUSTOMER', '60859477000159', 'RJ Company Ltda.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('52bd7a7e-44c2-4595-a533-5b7eb635f6bf', '-', '')),'Brazil', 'rjenterprise@email.com', '(21) 2170-1569', 'RJ', 'SUPPLIER', '20540593000196', 'RJ Enterprise S.A.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('52501905-58f5-43ca-9863-092a3a6c33cc', '-', '')),'Brazil', 'companyce@email.com', '(88) 2136-0179', 'CE', 'CUSTOMER', '85102784000111', 'CE Company Ltda.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('4c0afd6b-89a6-4c9c-8ba7-019b90491c32', '-', '')),'Brazil', 'companymg@email.com', '(37) 3596-8635', 'MG', 'CUSTOMER', '30178362000138', 'MG Company Ltda.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('d2a121be-ee04-41b4-854c-160f8016cb17', '-', '')),'Brazil', 'mgenterprise@email.com', '(37) 3384-4247', 'MG', 'SUPPLIER', '58930617000196', 'MG Enterprise S.A.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('4de09231-7508-442b-a086-7bd6894acaf4', '-', '')),'Brazil', 'companyms@email.com', '(67) 3406-8217', 'MS', 'CUSTOMER', '83184166000132', 'MS Company Ltda.');
insert into company (id, country, email, phone_number, state, business_relationship, cnpj, corporate_name) values (unhex(replace('b5db9ba7-cafa-4001-97a4-fb9a4419c03f', '-', '')),'Brazil', 'companydf@email.com', '(61) 2147-4626', 'DF', 'CUSTOMER', '41304759000145', 'DF Company Ltda.');



# Table Employee
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('4a75db7c-d294-4ae4-8362-1cfe23e6d42f', '-', '')), 'Brazil', 'maria@email.com', '(18) 99833-5828', 'SP','58383355050', 'Maria Silva', '$2a$12$w6HwgxLh5cEwllsrK.aYGObYmDFTnZo6Mq/9D3gduoankFK1NI0sS', 'Analista Adm', 1, 'USER'); 
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('5a838c00-1974-4356-ac40-074889de7a9d', '-', '')), 'Brazil', 'jose@email.com', '(13) 98141-3954', 'SP','13055891066', 'José Alves', '$2a$12$oJjbfY7FkMBYTAVllL2HJO1O.uMiQpI7RVYpmB.wp4yRKWT7TogJ6', 'Gerente', 1, 'ADMIN');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('5c02d57b-3c9c-459a-894e-922ccb6ae140', '-', '')), 'Brazil', 'carlos@email.com', '(22) 98619-5073', 'RJ','73735872085', 'Carlos Pereira', '$2a$12$O2BBMtetDI2ytAq.ODA7MuSsj4Zw/HSjsHryFW1dwmXZBfbzXjEki', 'Analista Adm', 1, 'USER');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('c7ed01ac-e18b-43f3-8037-80e51351fa1e', '-', '')), 'Brazil', 'cristina@email.com', '(24) 99287-6888', 'RJ','24657534017', 'Cristina Mendes', '$2a$12$WTiJgI.Lou5COhmyiYhY2eLQwr4Bq4ZjM0CN3RCgjN3ftpwjb.IaW', 'Analista Adm', 1, 'USER');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('997c46f6-83e3-4122-ad87-c513549f6a30', '-', '')), 'Brazil', 'ricardo@email.com', '(85) 98481-6311', 'CE','34698083095', 'Ricardo Dantas', '$2a$12$caFgGUBzh19J49nA7t7dX.xdMMvzdD7jCCdUzBLq2mbWO5MfLdlR2', 'Analista Adm', 1, 'USER');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('2e4b9359-8ef9-4952-a701-e9e23b09a1c3', '-', '')), 'Brazil', 'flavia@email.com', '(85) 98252-5818', 'CE','21602645043', 'Flavia Oliveira', '$2a$12$e4Aq/r7K./L4KTTMDMqG4ufoU1QKTuTJQEQBNcfxeqfwTdaturENm', 'Gerente', 1, 'ADMIN');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('c9f30f5a-6e44-4824-8bb8-3cf2b41d7a87', '-', '')), 'Brazil', 'mauricio@email.com', '(75) 98076-0824', 'BA', '10230069010', 'Mauricio Costa', '$2a$12$rR9fs545OuyURO0g67oR/.CTUyUjGze.uomhscCn/mWGCwBOr982K', 'Analista Adm', 1, 'USER');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('5b75adde-cde2-4f26-ae1c-8e92f7e5a1fc', '-', '')), 'Brazil', 'ana@email.com', '(61) 97116-4561', 'DF','12932880047', 'Ana Correia', '$2a$12$EiRneu4j9ZWAzyYOvgCcAuXnwnCTwO4aKIJV5hdCCdBoeAx5GtPcS', 'Analista Adm', 1, 'USER');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('b3f291b7-3524-44a5-ae3f-86619436b157', '-', '')), 'Brazil', 'felipe@email.com', '(37) 99453-6377', 'MG','24522720009', 'Felipe Santos', '$2a$12$CHmSD34h./oZrYg/ZgC67e4J9GGHiQwD3ceoKDY9bmWwLHBqVmfyG', 'Analista Adm', 1, 'USER');
insert into employee (id, country, email, phone_number, state, cpf, name, password, position, status, role) values (unhex(replace('3f36dabe-8a7a-43ca-be3b-8d2825adddf3', '-', '')), 'Brazil', 'antonio@email.com', '(67) 98264-1794', 'MS','29907799068', 'Antonio Ferreira', '$2a$12$g48AabKfq0IwdOTJ16gEu.Wd3CgZY2etl.h3tSW6ejJfUl7TaqGX.', 'Gerente', 1, 'ADMIN');

# Table Product
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('e899491a-037a-45e9-b4aa-e3f5609d0304', '-', '')), 'REGULAR_GASOLINE', 'Gasolina Comum', 5.50, 500000.0, 500000.0);
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('4436bfb2-36b3-4a6b-96ef-8c8d7a45338a', '-', '')),  'ADD_GASOLINE', 'Gasolina Aditivada', 6.50, 500000.0, 500000.0);
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('28ac318f-3e43-4c0b-94ad-cb8cf586f600', '-', '')), 'PREMIUM_GASOLINE', 'Gasolina Premium', 7.50, 500000.0, 500000.0);
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('9fd2728c-f790-4977-b9a2-f8f7122f2754', '-', '')), 'REFORMULATED_GASOLINE', 'Gasolina Formulada', 6.50, 500000.0, 500000.0);
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('58505232-7402-40ee-95f2-a010a8994299', '-', '')), 'ETHANOL', 'Etanol', 4.20, 500000.0, 500000.0);
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('f797f7c4-59e3-45d3-8f03-d5855c76cdb7', '-', '')), 'CNG', 'GNV - Gás Natural Veicular', 3.80, 500000.0, 500000.0);
insert into product (id, category, name, price, stock, storage_capacity) values (unhex(replace('c7ac9524-15d1-4452-b040-47cf2c0f59af', '-', '')), 'DIESEL', 'Diesel', 6.70, 500000.0, 500000.0);

# Table Orders
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('c7ac9524-15d1-4452-b040-47cf2c0f59af', '-', '')), '2023-01-01', 38500.0, 'SALE', unhex(replace('045c3d24-8174-467e-b523-220331bb4a90', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('1397b436-cbb8-4cad-b12b-e2d850910a91', '-', '')), '2023-02-02', 325000.0, 'PURCHASE', unhex(replace('d407ec8d-2ad2-4be8-b6d7-dc5305df8ee5', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('c4f90eea-f73b-4d2d-a54a-3bf85a5a8eae', '-', '')), '2023-03-03', 375000.0, 'PURCHASE', unhex(replace('f185348f-9b36-4441-bda5-d8924d2192be', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('5f90c830-2792-4351-a3b9-170ea068e2dc', '-', '')), '2023-04-04', 46900.0, 'SALE', unhex(replace('52ea440f-12a6-4281-a5ea-939ae7e4cdf4', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('96aa0ec0-dcc2-4a00-81e5-3e6e2e953ea9', '-', '')), '2023-05-05', 210000.0, 'PURCHASE', unhex(replace('52bd7a7e-44c2-4595-a533-5b7eb635f6bf', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('8a2a4d0a-0cc9-42e8-87d1-3e64fea93b73', '-', '')), '2023-05-06', 26600.0, 'SALE', unhex(replace('52501905-58f5-43ca-9863-092a3a6c33cc', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('35bc200c-e46a-4577-9d3b-94d62c4503e2', '-', '')), '2023-05-07', 46900.0, 'SALE', unhex(replace('4c0afd6b-89a6-4c9c-8ba7-019b90491c32', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('316af45d-a70c-4257-96eb-8eb41c9d9126', '-', '')), '2023-05-08', 275000.0, 'PURCHASE', unhex(replace('d2a121be-ee04-41b4-854c-160f8016cb17', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('4cd0b2a9-ea23-4faf-9968-935d22a3a24a', '-', '')), '2023-05-09', 45500.0, 'SALE', unhex(replace('4de09231-7508-442b-a086-7bd6894acaf4', '-', '')));
insert into orders (id, order_date, total_value, type, company_id) values (unhex(replace('28bd4854-2f90-4a4b-9a1b-72be4dfdaac8', '-', '')), '2023-05-10', 393750.0, 'SALE', unhex(replace('b5db9ba7-cafa-4001-97a4-fb9a4419c03f', '-', '')));

# Table Item
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('eb5d244a-bf81-4da3-861d-f7f1341559fe', '-', '')), 7000, 38500.0, unhex(replace('e899491a-037a-45e9-b4aa-e3f5609d0304', '-', '')), unhex(replace('c7ac9524-15d1-4452-b040-47cf2c0f59af', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('75008fda-803b-4720-810d-9de1e83d92cd', '-', '')), 50000, 325000.0, unhex(replace('4436bfb2-36b3-4a6b-96ef-8c8d7a45338a', '-', '')), unhex(replace('1397b436-cbb8-4cad-b12b-e2d850910a91', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('6651b92c-09cf-40f5-8871-b915d61872d3', '-', '')), 50000, 375000.0, unhex(replace('28ac318f-3e43-4c0b-94ad-cb8cf586f600', '-', '')), unhex(replace('c4f90eea-f73b-4d2d-a54a-3bf85a5a8eae', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('60872199-d2d8-4dfa-b2fc-a8a4877c6ccf', '-', '')), 7000, 46900.0, unhex(replace('9fd2728c-f790-4977-b9a2-f8f7122f2754', '-', '')), unhex(replace('5f90c830-2792-4351-a3b9-170ea068e2dc', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('1439e184-822a-487d-8c52-46d448fa8ad0', '-', '')), 50000, 210000.0, unhex(replace('58505232-7402-40ee-95f2-a010a8994299', '-', '')), unhex(replace('96aa0ec0-dcc2-4a00-81e5-3e6e2e953ea9', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('52d431f2-18a0-485d-8022-098ee730f05a', '-', '')), 7000, 26600.0, unhex(replace('f797f7c4-59e3-45d3-8f03-d5855c76cdb7', '-', '')), unhex(replace('8a2a4d0a-0cc9-42e8-87d1-3e64fea93b73', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('a60d7c8d-3a2f-4195-835b-e3cce2369065', '-', '')), 7000, 46900.0, unhex(replace('c7ac9524-15d1-4452-b040-47cf2c0f59af', '-', '')), unhex(replace('35bc200c-e46a-4577-9d3b-94d62c4503e2', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('e716e131-9bae-4f1b-beaa-d8e23837768a', '-', '')), 50000, 275000.0, unhex(replace('e899491a-037a-45e9-b4aa-e3f5609d0304', '-', '')), unhex(replace('316af45d-a70c-4257-96eb-8eb41c9d9126', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('f0ca848b-f74a-4062-8abb-81e2c63c725e', '-', '')), 7000, 45500.0, unhex(replace('4436bfb2-36b3-4a6b-96ef-8c8d7a45338a', '-', '')), unhex(replace('4cd0b2a9-ea23-4faf-9968-935d22a3a24a', '-', ''))); 
insert into item (id, quantity, unit_value, product_id, order_id) values (unhex(replace('efa1ac65-09e9-4d41-9bf2-04dcab6e503c', '-', '')), 7000, 393750.0, unhex(replace('28ac318f-3e43-4c0b-94ad-cb8cf586f600', '-', '')), unhex(replace('28bd4854-2f90-4a4b-9a1b-72be4dfdaac8', '-', ''))); 

#Table Role
# insert into role (id, role_name) value (unhex(replace('03011b27-ad3c-49bf-8a0c-9777a637b6aa', '-', '')), 'ROLE_ADMIN');
# insert into role (id, role_name) value (unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')), 'ROLE_USER');

#Table Employee_Role
# insert into employee_role (employee_id, role_id) value (unhex(replace('4a75db7c-d294-4ae4-8362-1cfe23e6d42f', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('5a838c00-1974-4356-ac40-074889de7a9d', '-', '')), unhex(replace('03011b27-ad3c-49bf-8a0c-9777a637b6aa', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('5c02d57b-3c9c-459a-894e-922ccb6ae140', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('c7ed01ac-e18b-43f3-8037-80e51351fa1e', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('997c46f6-83e3-4122-ad87-c513549f6a30', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('2e4b9359-8ef9-4952-a701-e9e23b09a1c3', '-', '')), unhex(replace('03011b27-ad3c-49bf-8a0c-9777a637b6aa', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('c9f30f5a-6e44-4824-8bb8-3cf2b41d7a87', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('5b75adde-cde2-4f26-ae1c-8e92f7e5a1fc', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('b3f291b7-3524-44a5-ae3f-86619436b157', '-', '')), unhex(replace('56a6c844-f3d1-4af7-b257-ebc9a5472773', '-', '')));
# insert into employee_role (employee_id, role_id) value (unhex(replace('3f36dabe-8a7a-43ca-be3b-8d2825adddf3', '-', '')), unhex(replace('03011b27-ad3c-49bf-8a0c-9777a637b6aa', '-', '')));


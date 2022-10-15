DROP TABLE IF EXISTS products CASCADE;
CREATE TABLE products(id bigserial PRIMARY KEY (id), title VARCHAR(255), price INTEGER);
INSERT INTO products(title, price) VALUES
('Milk', 80),
('Bread', 50),
('Apple', 100);

DROP TABLE IF EXISTS buyers CASCADE;
CREATE TABLE buyers(id bigserial PRIMARY KEY(id), name VARCHAR(255));
INSERT INTO buyers(name) VALUES
('Irina'),
('Olga'),
('Ivan');
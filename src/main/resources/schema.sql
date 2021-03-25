DROP TABLE web_orders IF EXISTS;

CREATE TABLE web_orders (
	order_id BIGINT GENERATED BY DEFAULT AS IDENTITY(START WITH 1) PRIMARY KEY,
	account_id VARCHAR(30) NOT NULL,
	country VARCHAR(50),
	store_alias VARCHAR(30),
	web_order_number VARCHAR(30),
	created TIMESTAMP,
	parts VARCHAR(30),
	carrier VARCHAR(30),
	induction_status VARCHAR(30),
	order_status VARCHAR(12),
	order_type VARCHAR(12),
	payment_type VARCHAR(12),
	keywords VARCHAR(50)
);
drop table orders;
drop table products;
drop table users;

use shoppingcart;

create table users(
 id int primary key identity(1,1),
 email varchar(100) not null unique,
 username varchar(50) not null,
 pwd varchar(50) not null
);

create table products_type(
 id int primary key identity(1,1) not null,
 typeName nvarchar(50) not null unique,
 isOpen bit not null default 0
);

create table products(
  id int primary key identity(1,1) not null,
  product_name nvarchar(100) not null unique,
  price int,
  quantity int,
  product_type int,
  storage_time datetime not null default getDate(),
  foreign key (product_type) references products_type(id)
);

create table shoppingCart(
  users_id int not null,
  products_id int not null,
  quantity tinyint not null,
  foreign key (users_id) references users(id),
  foreign key (products_id) references products(id),
  primary key (users_id,products_id)
);


create table user_orders(
 id int primary key identity(1,1) not null,
 users_id int not null,
 created_date datetime not null default getDate(),
 total_price int not null,
 payment tinyint not null, -- 1:刷卡付款 , 2:LinePay 付款 , 3:貨到付款, 
 payment_status bit not null default 0, -- 0:未付款, 1:已付款
 ship_status bit not null default 0, -- 1:已到貨, 0:未到貨
 foreign key (users_id) references users(id),
)

create table user_orders_detail(
  id int primary key identity(1,1) not null,
  order_id int not null,
  users_id int not null,
  product_id int not null,
  onePrice int,
  quantity int,
  foreign key (users_id) references users(id),
  foreign key (product_id) references products(id),
  foreign key (order_id) references user_orders(id),
);

create table coupon(
 id int primary key identity(1,1) not null,
 coupon_name nvarchar(50) not null unique,
 discount_price int,
 discount_percent tinyint,
 started_date datetime,
 ended_date datetime
);

create table coupon_owner(
  users_id int,
  coupon_id int,
  quantity tinyint,
  foreign key (users_id) references users(id),
  foreign key (coupon_id) references coupon(id),
  primary key (users_id,coupon_id)
);
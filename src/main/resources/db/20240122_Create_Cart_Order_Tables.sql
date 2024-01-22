create table if not exists cart(
    id int not null auto_increment,
    user_id int not null,
    status boolean,
    constraint cart_pk primary key (id),
    constraint users_fk foreign key (user_id) references `user` (id)
);

create table if not exists cart_item(
    id int not null auto_increment,
    cart_id int not null,
    product_id int not null,
    quantity int not null,
    image_url varchar(255),
    constraint cart_item_pk primary key (id),
    constraint cart_fk foreign key (cart_id) references cart(id),
    constraint product_fk foreign key (product_id) references product(id)
);

create table if not exists `order`(
    id int not null auto_increment,
    user_id int not null,
    total_amount int not null,
    constraint order_pk primary key(id),
    constraint user_fk foreign key (user_id) references `user` (id)
);

create table if not exists order_item(
    id int not null auto_increment,
    order_id int not null,
    product_id int not null,
    quantity int not null,
    unit_price float,
    constraint order_item_pk primary key(id),
    constraint order_fk foreign key(order_id) references `order` (id),
    constraint products_fk foreign key(product_id) references product(id)
);
create table if not exists category (
    id   int         not null auto_increment,
    name varchar(50) not null,
    constraint category_pk primary key (id)
);

create table if not exists size (
    id         int not null auto_increment,
    name       varchar(100),
    product_id int,
    constraint size_pk primary key (id),
    constraint size_product_fk foreign key (product_id) references product (id)
);

create table if not exists color (
    id         int not null auto_increment,
    name       varchar(100),
    product_id int,
    constraint color_pk primary key (id),
    constraint color_product_fk foreign key (product_id) references product (id)
);

create table if not exists product (
    id          int not null auto_increment,
    category_id int,
    name        varchar(100),
    price       double,
    image       varchar(200),
    description varchar(100),
    quantity    int,
    constraint product_pk primary key (id),
    constraint product_category_fk foreign key (category_id) references category (id)
);
insert into cart (id,user_id, status) values
    (1,1, true),
    (2,2, true),
    (3,3, false);

insert into cart_item (cart_id, product_id, quantity, image_url, unit_price) values
    (1, 1, 1, 'product1.jpg',200),
    (2, 1, 2, 'product2.jpg',300),
    (3, 2, 3, 'product3.jpg',400),
    (1, 1, 4, 'product4.jpg',350);

insert into `order` (id, user_id, total_amount) values
    (1, 1, 500),
    (2, 2, 700),
    (3, 1, 600);

insert into order_item (order_id, product_id, quantity, unit_price) values
    (1, 1, 3, 600),
    (2, 2, 2, 650),
    (3, 1, 2, 700);
insert into category (id, name)
values (1, 'Woman clothings');
insert into category (id, name)
values (2, 'Man clothings');
insert into category (id, name)
values (3, 'Bags');
insert into category (id, name)
values (4, 'Shoes');

INSERT INTO product (name, price, category_id, description)
VALUES ('Floral Print Dress', 39.99, 1, 'A beautiful dress with a vibrant floral print, perfect for summer days.'),
       ('Classic White Shirt', 24.99, 1,
        'A versatile white shirt that can be dressed up or down, a wardrobe essential.'),
       ('Distressed Denim Jeans', 49.99, 2,
        'A pair of stylish jeans with a distressed look, perfect for a casual outfit.'),
       ('Tailored Suit Jacket', 99.99, 2, 'A sharp and sophisticated suit jacket, perfect for special occasions.'),
       ('Leather Tote Bag', 69.99, 3, 'A spacious and stylish tote bag, perfect for everyday use.'),
       ('Crossbody Bag', 39.99, 3, 'A convenient and compact crossbody bag, perfect for days on the go.'),
       ('Leather Sneakers', 59.99, 4, 'A pair of comfortable and stylish sneakers, perfect for everyday wear.'),
       ('High Heel Sandals', 49.99, 4, 'A pair of elegant high heel sandals, perfect for a night out.'),
       ('Cashmere Sweater', 79.99, 1, 'A luxuriously soft cashmere sweater, perfect for cozy winter days.'),
       ('Slim Fit Chinos', 39.99, 2, 'A pair of versatile chinos that can be dressed up or down.'),
       ('Weekender Bag', 89.99, 3, 'A spacious weekender bag, perfect for short trips.'),
       ('Ankle Boots', 69.99, 4, 'A pair of stylish and comfortable ankle boots, perfect for fall weather.');

insert into size (id, name, product_id)
values (1, 'XL', 8);
insert into size (id, name, product_id)
values (2, 'L', 6);
insert into size (id, name, product_id)
values (3, 'L', 9);
insert into size (id, name, product_id)
values (4, 'L', 11);
insert into size (id, name, product_id)
values (5, 'L', 4);
insert into size (id, name, product_id)
values (6, 'XL', 8);
insert into size (id, name, product_id)
values (7, 'XL', 6);
insert into size (id, name, product_id)
values (8, 'S', 3);
insert into size (id, name, product_id)
values (9, 'L', 4);
insert into size (id, name, product_id)
values (10, 'L', 8);
insert into size (id, name, product_id)
values (11, 'S', 5);
insert into size (id, name, product_id)
values (12, 'S', 1);
insert into size (id, name, product_id)
values (13, 'XL', 3);
insert into size (id, name, product_id)
values (14, 'S', 11);
insert into size (id, name, product_id)
values (15, 'L', 6);
insert into size (id, name, product_id)
values (16, 'XL', 1);
insert into size (id, name, product_id)
values (17, 'S', 7);
insert into size (id, name, product_id)
values (18, 'XL’', 9);
insert into size (id, name, product_id)
values (19, 'XL', 3);
insert into size (id, name, product_id)
values (20, 'L', 10);
insert into size (id, name, product_id)
values (21, 'L', 2);
insert into size (id, name, product_id)
values (22, 'S', 4);
insert into size (id, name, product_id)
values (23, 'S', 1);
insert into size (id, name, product_id)
values (24, 'S', 5);
insert into size (id, name, product_id)
values (25, 'S', 10);
insert into size (id, name, product_id)
values (26, 'XL', 4);
insert into size (id, name, product_id)
values (27, 'S', 12);
insert into size (id, name, product_id)
values (28, 'L', 6);
insert into size (id, name, product_id)
values (29, 'S', 3);
insert into size (id, name, product_id)
values (30, 'L', 3);
insert into size (id, name, product_id)
values (31, 'L', 2);
insert into size (id, name, product_id)
values (32, 'S', 5);
insert into size (id, name, product_id)
values (33, 'S', 6);
insert into size (id, name, product_id)
values (34, 'L', 11);
insert into size (id, name, product_id)
values (35, 'XL', 8);
insert into size (id, name, product_id)
values (36, 'XL', 4);

insert into color (id, name, product_id)
values (1, 'vàng', 6);
insert into color (id, name, product_id)
values (2, 'tím', 5);
insert into color (id, name, product_id)
values (3, 'xanh', 4);
insert into color (id, name, product_id)
values (4, 'tím', 9);
insert into color (id, name, product_id)
values (5, 'tím', 6);
insert into color (id, name, product_id)
values (6, 'tím', 2);
insert into color (id, name, product_id)
values (7, 'đỏ', 12);
insert into color (id, name, product_id)
values (8, 'vàng', 3);
insert into color (id, name, product_id)
values (9, 'xanh', 3);
insert into color (id, name, product_id)
values (10, 'đỏ', 6);
insert into color (id, name, product_id)
values (11, 'xanh', 5);
insert into color (id, name, product_id)
values (12, 'xanh', 10);
insert into color (id, name, product_id)
values (13, 'xanh', 2);
insert into color (id, name, product_id)
values (14, 'đỏ', 11);
insert into color (id, name, product_id)
values (15, 'đỏ', 1);
insert into color (id, name, product_id)
values (16, 'xanh', 4);
insert into color (id, name, product_id)
values (17, 'xanh', 3);
insert into color (id, name, product_id)
values (18, 'vàng', 4);
insert into color (id, name, product_id)
values (19, 'tím', 10);
insert into color (id, name, product_id)
values (20, 'đỏ', 5);
insert into color (id, name, product_id)
values (21, 'vàng', 8);
insert into color (id, name, product_id)
values (22, 'vàng', 4);
insert into color (id, name, product_id)
values (23, 'tím', 3);
insert into color (id, name, product_id)
values (24, 'vàng', 3);
insert into color (id, name, product_id)
values (25, 'đỏ', 6);
insert into color (id, name, product_id)
values (26, 'tím', 10);
insert into color (id, name, product_id)
values (27, 'tím', 11);
insert into color (id, name, product_id)
values (28, 'đỏ', 7);
insert into color (id, name, product_id)
values (29, 'vàng', 9);
insert into color (id, name, product_id)
values (30, 'vàng', 2);
insert into color (id, name, product_id)
values (31, 'xanh', 3);
insert into color (id, name, product_id)
values (32, 'tím', 8);
insert into color (id, name, product_id)
values (33, 'tím', 2);
insert into color (id, name, product_id)
values (34, 'đỏ', 8);
insert into color (id, name, product_id)
values (35, 'xanh', 12);
insert into color (id, name, product_id)
values (36, 'tím', 6);
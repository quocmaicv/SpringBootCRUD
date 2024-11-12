CRUD-Spring boot

==Đề bài==
- Tạo CRUD product đơn giản
- mysql
- hybernateJPA
- Sử dụng post man để test

==SQL==

create table product (
 id int primary key AUTO_INCREMENT,
 name varchar(120) NOT NULL,
 price float NOT NULL
);

==PostMan test==

1. Tạo mới (C)
   - Chọn POST
   - URL: http://localhost:8080/api/products
   - Body: Chọn raw va JSON, sau đó nhập dữ liệu sau:
   - {"name": "Product A",  "price":100.0}
   - Nhấn send
2. Đọc (R)
   - Chọn GET
   - URL: http://localhost:8080/api/products
   - Nhấn send
3. Update (U)
   - Chọn PUT
   - URL: http://localhost:8080/api/products/1 (1 là id product kiểu số)
   - Body: Chọn raw va JSON, sau đó nhập dữ liệu sau:
   - {"name": "aHIHI",  "price":123.0}
   - Nhấn send
4. Xoá (D)
   - Chọn DELETE
   - URL: http://localhost:8080/api/products/2
   - Nhấn send

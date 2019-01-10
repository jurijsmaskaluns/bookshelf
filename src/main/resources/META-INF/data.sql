insert into users (id, login_name, password_hash, role_name) values (-1, 'user', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'USER')
insert into users (id, login_name, password_hash, role_name) values (-2, 'manager', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'MANAGER')
insert into users (id, login_name, password_hash, role_name) values (-3, 'admin', 'PBKDF2WithHmacSHA256:2048:e9vXAAs/amAf2/PT/eVw2UbG6DcdtIZArf0FqMG8ClI=:UTOAQ8LsucZL3nua/RQj3VyDid3KhaSUFc5AaVI8T4A=', 'ADMIN')

insert into books(id, title, isbn, author, year, description ) values (1, 'Algebra', '111222333', 'Ivan Ivanic', 1901,'aaa')
insert into books(id, title, isbn, author, year, description ) values (2, 'Fizika', '222222333', 'Ivan Petrovic', 1954,'bbb')
insert into books(id, title, isbn, author, year, description ) values (3, 'Geometrija', '333222333', 'Ivan Ivanic', 1978,'ccc')
insert into books(id, title, isbn, author, year, description ) values (4, 'Geometrija 2', '3444443', 'Ivan Ivanic', 1978,'bla bla bla')
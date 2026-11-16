-- V2: Migrations to add rank column to the register table

ALTER TABLE tb_register
ADD COLUMN rank VARCHAR(255);
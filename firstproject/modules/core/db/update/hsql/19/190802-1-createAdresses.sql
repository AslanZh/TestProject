create table FIRSTPROJECT_ADRESSES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    Country varchar(255) not null,
    Region varchar(255),
    Area varchar(255),
    City varchar(255) not null,
    Street varchar(255) not null,
    House varchar(255) not null,
    Building varchar(255),
    Flat varchar(255),
    --
    primary key (ID)
);
create table FIRSTPROJECT_CONTACT_INFO (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE varchar(255) not null,
    NUMBER integer not null,
    --
    primary key (ID)
);
create table FIRSTPROJECT_MAIN_INFORMATION (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    BIN varchar(255) not null,
    RESIDENT boolean not null,
    --
    primary key (ID)
);
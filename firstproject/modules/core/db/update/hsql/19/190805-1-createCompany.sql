create table FIRSTPROJECT_COMPANY (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    INDUSTRY varchar(255) not null,
    INCOME decimal(19, 2) not null,
    COMPANY_DATE date,
    WEB varchar(255),
    PARTICIPANTS varchar(255),
    --
    primary key (ID)
);
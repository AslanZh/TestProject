-- begin FIRSTPROJECT_CONTRAGENTS
create table FIRSTPROJECT_CONTRAGENTS (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    Наименование varchar(255) not null,
    ACTIVE boolean not null,
    IMAGE_ID varchar(36) not null,
    Роли varchar(255),
    Тип varchar(255) not null,
    CONTACT_INFO_ID varchar(36),
    --
    primary key (ID)
)^
-- end FIRSTPROJECT_CONTRAGENTS
-- begin FIRSTPROJECT_ADRESSES
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
    CONTRAGENT_ID varchar(36),
    --
    primary key (ID)
)^
-- end FIRSTPROJECT_ADRESSES
-- begin FIRSTPROJECT_CONTACT_INFO
create table FIRSTPROJECT_CONTACT_INFO (
    ID varchar(36) not null,
    UUID varchar(36),
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    TYPE varchar(255) not null,
    NUMBER varchar(255) not null,
    donnotbother boolean not null,
    --
    primary key (ID)
)^
-- end FIRSTPROJECT_CONTACT_INFO
-- begin FIRSTPROJECT_ROLES
create table FIRSTPROJECT_ROLES (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    NAME varchar(255),
    CONTRAGENTS_ID varchar(36),
    MAIN boolean not null,
     Validity date,
    Validuntil date,
    --
    primary key (ID)
)^
-- end FIRSTPROJECT_ROLES
-- begin FIRSTPROJECT_TEAM
create table FIRSTPROJECT_TEAM (
    ID varchar(36) not null,
    VERSION integer not null,
    CREATE_TS timestamp,
    CREATED_BY varchar(50),
    UPDATE_TS timestamp,
    UPDATED_BY varchar(50),
    DELETE_TS timestamp,
    DELETED_BY varchar(50),
    --
    FULLNAME varchar(255) not null,
    CONTAGENTS_ID varchar(36),
    ROLE varchar(255),
    --
    primary key (ID)
)^
-- end FIRSTPROJECT_TEAM
-- begin FIRSTPROJECT_COMPANY
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
)^
-- end FIRSTPROJECT_COMPANY
-- begin FIRSTPROJECT_MAIN_INFORMATION
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
)^
-- end FIRSTPROJECT_MAIN_INFORMATION

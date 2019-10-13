alter table FIRSTPROJECT_TEAM alter column ФИО rename to ФИО__U15455 ^
alter table FIRSTPROJECT_TEAM alter column ФИО__U15455 set null ;
alter table FIRSTPROJECT_TEAM add column FULLNAME varchar(255) ^
update FIRSTPROJECT_TEAM set FULLNAME = '' where FULLNAME is null ;
alter table FIRSTPROJECT_TEAM alter column FULLNAME set not null ;

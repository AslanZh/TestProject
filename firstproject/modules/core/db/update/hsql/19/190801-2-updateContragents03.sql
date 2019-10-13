alter table FIRSTPROJECT_CONTRAGENTS alter column ACTIVE set data type varchar(255) ;
update FIRSTPROJECT_CONTRAGENTS set ACTIVE = '' where ACTIVE is null ;
alter table FIRSTPROJECT_CONTRAGENTS alter column ACTIVE set not null ;

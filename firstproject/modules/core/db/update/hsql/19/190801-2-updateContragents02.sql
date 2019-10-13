alter table FIRSTPROJECT_CONTRAGENTS alter column ACTIVE rename to ACTIVE__U04780 ^
alter table FIRSTPROJECT_CONTRAGENTS alter column ACTIVE__U04780 set null ;
alter table FIRSTPROJECT_CONTRAGENTS add column ACTIVE boolean ^
update FIRSTPROJECT_CONTRAGENTS set ACTIVE = false where ACTIVE is null ;
alter table FIRSTPROJECT_CONTRAGENTS alter column ACTIVE set not null ;

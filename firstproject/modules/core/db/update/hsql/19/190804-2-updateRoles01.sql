alter table FIRSTPROJECT_ROLES add constraint FK_FIRSTPROJECT_ROLES_ON_CONTRAGENTS foreign key (CONTRAGENTS_ID) references FIRSTPROJECT_CONTRAGENTS(ID);
create index IDX_FIRSTPROJECT_ROLES_ON_CONTRAGENTS on FIRSTPROJECT_ROLES (CONTRAGENTS_ID);

alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER rename to NUMBER__U07085 ^
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER__U07085 set null ;
alter table FIRSTPROJECT_CONTACT_INFO add column NUMBER_ varchar(36) ^
update FIRSTPROJECT_CONTACT_INFO set NUMBER_ = '00000000-0000-0000-0000-000000000000' where NUMBER_ is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER_ set not null ;

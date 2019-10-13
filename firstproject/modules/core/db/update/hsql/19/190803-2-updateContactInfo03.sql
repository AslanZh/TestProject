alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER rename to NUMBER__U05419 ^
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER__U05419 set null ;
alter table FIRSTPROJECT_CONTACT_INFO add column NUMBER varchar(255) ^
update FIRSTPROJECT_CONTACT_INFO set NUMBER = '' where NUMBER is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER set not null ;

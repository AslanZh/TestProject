alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER rename to NUMBER__U12909 ^
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER__U12909 set null ;
alter table FIRSTPROJECT_CONTACT_INFO add column NUMBER bigint ^
update FIRSTPROJECT_CONTACT_INFO set NUMBER = 0 where NUMBER is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER set not null ;

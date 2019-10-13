alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER rename to NUMBER__U45406 ^
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER__U45406 set null ;
alter table FIRSTPROJECT_CONTACT_INFO add column NUMBER decimal(19, 2) ^
update FIRSTPROJECT_CONTACT_INFO set NUMBER = 0 where NUMBER is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER set not null ;

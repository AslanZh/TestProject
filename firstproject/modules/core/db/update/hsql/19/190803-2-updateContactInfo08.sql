alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER_ rename to NUMBER___U38918 ^
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER___U38918 set null ;
alter table FIRSTPROJECT_CONTACT_INFO add column NUMBER varchar(255) ^
update FIRSTPROJECT_CONTACT_INFO set NUMBER = '' where NUMBER is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER set not null ;

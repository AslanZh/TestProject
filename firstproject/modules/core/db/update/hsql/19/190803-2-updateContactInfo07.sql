alter table FIRSTPROJECT_CONTACT_INFO add column NUMBER_ varchar(255) ^
update FIRSTPROJECT_CONTACT_INFO set NUMBER_ = '' where NUMBER_ is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column NUMBER_ set not null ;

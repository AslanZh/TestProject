alter table FIRSTPROJECT_CONTACT_INFO add column DONNOTBOTHER boolean ^
update FIRSTPROJECT_CONTACT_INFO set DONNOTBOTHER = false where DONNOTBOTHER is null ;
alter table FIRSTPROJECT_CONTACT_INFO alter column DONNOTBOTHER set not null ;

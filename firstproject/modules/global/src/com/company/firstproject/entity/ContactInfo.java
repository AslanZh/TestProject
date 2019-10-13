package com.company.firstproject.entity;

import com.haulmont.cuba.core.entity.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import java.util.Date;
import java.util.UUID;

@Table(name = "FIRSTPROJECT_CONTACT_INFO")
@Entity(name = "firstproject_ContactInfo")
public class ContactInfo extends StandardEntity implements Versioned, SoftDelete, Updatable, Creatable, HasUuid {
    private static final long serialVersionUID = -7728333528010323611L;

    @NotNull
    @Column(name = "TYPE", nullable = false)
    protected String тип;

    @NotNull
    @Column(name = "NUMBER", nullable = false)
    protected String значение;

    @NotNull
    @Column(name = "donnotbother", nullable = false)
    protected Boolean небеспокоить = false;

    @Column(name = "UUID")
    private UUID uuid;

    @Override
    public void setUuid(UUID uuid) {
        this.uuid = uuid;
    }

    @Override
    public UUID getUuid() {
        return uuid;
    }

    @Override
    public void setCreatedBy(String createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String getCreatedBy() {
        return createdBy;
    }

    @Override
    public void setCreateTs(Date createTs) {
        this.createTs = createTs;
    }

    @Override
    public Date getCreateTs() {
        return createTs;
    }

    @Override
    public void setUpdatedBy(String updatedBy) {
        this.updatedBy = updatedBy;
    }

    @Override
    public String getUpdatedBy() {
        return updatedBy;
    }

    @Override
    public void setUpdateTs(Date updateTs) {
        this.updateTs = updateTs;
    }

    @Override
    public Date getUpdateTs() {
        return updateTs;
    }

    @Override
    public Boolean isDeleted() {
        return deleteTs != null;
    }

    @Override
    public void setDeletedBy(String deletedBy) {
        this.deletedBy = deletedBy;
    }

    @Override
    public String getDeletedBy() {
        return deletedBy;
    }

    @Override
    public void setDeleteTs(Date deleteTs) {
        this.deleteTs = deleteTs;
    }

    @Override
    public Date getDeleteTs() {
        return deleteTs;
    }

    @Override
    public void setVersion(Integer version) {
        this.version = version;
    }

    @Override
    public Integer getVersion() {
        return version;
    }

    public void setЗначение(String значение) {
        this.значение = значение;
    }

    public String getЗначение() {
        return значение;
    }

    public void setНебеспокоить(Boolean небеспокоить) {
        this.небеспокоить = небеспокоить;
    }

    public Boolean getНебеспокоить() {
        return небеспокоить;
    }

    public String getТип() {
        return тип;
    }

    public void setТип(String тип) {
        this.тип = тип;
    }
}
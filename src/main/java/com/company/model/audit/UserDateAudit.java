package com.company.model.audit;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * Created by Shoh Jahon on 10.09.2018.
 */
@MappedSuperclass
@JsonIgnoreProperties(
        value = {"createdBy","updatedBy"},
        allowGetters = true
)
public abstract class UserDateAudit extends DateAudit{
    @CreatedBy
    @Column(updatable = true)
    private Long createdBy;

    @LastModifiedBy
    private Long updatedBy;

    public Long getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Long createdBy) {
        this.createdBy = createdBy;
    }

    public Long getUpdatedBy() {
        return updatedBy;
    }

    public void setUpdatedBy(Long updatedBy) {
        this.updatedBy = updatedBy;
    }
}

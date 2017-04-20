package com.ryan.commons.config.audit;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@EntityListeners(AuditingEntityListener.class)
public class AuditableUserEx {

	private @Id @GeneratedValue Long id;
	
	private String username;

	private @CreatedDate LocalDateTime createdDate;
	private @LastModifiedDate LocalDateTime lastModifiedDate;

	private @ManyToOne @CreatedBy AuditableUserEx createdBy;
	private @ManyToOne @LastModifiedBy AuditableUserEx lastModifiedBy;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public LocalDateTime getLastModifiedDate() {
		return lastModifiedDate;
	}
	public void setLastModifiedDate(LocalDateTime lastModifiedDate) {
		this.lastModifiedDate = lastModifiedDate;
	}
	public AuditableUserEx getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(AuditableUserEx createdBy) {
		this.createdBy = createdBy;
	}
	public AuditableUserEx getLastModifiedBy() {
		return lastModifiedBy;
	}
	public void setLastModifiedBy(AuditableUserEx lastModifiedBy) {
		this.lastModifiedBy = lastModifiedBy;
	}
	
	
}

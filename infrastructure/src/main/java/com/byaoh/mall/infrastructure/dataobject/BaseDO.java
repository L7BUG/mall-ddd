package com.byaoh.mall.infrastructure.dataobject;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.CreatedBy;
import org.springframework.data.annotation.LastModifiedBy;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * BaseEntity
 *
 * @author luliangyu
 * @date 2021-07-16 11:49
 */
@MappedSuperclass
@EntityListeners(AuditingEntityListener.class)
@Data
public abstract class BaseDO implements Serializable {
	/**
	 * id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@CreatedBy
	@Column(name = "create_by")
	private Long createBy;

	@LastModifiedBy
	@Column(name = "update_by")
	private Long updateBy;

	@CreationTimestamp
	@Column(name = "create_time")
	private Date createTime;

	@UpdateTimestamp
	@Column(name = "update_time")
	private Date updateTime;
}

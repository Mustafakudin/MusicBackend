package com.mustafakudin.Musicapp.entities.concretes;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name ="base_users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseUser { // entity
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="update_date")
	private Date updateDate;
	@Column(name="creadet_date")
	private String creadetDate;

}

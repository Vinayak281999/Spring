package com.xworkz.springValidation.dto;

import java.io.Serializable;
import java.time.LocalDate;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public abstract class AbstractAuditDTO implements Serializable {
	
	private String createdBy;
	private LocalDate createdDate;
	
	private String updatedBy;
	private LocalDate updatedDate;
}

package com.xworkz.soldier.dto;

import java.time.LocalDateTime;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import io.smallrye.common.constraint.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class SoldierDTO extends AbstractAuditDTO {

	@NonNull
	@NotBlank
	@NotNull
	@Size(min = 2, max = 20, message = "Name must be >2 and <20"  )
	private String name;

	@Min(value = 0, message = "Id greter than 0")
	@Max(1000)
	private int id;

	@NonNull
	@NotBlank
	@NotNull
	@Size(min = 2, max = 20, message = "rank must be >2 and <20")
	private String rank;

	@NonNull
	@NotBlank
	@NotNull
	@Size(min = 2, max = 20, message = "Batallion must be >2 and <20")
	private String batallion;

	@NonNull
	@NotBlank
	@NotNull
	@Size(min = 2, max = 20, message = "country must be >2 and <20")
	private String country;

}

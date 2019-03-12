package com.gyanweiser.exception.handler.starter.model;

import java.util.Date;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@EqualsAndHashCode
@NoArgsConstructor
public class Project {

	private String projectId;

	@NotNull(message = "Project must have a name")
	private String projectName;

	private String productOwner;

	private Date startDate;

	@NotNull(message = "Total sprints can't be null")
	@Min(value = 1, message = "Total sprints must be greater than or equal to 1.")
	private int totalSprints;

	@Size(min = 1, message = "Atleast one story required to create a project")
	@Valid
	private List<Story> stories;

}

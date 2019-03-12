package com.gyanweiser.exception.handler.starter.model;

import java.util.Date;

import javax.validation.constraints.NotNull;

import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
public class Story {

	private String taskId;

	@NotNull(message = "Story name is required")
	private String storyName;

	private String storyDetails;

	private String assignee;

	private String assignor;

	private Date startDate;

	private int storyPoints;

}

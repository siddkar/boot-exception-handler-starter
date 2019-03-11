package com.gyanweiser.exception.handler.starter.model;

import java.util.Date;

import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode
@Builder
public class Story {
	
	private String taskId;
	
	private String storyName;
	
	private String storyDetails;
	
	private String assignee;
	
	private String assignor;
	
	private Date startDate;
	
	private int storyPoints;

}

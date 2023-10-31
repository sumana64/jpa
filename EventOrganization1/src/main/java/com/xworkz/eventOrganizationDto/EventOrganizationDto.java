package com.xworkz.eventOrganizationDto;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class EventOrganizationDto {
	
	  @Min(value = 1)
	  private int id;
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size
      private String name;
	
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size(min=1)
	  private String email;
	  
	  @Min(value = 1)
	  @Max(value = 10)
	  private long phoneNo;
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size(min=1)
	  private String address;
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size(min=1)
	  private String event;
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size(min=1)
	  private String eventDate;
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size
	  private String eventLocation;
	  @NotNull
	  @NotEmpty
	  @NotBlank
	  @Size(min=1)
	  private String eventToBeConducted;
	  @Min(value = 1)
	  private int noOfGuest;
	  @Min(value = 1)
	  private int noOfDays;

}

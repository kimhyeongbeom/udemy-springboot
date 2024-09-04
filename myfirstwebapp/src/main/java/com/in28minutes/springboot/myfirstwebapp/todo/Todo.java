package com.in28minutes.springboot.myfirstwebapp.todo;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Size;
import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Todo {
	@Id
	@GeneratedValue
	private int id;
	private String username;
	@Size(min=10, message="Enter atleast 10 characters")
	private String description;
	private LocalDate targetDate;
	private boolean done;
}

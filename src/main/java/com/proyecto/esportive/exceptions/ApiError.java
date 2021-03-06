package com.proyecto.esportive.exceptions;

import java.time.LocalDateTime;

import org.springframework.http.HttpStatus;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@Getter @Setter
@RequiredArgsConstructor
@NoArgsConstructor
public class ApiError {

	@NonNull
	private HttpStatus estado;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy/MM/dd")
	private LocalDateTime fecha = LocalDateTime.now();
	@NonNull
	private String mensaje;

}

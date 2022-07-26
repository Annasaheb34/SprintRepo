package com.onlineeyeclinic.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value=HttpStatus.NOT_FOUND)
public class AppointmentIdNotFoundException extends Exception
{
	private static final long serialVersionUID = 1L;

	public AppointmentIdNotFoundException(String message)
	{
		super(message);
	}
}

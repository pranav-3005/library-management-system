package com.sProjects.library.mangement.exceptions;

public class StudentNotFoundException extends RuntimeException{
    public StudentNotFoundException(String message)
    {
        super(message);
    }
}

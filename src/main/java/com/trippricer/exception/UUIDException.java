package com.trippricer.exception;

public class UUIDException extends Exception{

    public UUIDException(String attractionUUID){
        super("Can't parse UUID: "+attractionUUID);
    }
}

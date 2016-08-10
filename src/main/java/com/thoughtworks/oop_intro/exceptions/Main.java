package com.thoughtworks.oop_intro.exceptions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    private static void youCanAlsoRethrowCheckedExceptionsAsRuntimeExceptions() {
        // Instead of this...
        String aString = "";
        BillsAwesomeBufferedReader bufferedReader = new BillsAwesomeBufferedReader(new BufferedReader(null));
        aString = bufferedReader.readLine();
        System.out.println(aString);

        // You could do this...
        BillsAwesomeBufferedReader reader = new BillsAwesomeBufferedReader(new BufferedReader(null));
        String anotherString = reader.readLine();
        System.out.println(anotherString);

    }

    private static void orElseYouCouldHandleTheWrongException() {
        try{
            throw new SpecializedRuntimeException();
        } catch (Exception exception){
            System.out.println("We're catching all Runtime Exceptions when we only want to catch our specialized Runtime Exceptions");
        }
    }

    private static void throwAndCatchYourOwnExceptions() {
        try{
            throw new SpecializedRuntimeException();
        } catch (SpecializedRuntimeException exception){
            System.out.println("Catching a specific exception keeps us from accidentally trying to handle the wrong exception.");
        }
    }

    private static void runtimeExceptionsAreExceptions() {
        try{
            throwsRuntimeException();
        } catch(Exception exception){
            System.out.println("Runtime exceptions are Exceptions");
        }
    }

    private static void throwsRuntimeException() {
        throw new RuntimeException();
    }

    private static void exceptionsAreThrowable() {
        try{
            throw new Exception();
        } catch(Throwable throwable){
            System.out.println("Exceptions are Throwable");
        }
    }

    private static void throwsCheckedException() throws Exception {
        throw new Exception();
    }

    private static void errorsAreThrowable() {
        try{
            throwsError();
        } catch(Throwable throwable){
            System.out.println("Errors are Throwable");
        }
    }

    private static void throwsError() {
        throw new Error();
    }
}

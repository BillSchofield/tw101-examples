package com.thoughtworks.oopintro.exceptions;

public class Main {

    public static void main(String[] args) {
        errorsAreThrowable();
        exceptionsAreThrowable();
        runtimeExceptionsAreExceptions();
        throwAndCatchYourOwnExceptions();
        orElseYouCouldHandleTheWrongException();


    }

    private static void orElseYouCouldHandleTheWrongException() {
        try{
            throw new NotBillsRuntimeException();
        } catch (RuntimeException exception){
            System.out.println("We're catching all Runtime Exceptions when we only wanted Bill's Awesome Runtime Exceptions");
        }
    }

    private static void throwAndCatchYourOwnExceptions() {
        try{
            throw new BillsRuntimeException();
        } catch (BillsRuntimeException exception){
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
            throwsCheckedException();
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

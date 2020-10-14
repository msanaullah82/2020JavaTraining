package com.aspire.training.functional.step0;

import java.util.Optional;

public class IsPureFunction {


    private int five=5;
    private final int anotherFive = 5;
    private int numberOfCalls =0;

    public int addFiveVersion1(int a){

        return a +5;
    }


    public int addFiveVersion2( int a){

        return a+five;
    }

    public int addFiveVersion3( int a){

        return a+anotherFive;
    }

    public int addFiveVersion4(int a){
        int c = 20;
        return a +5;
    }


    public int addFiveVersion5(int a) {
        return a++ +5;
    }

    public int addFiveVersion6(int a){
        numberOfCalls +=1;
        return a +5;
    }

    public int addFiveVersion7(int a){
        System.out.println("I am in addFiveVersion7");
        return a +5;
    }


    public int div(int x,int y ){

        return x/y;
    }

    public Optional<Integer> div2(int x,int y){
        return null;
    }


    public long add(long a){

        return a+System.currentTimeMillis();
    }
}

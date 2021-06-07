package com.csoki.learnmath;

import java.util.Random;

public class mathematics
{
    private int numberA;
    private int numberB;
    private int lengthA = 1;
    private int lengthB = 1;
    
    public mathematics() {
        setNumberA();
        setNumberB();
    }
    
    public void setNumberA(){
        this.numberA = genNumber(lengthA);
    }
    
    public void setNumberB(){
        this.numberB = genNumber(lengthB);
    }
    
    public void setNumberA(int a){
        this.numberA = a;
    };
    public void setNumberB(int b){
        this.numberB = b;
    };
    public void setLengthA(){
        this.lengthA = 1;
    }
    
    private int genNumber(int lengthNum){
        int rand = (int)Math.floor(Math.random()*Math.pow(10,lengthNum));
     
        return rand;
    }
    
    public int getNumberA(){
        return numberA;
    }
    
    public int getNumberB(){
        return numberB;
    }
    
    public int addition(){
        return (numberA + numberB);
    }
    
    public int multiplication(){
        return (numberA * numberB);
    }
}

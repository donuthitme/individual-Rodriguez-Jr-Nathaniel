package com.joysistvi.stage2.discussion.day21;

public class JumpFunction {
    void jump(double height){
        System.out.println("jumping " + height + " meters high");
    }

    void jump(int noOfJump){
        System.out.println("Jump " + noOfJump);
    }

    void jump(long noOfJump){
        System.out.println("Jump " + noOfJump + "long version");
    }

    void jump(String animation){
        System.out.println("Performing jump animation " + animation);
    }

    void jump (int noOfJump, double height) {
        System.out.println("Jump " + noOfJump + " times at " + height + " meters");
    }

    void jump(String animation, int speed, double height){
        System.out.println("Performing " + animation + " at speed " + speed + " while jumping " + height + " meters high");
    }

    public static void main(String[] args) {
        JumpFunction jumpTest = new JumpFunction();
        jumpTest.jump(5);
        jumpTest.jump(2.5f);
        jumpTest.jump("1");
        jumpTest.jump(1);
        jumpTest.jump(1, 3f);
        jumpTest.jump("1", 20, 3f);
    }
}

package frc.robot;

import edu.wpi.first.wpilibj.Timer;

public class Diagnostics implements Runnable {
    public Diagnostics(){

    }

    @Override
    public void run() {
        System.out.println("System Time: " + System.currentTimeMillis());
        System.out.println("Run Time: " + Timer.getFPGATimestamp());
        System.out.println(Robot.testbench.getDefaultCommandName());

    }


}
package frc.robot;

import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.command.Command;

public class RunMotor extends Command {

    private VictorSPX motor;
    private double demand;

    public RunMotor(VictorSPX motor, double demand){
        this.motor = motor;
        this.demand = demand;
    }

    protected void execute(){
        Robot.testbench.runMotor(motor, demand);
    }


    @Override
    protected boolean isFinished() {
        return false;
    }

}
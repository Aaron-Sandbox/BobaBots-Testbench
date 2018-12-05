package frc.robot;

import com.ctre.phoenix.motorcontrol.ControlMode;
import com.ctre.phoenix.motorcontrol.can.VictorSPX;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.command.Subsystem;

public class TestSubsystem extends Subsystem {
     
    public Compressor compressor = new Compressor(1);

    public VictorSPX motorOne = new VictorSPX(1);
    public VictorSPX motorTwo = new VictorSPX(2);
    public VictorSPX motorThree = new VictorSPX(2);
    public VictorSPX motorFour = new VictorSPX(3);

    public VictorSPX[] motors = {motorOne, motorTwo, motorThree, motorFour};

    public TestSubsystem(){
        compressor.clearAllPCMStickyFaults();
        compressor.setClosedLoopControl(true);

    }

    public void runMotor(VictorSPX motor, double demand){
        motor.set(ControlMode.PercentOutput, demand);
    }

    @Override
    protected void initDefaultCommand() {
        setDefaultCommand(null);
    }

    public void stopCompressor(){
        compressor.stop();
        
    }

    public void startCompressor(){
        compressor.start();
    }

}
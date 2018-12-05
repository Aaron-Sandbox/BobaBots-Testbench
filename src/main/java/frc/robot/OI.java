package frc.robot;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

public class OI {
    XboxController xboxcontroller = new XboxController(1);

    JoystickButton ButtonA = new JoystickButton(xboxcontroller, 1);
    JoystickButton ButtonB = new JoystickButton(xboxcontroller, 2);
    JoystickButton ButtonX = new JoystickButton(xboxcontroller, 3);
    JoystickButton ButtonY = new JoystickButton(xboxcontroller, 4);
    JoystickButton ButtonRB = new JoystickButton(xboxcontroller, 6);
    JoystickButton ButtonLB = new JoystickButton(xboxcontroller, 5);
    JoystickButton ButtonRT = new JoystickButton(xboxcontroller, 7);
    JoystickButton ButtonLT = new JoystickButton(xboxcontroller, 8);

    public OI() {
        
    }
}
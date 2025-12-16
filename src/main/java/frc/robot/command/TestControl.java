package frc.robot.command;

import frc.robot.RobotHardware;
import frc.robot.subsystems.Test;
// import frc.robot.command.newRepeatedCommand;

public class TestControl extends frc.robot.command.NewRepeatedCommand{
    private final Test test;

    public TestControl(){
        test = RobotHardware.getInstance().test;
        System.out.println("construct");
    }
    
    @Override
    public void initialize(){
        System.out.println("initialize");
    }

    @Override
    public void execute() {
        test.MoveTest();
    }

    @Override
    public void end(boolean interrupted) {
        // TODO: 
    }


}

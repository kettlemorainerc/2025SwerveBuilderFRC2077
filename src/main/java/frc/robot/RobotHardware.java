package frc.robot;

import frc.robot.generated.TunerConstants;
import frc.robot.subsystems.CommandSwerveDrivetrain;
import frc.robot.subsystems.Test;

public class RobotHardware{

    private static RobotHardware instance = null;
    public static CommandSwerveDrivetrain drivetrain = null;


    public static RobotHardware getInstance(){
        if(instance == null) instance = new RobotHardware();
        return instance;
    }

    public final Test test;

    public RobotHardware(){
        instance = this;

        test = new Test();
        drivetrain = TunerConstants.createDrivetrain();
    }

}

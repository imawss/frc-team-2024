package frc.robot.subsystems;


import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import frc.robot.Constants;;
public class Drivetrain {
    private static Drivetrain drivetrain = new Drivetrain();
    private final PWMSparkMax leftGroup = new PWMSparkMax(Constants.LEFT_MOTOR_GROUP);
    private final PWMSparkMax rightGroup = new PWMSparkMax(Constants.RIGHT_MOTOR_GROUP);
    public DifferentialDrive driveTrain = new DifferentialDrive(leftGroup, rightGroup);
    
}

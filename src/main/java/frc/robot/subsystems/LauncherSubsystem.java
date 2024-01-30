// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import frc.robot.Constants.LaunchersConstants;
import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherSubsystem extends SubsystemBase {

  private XboxController launcherController = new XboxController(Constants.LaunchersConstants.LAUNCHER_CONTROLLER_PORT);
  public PWMSparkMax leftCIMMotor; // CIM motor left
  public PWMSparkMax rightCIMMotor; // CIM motor right

  public LauncherSubsystem() {
    leftCIMMotor = new PWMSparkMax(Constants.LaunchersConstants.LEFT_CIM_MOTOR);
    rightCIMMotor = new PWMSparkMax(Constants.LaunchersConstants.RIGHT_CIM_MOTOR);
  }

  public Command launchCommand() {
    
    throttle(leftCIMMotor, launcherController.getRightTriggerAxis());
    throttle(rightCIMMotor, launcherController.getRightTriggerAxis());

    return runOnce(
        () -> {
        });
  }

  public void throttle(PWMSparkMax motor, double inputValue){
    double gasValue = 0;
    gasValue = 1 * inputValue;
    motor.set(gasValue);
  }

  public boolean exampleCondition() {
    // Query some boolean state, such as a digital sensor.
    return false;
  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }

  @Override
  public void simulationPeriodic() {
    // This method will be called once per scheduler run during simulation
  }
}

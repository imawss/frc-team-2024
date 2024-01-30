// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.subsystems;

import frc.robot.Constants;
import edu.wpi.first.wpilibj.motorcontrol.PWMSparkMax;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class LauncherSubsystem extends SubsystemBase {

  public PWMSparkMax leftCIMMotor; // CIM motor
  public PWMSparkMax rightCIMMotor; // CIM motor

  /** Creates a new ExampleSubsystem. */
  public LauncherSubsystem() {
    leftCIMMotor = new PWMSparkMax(Constants.LEFT_CIM_MOTOR);
    leftCIMMotor.set(1);
    rightCIMMotor = new PWMSparkMax(Constants.RIGHT_CIM_MOTOR);
    rightCIMMotor.set(1);
  }

  /**
   * Example command factory method.
   *
   * @return a command
   */
  public Command launchCommand() {

    return runOnce(
        () -> {
          
        });
  }

  /**
   * An example method querying a boolean state of the subsystem (for example, a digital sensor).
   *
   * @return value of some boolean subsystem state, such as a digital sensor.
   */
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

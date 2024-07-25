// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.Commands;
import edu.wpi.first.wpilibj2.command.button.CommandXboxController;
import frc.robot.subsystems.ShooterSubsystem;

public class RobotContainer {

  
  // START snippet #8
  // CommandXboxController controller = new CommandXboxController(0);
  // END snippet #8 
  
  
  // START snippet #9
  // ShooterSubsystem shooterSubsystem = new ShooterSubsystem();
  // END snippet #9
  public RobotContainer() {
    configureBindings();
  }

  private void configureBindings() {
  // START snippet #10
  // controller.a().whileTrue(shooterSubsystem.runShooterCommand());
  // END snippet #10
  }

  public Command getAutonomousCommand() {
    return Commands.print("No autonomous command configured");
  }
}

// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.CoralSubsystem;

/* You should consider using the more terse Command factories API instead https://docs.wpilib.org/en/stable/docs/software/commandbased/organizing-command-based.html#defining-commands */
public class ScoreCoralHalfSpeedCommand extends Command {
  /** Creates a new ScoreCoralHalfSpeedCommand. */
  private final CoralSubsystem CoralSubsystem;
    
  public ScoreCoralHalfSpeedCommand(CoralSubsystem CoralSubsystem) {
    // Use addRequirements() here to declare subsystem dependencies.
    this.CoralSubsystem = CoralSubsystem;
       
        addRequirements(CoralSubsystem);
  }

  // Called when the command is initially scheduled.
  @Override
  public void initialize() {
    
      CoralSubsystem.scoreL24HalfSpeed();  // Call the method for Level 24 scoring
  
  }

  // Called every time the scheduler runs while the command is scheduled.
  @Override
  public void execute() {}

  // Called once the command ends or is interrupted.
  @Override
  public void end(boolean interrupted) {
    CoralSubsystem.stopCoral();
  }

  // Returns true when the command should end.
  @Override
  public boolean isFinished() {
    return false;
  }
}

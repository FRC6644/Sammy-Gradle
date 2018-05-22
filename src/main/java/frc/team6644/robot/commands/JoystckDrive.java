package frc.team6644.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import frc.team6644.robot.subsytems.DriveMotors;

public class JoystckDrive extends Command {
	Joystick stick = new Joystick(0);

	protected void initialize() {

	}

	protected void execute() {
		DriveMotors.getInstance().arcadeDrive(stick.getY(), stick.getX());
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}

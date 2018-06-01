package frc.team6644.robot.commands;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;
import frc.team6644.robot.subsytems.DriveMotors;

public class JoystckDrive extends Command {
	Joystick stick = new Joystick(0);
	double sensitivity = 1;

	protected void initialize() {

	}

	public double getSensitivity() {
		return -(stick.getRawAxis(3) - 1) / 2;
	}

	protected void execute() {
		sensitivity = getSensitivity();
		SmartDashboard.putNumber("sense", sensitivity);
		DriveMotors.getInstance().arcadeDrive(-stick.getY() * sensitivity, stick.getX() * sensitivity);
	}

	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}

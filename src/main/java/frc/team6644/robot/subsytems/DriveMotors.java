package frc.team6644.robot.subsytems;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import frc.team6644.robot.RobotPorts;

public class DriveMotors extends Subsystem {
	static DriveMotors instance;

	public static DriveMotors getInstance() {
		if (instance == null)
			instance = new DriveMotors();
		return instance;

	}

	private DifferentialDrive drive;

	private DriveMotors() {
		Spark left = new Spark(RobotPorts.LEFT_DRIVE_PWM_SPLIT.get());
		Spark right = new Spark(RobotPorts.RIGHT_DRIVE_PWM_SPLIT.get());
		left.setInverted(false);
		right.setInverted(false);
		drive = new DifferentialDrive(left, right);
	}

	public void tankDrive(double left, double right) {
		drive.tankDrive(left, right);
	}

	public void arcadeDrive(double x, double y) {
		drive.arcadeDrive(x, y);
	}

	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

}

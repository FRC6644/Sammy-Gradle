package frc.team6644.robot;

public enum RobotPorts {

	// Laptop USB Ports
	JOYSTICK(0),

	FRONT_IR_LEFT(1), FRONT_IR_RIGHT(0),

	// PWM Ports
	RIGHT_DRIVE_PWM_SPLIT(0), LEFT_DRIVE_PWM_SPLIT(1),
	// Digital Ports
	LEFT_ENCODER_A(0), LEFT_ENCODER_B(1), RIGHT_ENCODER_A(2), RIGHT_ENCODER_B(3);
	private final int portNumber;

	private RobotPorts(int portNumber) {
		this.portNumber = portNumber;
	}

	public int get() {
		return portNumber;
	}
}
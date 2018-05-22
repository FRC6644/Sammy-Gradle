package frc.team6644.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Scheduler;
import frc.team6644.robot.commands.JoystckDrive;

public class Robot extends IterativeRobot {
    @Override
    public void robotInit() { 
   
    }

    @Override
    public void disabledInit() { }

    @Override
    public void autonomousInit() { }

    @Override
    public void teleopInit() {
    	Scheduler.getInstance().add(new JoystckDrive());
    }

    @Override
    public void testInit() { }


    @Override
    public void disabledPeriodic() { }
    
    @Override
    public void autonomousPeriodic() { }

    @Override
    public void teleopPeriodic() {
    	Scheduler.getInstance().run();
    }

    @Override
    public void testPeriodic() { }
}
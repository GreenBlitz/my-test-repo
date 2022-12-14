package edu.greenblitz.robot;


import edu.wpi.first.wpilibj.TimedRobot;
import edu.wpi.first.wpilibj2.command.CommandScheduler;

public class Robot extends TimedRobot {

	@Override
	public void robotInit() {
		CommandScheduler.getInstance().enable();
		
	}

	@Override
	public void robotPeriodic() {
		CommandScheduler.getInstance().run();

	}


	@Override
	public void disabledInit() {
		CommandScheduler.getInstance().cancelAll();
	}

	@Override
	public void teleopInit() {
		CommandScheduler.getInstance().cancelAll();
		
	}

	@Override
	public void teleopPeriodic() {
	}
	
	@Override
	public void autonomousInit() {
	
	}

	@Override
	public void testInit() {
		CommandScheduler.getInstance().cancelAll();
	}

	@Override
	public void testPeriodic() {
	}
}

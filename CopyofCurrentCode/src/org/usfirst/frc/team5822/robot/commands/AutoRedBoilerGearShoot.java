package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

public class AutoRedBoilerGearShoot extends CommandGroup
{
	public AutoRedBoilerGearShoot()
	{
		 addSequential(new DriveForward(42));
	     addSequential(new TurnLeftFast(-55));
	     addSequential(new TurnRightSlow(-55));
	     addSequential(new ResetEncoder());
	     addSequential(new GearCG());
	     addSequential(new ResetGyro());
	     addSequential(new DriveForward(67));
	     addSequential(new DriveSlow(2));
			
	    addSequential(new ResetEncoder());
	    addSequential(new ResetGyro()); 
		addSequential(new DriveBackward(-18));
		addSequential(new ResetGyro());
		
		//TODO: this broke here
		addSequential(new TurnRightFast(59.42)); //almost 180, turn around to the boiler
		addSequential(new TurnLeftSlow(59.42));
		addSequential(new DriveBackward(20));
		addSequential(new ResetGyro());
		addSequential(new TurnLeftFast(-74.79));
		addSequential(new TurnRightSlow(-74.79));
		addSequential(new DriveBackward(27));
		//addSequential(new LineUpBoiler());
		//addSequential(new Shoot());
	}
}

package org.usfirst.frc.team5822.robot.commands;

import edu.wpi.first.wpilibj.command.CommandGroup;

/**
 *
 */
public class AutoCenterGear extends CommandGroup {

    public AutoCenterGear() {
       addSequential(new GearCG());
       addSequential(new DriveForward(60));
       addSequential(new DriveSlow(2));
    }
}

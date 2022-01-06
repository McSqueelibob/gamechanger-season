/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.commands.auto.trajectories;

import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.util.Units;

/**
 *
 */
public class TGSearchAB extends TBase {

  int error = 0;

  public TGSearchAB() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
        x|   y|angle
    S   0,   0,   0
    A   0,  60,
    B -30, 120,
    C -60, 150,
    D  60, 150,
    E  30, 180,
    F   0, 240, 
    N   0, 300,   0
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(150-error), Units.inchesToMeters(-55)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(180-error), Units.inchesToMeters(25)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(240-error), Units.inchesToMeters(0)));
    end = new Pose2d(Units.inchesToMeters(300), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
  }

}

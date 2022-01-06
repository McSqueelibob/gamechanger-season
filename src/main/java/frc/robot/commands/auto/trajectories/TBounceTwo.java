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
public class TBounceTwo extends TBase {

  public TBounceTwo() {

  }

  @Override
  public boolean isReversed() {
      return true; //TBounceTwo segment is driven reversed
  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
        x|   y|angle
    S   0,   0,   0
    D   0, -30,
    E -30, -90,
    F -60,-120,
    g -90, -90
    G   0, -90, 180
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(-30), Units.inchesToMeters(0)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(-90), Units.inchesToMeters(-30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(-120), Units.inchesToMeters(-60)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(-90), Units.inchesToMeters(-90)));
    end = new Pose2d(Units.inchesToMeters(10), Units.inchesToMeters(-90), Rotation2d.fromDegrees(180-5));
  }

}

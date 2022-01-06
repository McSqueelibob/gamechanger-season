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
public class TGSearchBR extends TBase {

  int error = 5;

  public TGSearchBR() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
    subtract 15 from y to get the front of the robot
        x|   y|angle
    S   0,   0,   0
    A  30,  60,
    B -30, 120,
    C -30, 150,
    D  30, 180,
    E  30, 210,
    F -30, 270, 
    N   0, 300,   0
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(60-error), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(120-error), Units.inchesToMeters(-30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(180-error), Units.inchesToMeters(30)));
    end = new Pose2d(Units.inchesToMeters(300), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
  }

}

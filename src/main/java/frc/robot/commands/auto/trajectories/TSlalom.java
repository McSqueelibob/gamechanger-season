// Copyright (c) FIRST and other WPILib contributors.
// Open Source Software; you can modify and/or share it under the terms of
// the WPILib BSD license file in the root directory of this project.

package frc.robot.commands.auto.trajectories;

import edu.wpi.first.wpilibj.geometry.Pose2d;
import edu.wpi.first.wpilibj.geometry.Rotation2d;
import edu.wpi.first.wpilibj.geometry.Translation2d;
import edu.wpi.first.wpilibj.util.Units;

/** Add your docs here. */
public class TSlalom extends TBase {

  public TSlalom() {

  }

  @Override
  void build() {
    /*
    x & y are flipped so the translations are y, x
        x|   y|angle
    S   0,   0,   0
    A   0,  30,
    b  30,  60,
    B  60,  90,
    c  60, 150,
    C  60, 210,
    d  30, 240,
    D   0, 270,
    E  30, 300,
    F  60, 270,
    g  30, 240,
    G   0, 210,
    h   0, 150,
    H   0,  90,
    i  30,  60,
    I  60,  30,
    J  60,   0, 180
    */
    start = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(0), Rotation2d.fromDegrees(0));
    Waypoints.add(new Translation2d(Units.inchesToMeters(30), Units.inchesToMeters(0)));   //A
    Waypoints.add(new Translation2d(Units.inchesToMeters(60), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(90), Units.inchesToMeters(60)));  //B
    Waypoints.add(new Translation2d(Units.inchesToMeters(150), Units.inchesToMeters(60)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(210), Units.inchesToMeters(60))); //C
    Waypoints.add(new Translation2d(Units.inchesToMeters(240), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(270), Units.inchesToMeters(0)));  //D
    Waypoints.add(new Translation2d(Units.inchesToMeters(300), Units.inchesToMeters(30))); //E
    Waypoints.add(new Translation2d(Units.inchesToMeters(270), Units.inchesToMeters(60))); //F
    Waypoints.add(new Translation2d(Units.inchesToMeters(240), Units.inchesToMeters(30)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(210), Units.inchesToMeters(6)));  //G
    Waypoints.add(new Translation2d(Units.inchesToMeters(150), Units.inchesToMeters(6)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(90), Units.inchesToMeters(6)));   //H
    Waypoints.add(new Translation2d(Units.inchesToMeters(60), Units.inchesToMeters(36)));
    Waypoints.add(new Translation2d(Units.inchesToMeters(30), Units.inchesToMeters(66)));  //I
    end = new Pose2d(Units.inchesToMeters(0), Units.inchesToMeters(60), Rotation2d.fromDegrees(180));
  }

}

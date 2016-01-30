package org.usfirst.frc4089.FRC2016Robot;

/**
 * 
 * @author Mitch Tolson
 *
 */
// file used to drive constants throughout the robot program
public class Constants {
	public static final double LIFT_SPEED = .8;
	
	public static final double DRIVE_SPEED = 0.8;
	public static final double autoDriveTime = 2.2; // time from zone 1 to middle zone
	public static final double autoDriveFWTote = 0.8; //time driving forward to pickup a tote when bot infront of tote
	public static final double autoDriveFWBin = 0.4; // time driving FW to pickup bin, when bot infront of bin
	public static final double autoDriveFWBin1 = 0.6;
	public static final double autoDriveBWTimed = 0.4; // time when driving BW
	public static final double autoDriveTurn90Time = 0.9; // time to turn 90
	public static final double autoDriveTurnRight45Time = 0.9;
	public static final double autoDriveTurnRight30Time = 0.30;
	public static final double autoDriveTurnLeft45Time = 0.45;
	public static final double autoDriveTurnLeft30Time = 0.30;
	public static final double leftDriveSpeed = -0.8;
	public static final double rightDriveSpeed = -0.8;
	public static final double resPan = 0.01;
	public static final double resTilt = 0.01;
	public static final double airBiceptTimeout = 0.05; //time for bicept function to timeout
	public static final double airTimeoutExtend = 0.5;
	public static final double airTimoutRetract = 0.5; //time delay for kicker to auto retract
	public static final double gyro1sensitivity = 0.007;
	public static final double gyroKp = 0.03;
	//public static final double leftLiftDriveDown = -0.92; //practice
	public static final double leftLiftDriveDown = -0.89; //practice
	//public static final double leftLiftDrive = -0.940; //prod
	public static final double rightLiftDriveDown = -0.91;
	public static final double leftLiftDriveUp = -0.89; //practice
	//public static final double leftLiftDrive = -0.940; //prod
	public static final double rightLiftDriveUp = -0.91;
	//public static final double rightLiftDriveUp = -0.90; //practicef 
	
	public static final double encoderLeftDistancePerPulse = 0.0785398; //Sets the scale factor between pulses and distance. The library already accounts for the decoding scale factor (1x, 2x, 4x) separately so this value should be set exclusively based on the encoder's Pulses per Revolution and any gearing following the encoder.
	public static final double encoderRightDistancePerPulse = 0.0785398;
	public static final double encoderSamplesToAverage = 7; //Sets the number of samples to average when determining the period. Averaging may be desired to account for mechanical imperfections (such as unevenly spaced reflectors when using a reflective sensor as an encoder) or as oversampling to increase resolution. Valid values are 1 to 127 samples.
	public static final double encoderMaxPeriod = 0.1; //The maximum period (in seconds) where the device is still considered moving. This value is used to determine the state of the getStopped() method and effect the output of the getPeriod() and getRate() methods. This is the time between pulses on an individual channel (scale factor is accounted for). It is recommended to use the Min Rate parameter instead as it accounts for the distance per pulse, allowing you to set the rate in engineering units.
	public static final double encoderMinRate = 10; //Sets the minimum rate before the device is considered stopped. This compensates for both scale factor and distance per pulse and therefore should be entered in engineering units (RPM, RPS, Degrees/sec, In/s, etc)
	public static final double roboRioADCResolution = 12; // this is the resolution of the ADC (analog to digital converter) behind the accelorometer
	public static final double roboRioLSBWeight = 3.906; // units:mg; is the value in volts of the increment between data values: 16g / 2^ADCResolution
	public static final double anAccelSensitivity = 0.0;
	public static final double anAccelZero = 2.5; // actual value will vary depending on specific device
	public static final double autoLiftToteTime = 1.1;
	public static final double autoLiftBinTime = 1.4;
	public static final double autoGyroTurn90LT = 1.2; // volt reading at 2.5 normal, +/- 7mV/deg
	public static final double autoGyroTurn90RT = 3.8; // volt reading at 2.5 normal, +/- 7mV/deg
	public static final double DeployFlapsCycleTime = 0.25; //time between lift cycle can occur
	//speed of wheels on front arms
	public static final double deployWheelsLeftSpeed = 0.5;
	public static final double deployWheelsRightSpeed = 0.5;
	public static final double autoWheelsInTime = 0.6; //time for wheels to run to suck in tote
	public static final double wheelsInTimeout = 1.0;
}
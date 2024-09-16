package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.OpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorSimple;
import com.qualcomm.robotcore.hardware.HardwareMap;

public class MecanumDrive {

    LinearOpMode _opMode;
    HardwareMap _hardwareMap;

    //declare motors
    DcMotor _frontLeft = null;
    DcMotor _frontRight = null;
    DcMotor _backLeft = null;
    DcMotor _backRight = null;

    public MecanumDrive(LinearOpMode opMode){

        _opMode = opMode;
        _hardwareMap = opMode.hardwareMap;

        //configure all motors, must use "RUN_USING_ENCODER" when using controller.
        //set stop behavior to brake for best control and stability against other robots
        //   ---> tell motor to go to current position for better braking, causes overheating and massive power consumption
        _frontLeft = _hardwareMap.get(DcMotor.class, "frontLeft");
        _frontLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        _frontLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        _frontLeft.setDirection(DcMotorSimple.Direction.REVERSE);


        _frontRight = _hardwareMap.get(DcMotor.class, "frontRight");
        _frontRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        _frontRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        _frontRight.setDirection(DcMotorSimple.Direction.FORWARD);


        _backLeft = _hardwareMap.get(DcMotor.class, "backLeft");
        _backLeft.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        _backLeft.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        _backLeft.setDirection(DcMotorSimple.Direction.REVERSE);


        _backRight = _hardwareMap.get(DcMotor.class, "backRight");
        _backRight.setMode(DcMotor.RunMode.RUN_USING_ENCODER);
        _backRight.setZeroPowerBehavior(DcMotor.ZeroPowerBehavior.BRAKE);
        _backRight.setDirection(DcMotorSimple.Direction.FORWARD);
    }
}

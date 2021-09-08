package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.TouchSensor;

/**
 * This op mode allows you to get values from a touch sensor plugged into any digital port. To
 * test a sensor, change its name in your hardware map to "sensorToTest".
 */
@TeleOp(name="Touch Sensor Test")
public class TouchSensorTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        TouchSensor touchSensor = hardwareMap.get(TouchSensor.class, "sensorToTest");

        waitForStart();

        while(opModeIsActive()) {
            telemetry.addLine("Touch Sensor:");
            telemetry.addLine("Is Pressed: " + touchSensor.isPressed());
            telemetry.addLine("Force Applied: " + touchSensor.getValue());
            telemetry.update();
        }
    }
}

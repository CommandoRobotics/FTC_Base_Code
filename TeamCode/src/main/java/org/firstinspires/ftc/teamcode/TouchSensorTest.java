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

        // Initialize our robot
        TouchSensor touchSensor = hardwareMap.get(TouchSensor.class, "sensorToTest");

        // Wait for the play button to be pressed
        waitForStart();

        // Runs repeatedly while this op mode is active
        while(opModeIsActive()) {
            // Write to our telemetry
            telemetry.addLine("Touch Sensor:");
            telemetry.addLine("Is Pressed: " + touchSensor.isPressed()); // Show whether the sensor is pressed
            telemetry.addLine("Force Applied: " + touchSensor.getValue()); // Get the force applied value (will be either 0 or 1 if sensor does't support this).
            telemetry.update();
        }
    }
}

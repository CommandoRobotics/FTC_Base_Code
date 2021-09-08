package org.firstinspires.ftc.teamcode;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.eventloop.opmode.TeleOp;
import com.qualcomm.robotcore.hardware.ColorSensor;

/**
 * This op mode allows you to get values from a color sensor plugged into any I2C port. To test
 * a sensor, change its name in your hardware map to "sensorToTest". You can also toggle the
 * LED using the "a" button on gamepad 1.
 */
@TeleOp(name="Color Sensor Test")
public class ColorSensorTest extends LinearOpMode {
    @Override
    public void runOpMode() throws InterruptedException {

        ColorSensor colorSensor = hardwareMap.get(ColorSensor.class, "sensorToTest");

        waitForStart();

        boolean isAPressed = false;
        boolean ledToggle = false;

        while(opModeIsActive()) {

            if(gamepad1.a) {
                if(!isAPressed) {
                    colorSensor.enableLed(ledToggle);
                    ledToggle = !ledToggle;
                    isAPressed = true;
                }
            } else {
                isAPressed = false;
            }

            telemetry.addLine("Color Sensor:");
            telemetry.addLine("Red: " + colorSensor.red());
            telemetry.addLine("Green: " + colorSensor.green());
            telemetry.addLine("Blue: " + colorSensor.blue());
            telemetry.addLine("Is LED enabled: " + ledToggle);
            telemetry.update();
        }
    }
}

package org.firstinspires.ftc.teamcode.PidController;

public class PidController {

    double pGain = 0;
    double iGain = 0;
    double dGain = 0;
    double previousError = 0;
    double previousTimeInMillis = 0;
    double output;

    double iMax = 1;

    /**
     * Create a new PID controller
     * @param pGain The P gain
     * @param iGain The I gain
     * @param dGain The D gain
     */
    public PidController(double pGain, double iGain, double dGain) {
        this.pGain = pGain;
        this.iGain = iGain;
        this.dGain = dGain;
    }

    /**
     * Calculate the control loop output
     * @param currentPosition The current position
     * @param desiredPosition The desired position
     */
    private void calculate(double currentPosition, double desiredPosition) {
        double p = 0;
        double i = 0;
        double d = 0;

        double currentTimeInMillis = System.currentTimeMillis();
        double currentError = desiredPosition-currentPosition;

        p = pGain*currentError;

        i += iGain*(currentError*(currentTimeInMillis-previousTimeInMillis));

        if(i > iMax) {
            i = iMax;
        } else if(i < -iMax) {
            i = -iMax;
        }

        d = dGain*(currentError-previousError)/(currentTimeInMillis-previousTimeInMillis);

        output = p+i+d;

        previousError = currentError;
        previousTimeInMillis = currentTimeInMillis;
    }

    /**
     * Runs the PID math based on the positions given and returns the output of the control loop
     * @param currentPosition The current position
     * @param desiredPosition The desired position
     * @return The control loop output
     */
    public double getOutput(double currentPosition, double desiredPosition) {
        calculate(currentPosition, desiredPosition);
        return output;
    }

    /**
     * Gets the previous control loop output
     * @return
     */
    public double getPreviousOutput() {
        return output;
    }

    /**
     * Update the P gain
     * @param newPGain The new P gain
     */
    public void updatePGain(double newPGain) {
        pGain = newPGain;
    }

    /**
     * Update the I gain
     * @param newIGain The new I gain
     */
    public void updateIGain(double newIGain) {
        iGain = newIGain;
    }

    /**
     * Update the D gain
     * @param newDGain The new D gain
     */
    public void updateDGain(double newDGain) {
        dGain = newDGain;
    }

    /**
     * Get the current P gain
     * @return The current P gain
     */
    public double getPGain() {
        return pGain;
    }

    /**
     * Get the current I gain
     * @return The current I gain
     */
    public double getIGain() {
        return iGain;
    }

    /**
     * Get the current D gain
     * @return The current D gain
     */
    public double getDGain() {
        return dGain;
    }

}

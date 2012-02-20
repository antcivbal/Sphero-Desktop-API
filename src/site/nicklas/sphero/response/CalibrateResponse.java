package site.nicklas.sphero.response;

import site.nicklas.sphero.command.DeviceCommand.DEVICE_COMMAND;

/**
 * Calibration response received after sending a CalibrateCommand
 *
 * @author Nicklas Gavelin
 */
public class CalibrateResponse extends DeviceResponse
{
    /**
     * Create a response from the received data
     *
     * @param data The received data
     */
    public CalibrateResponse( byte[] data )
    {
        super( DEVICE_COMMAND.CALIBRATE, data );
    }
}
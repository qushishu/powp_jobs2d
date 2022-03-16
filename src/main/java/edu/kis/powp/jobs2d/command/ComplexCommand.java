package edu.kis.powp.jobs2d.command;

import edu.kis.powp.jobs2d.Job2dDriver;
import java.util.List;

public class ComplexCommand implements DriverCommand{
    List<DriverCommand> driverCommands;

    public ComplexCommand(List<DriverCommand> driverCommands) {
        this.driverCommands = driverCommands;
    }

    @Override
    public void execute(Job2dDriver driver) {
        for (DriverCommand driverCommand: driverCommands) {
            driverCommand.execute(driver);
        }
    }
}

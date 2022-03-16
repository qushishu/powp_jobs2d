package edu.kis.powp.jobs2d.command;

import java.util.*;

public class ComplexCommandFactory {
    public ComplexCommand getRectangleCommand(){
        List<DriverCommand> list = Arrays.asList(new SetPositionCommand(-200, -120),
                new OperateToCommand(200, -120),
                new OperateToCommand(200, 120),
                new OperateToCommand(-200, 120),
                new OperateToCommand(-200, -120));

        return new ComplexCommand(list);
    }

    public ComplexCommand getSquareCommand(){
            List<DriverCommand> list = Arrays.asList(new SetPositionCommand(-120, -120),
                    new OperateToCommand(120, -120),
                    new OperateToCommand(120, 120),
                    new OperateToCommand(-120, 120),
                    new OperateToCommand(-120, -120));

        return new ComplexCommand(list);
    }

    public ComplexCommand getTriangleCommand(){
        List<DriverCommand> list = Arrays.asList(new SetPositionCommand(-120, -120),
                new OperateToCommand(120, -120),
                new OperateToCommand(0, 120),
                new OperateToCommand(-120, -120));

        return new ComplexCommand(list);
    }
}

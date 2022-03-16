package edu.kis.powp.jobs2d.events;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import edu.kis.powp.jobs2d.command.ComplexCommandFactory;
import edu.kis.powp.jobs2d.drivers.DriverManager;
import edu.kis.powp.jobs2d.magicpresets.FiguresJoe;

public class SelectTestFigureOptionListener implements ActionListener {

	private final DriverManager driverManager;

	public SelectTestFigureOptionListener(DriverManager driverManager) {
		this.driverManager = driverManager;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		ComplexCommandFactory complexCommandFactory;
		switch (e.getActionCommand()) {
			case "Figure Joe 1":
				FiguresJoe.figureScript1(driverManager.getCurrentDriver());
				break;
			case "Figure Joe 2":
				FiguresJoe.figureScript2(driverManager.getCurrentDriver());
				break;
			case "Square":
				complexCommandFactory = new ComplexCommandFactory();
				complexCommandFactory.getSquareCommand().execute(driverManager.getCurrentDriver());
				break;
			case "Rectangle":
				complexCommandFactory = new ComplexCommandFactory();
				complexCommandFactory.getRectangleCommand().execute(driverManager.getCurrentDriver());
				break;
			case "Triangle":
				complexCommandFactory = new ComplexCommandFactory();
				complexCommandFactory.getTriangleCommand().execute(driverManager.getCurrentDriver());
				break;
		}

	}
}

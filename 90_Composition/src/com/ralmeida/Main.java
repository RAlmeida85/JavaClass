package com.ralmeida;

public class Main {

    public static void main(String[] args) {
//      Dimensions dimensions = new Dimensions(20, 20, 5);
//	    Case theCase = new Case("220B", "Dell", "250", dimensions);
//
//	    Monitor monitor = new Monitor("27inch Beast", "Acer", 27, new Resolution(2540, 1440));
//
//	    Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");
//
//	    Computer pc = new Computer(theCase, monitor, motherboard);
//
//	    pc.getMonitor().drawPixelAt(1500,1200,"red");
//	    pc.getMotherboard().loadProgram("Windows 1.0");
//	    pc.getTheCase().pressPowerButton();

		// Create a single room of a house using composition.
		// Think about the things that should be included in the room.
		// Maybe physical parts of the house but furniture as well
		// Add at least one method to access an object via a getter and
		// then that objects public method as you saw in the previous video
		// then add at least one method to hide the object e.g. not using a getter
		// but to access the object used in composition within the main class
		// like you saw in this video.
	    Wardrobe wardrobe = new Wardrobe(3, 4);
	    Mattress mattress = new Mattress("Queen");
	    Bed bed = new Bed("Queen", mattress);
	    Bedroom bedroom = new Bedroom(1, 2, wardrobe, bed, mattress);

	    bedroom.wardrobe.openDoors();
	    bedroom.wardrobe.openDoors();
	    bedroom.bed.mattressFit(bed.getMattress());
	    bedroom.wardrobe.closeDoors();
    }
}

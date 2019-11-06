

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Tester {

	public static void main(String[] args) {
		List<SpaceCraft> spacecraftHanger = new ArrayList<>();
		
		spacecraftHanger.add(new SpaceCraft("NukeMayhemModel",new Coordinates(1,2,3)));
		
		spacecraftHanger.add(new SpaceCraft("NukeMayhemModel",new Coordinates(4,6,3)));
		spacecraftHanger.add(new SpaceCraft("NukeMayhemModel",new Coordinates(8,2,3)));
		spacecraftHanger.add(new SpaceCraft("CoreDrillerModel,",new Coordinates(9,2,3)));
		spacecraftHanger.add(new SpaceCraft("CoreDrillerModel,",new Coordinates(9,9,3)));
		spacecraftHanger.add(new SpaceCraft("CoreDrillerModel,",new Coordinates(9,4,3)));
		spacecraftHanger.add(new SpaceCraft("CoreDrillerModel,",new Coordinates(7,2,3)));
		spacecraftHanger.add(new SpaceCraft("SwiftMapleModel,",new Coordinates(5,2,3)));
		spacecraftHanger.add(new SpaceCraft("SwiftMapleModel,",new Coordinates(7,2,3)));
		spacecraftHanger.add(new SpaceCraft("SwiftMapleModel,",new Coordinates(3,2,3)));
		spacecraftHanger.add(new SpaceCraft("SwiftMapleModel,",new Coordinates(9,2,5)));
		
		for (Iterator iterator = spacecraftHanger.iterator(); iterator.hasNext();) {
			SpaceCraft spaceCraft = (SpaceCraft) iterator.next();
			spaceCraft.launch();
			
		}
	}
}

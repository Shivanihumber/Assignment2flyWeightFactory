
public class SpaceCraft {

	private ICraftModel craftModel;
	private Coordinates coordinates;
	private int craftID;
	private static int count=1;
	
	
	

	public SpaceCraft(String type, Coordinates coordinates) {
		super();
		this.craftModel = SpacecraftModelFactory.getInstance().getSpacecraftModel(type);
		this.coordinates = coordinates;
		this.craftID = count++;
	}



	public void launch() {
		System.out.println("ID:" + craftID + " | " + coordinates + " | Texture:" + craftModel.getTexture() + " | Mash:"
				+ craftModel.getMesh() + " | MaxSpeed:" + craftModel.getMaxSpeed() + " | Acceleration:"
				+ craftModel.getAcceleration() + " | Damage: " + craftModel.getDamage());

	}

}

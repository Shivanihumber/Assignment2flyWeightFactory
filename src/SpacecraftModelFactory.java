import java.util.HashMap;

public class SpacecraftModelFactory {

	private static SpacecraftModelFactory uniqueInstance;

	private final HashMap<String, ICraftModel> craftModelHashMap = new HashMap<>();

	private SpacecraftModelFactory() {

	}

	public synchronized static SpacecraftModelFactory getInstance() {
		if (uniqueInstance == null)
			uniqueInstance = new SpacecraftModelFactory();
		return uniqueInstance;
	}

	public synchronized ICraftModel getSpacecraftModel(String type) {
		if (craftModelHashMap.containsKey(type)) {
			return craftModelHashMap.get(type);
		} else {
			int count = craftModelHashMap.size() + 1;
			craftModelHashMap.put(type,
					new SpacecraftModel("mesh" + count, "texture" + count, 100 + count, 66.66f + count, 33.1f + count));
			return craftModelHashMap.get(type);
		}

	}

	private class SpacecraftModel implements ICraftModel {

		private String mesh;
		private String texture;
		private int maxSpeed;
		private float acceleration;
		private float damage;

		public SpacecraftModel(String mesh, String texture, int maxSpeed, float acceleration, float damage) {
			super();
			this.mesh = mesh;
			this.texture = texture;
			this.maxSpeed = maxSpeed;
			this.acceleration = acceleration;
			this.damage = damage;
		}

		@Override
		public String getMesh() {

			return mesh;
		}

		@Override
		public String getTexture() {

			return texture;
		}

		@Override
		public int getMaxSpeed() {

			return maxSpeed;
		}

		@Override
		public float getAcceleration() {

			return acceleration;
		}

		@Override
		public float getDamage() {

			return damage;
		}

	}
}

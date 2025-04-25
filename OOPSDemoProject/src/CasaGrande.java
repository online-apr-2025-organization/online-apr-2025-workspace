
public class CasaGrande implements SafetyGuidelines2021 {

	@Override
	public String protectHead() {
		return "Protected with steel helmets of " + HEAD_GEAR_THICKNESS + " mm thickness...";
	}

	@Override
	public String protectFeet() {
		return "Protected with steel shoes of " + FEET_GEAR_THICKNESS + " mm thickness...";
	}

}

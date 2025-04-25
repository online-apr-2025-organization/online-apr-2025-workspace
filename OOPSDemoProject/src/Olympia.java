
public class Olympia implements SafetyGuidelines2021{

	@Override
	public String protectHead() {
		return "Protected with fiber helmets of " + HEAD_GEAR_THICKNESS + " mm thickness...";
	}

	@Override
	public String protectFeet() {
		return "Protected with fiber shoes of " + FEET_GEAR_THICKNESS + " mm thickness...";
	}

}

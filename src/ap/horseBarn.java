package ap;

public class horseBarn {

	static Horse[] spaces;
	
	public horseBarn(Horse[] spaces){
		
	this.spaces = spaces; 	
		
	}
	
	public static horseBarn createTestBarn(){
		
		spaces[0] = new Horse("Trigger", 1340);
		
		spaces[2] = new Horse("Silver", 1210);

		spaces[3] = new Horse("Lady", 1575);

		spaces[5] = new Horse("Patches", 1350);

		spaces[6] = new Horse("Duke", 1410);
		
		return null;
		
	}
	
	public static Horse[] getSpaces(){	
		
		return spaces;
	}

	public static Object findHorseSpace(String name) {
		
			String indexName = "";

			int index = -1;

			for (int i = 0; i < spaces.length; i++) {

				indexName = (String) spaces[i].getName();

				if (name.equals(indexName)) {

					index = i;

					break;
				}
			}
			return index;
		}
		
	}
	

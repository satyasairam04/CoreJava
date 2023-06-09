import java.util.HashMap;

public class CharacterFrequency {

	public static void main(String[] args) {		

				String inputString = "assdfssfdaadffdas";
				HashMap<Character, Integer> map = new HashMap<>();
				for (int i = 0; i < inputString.length(); i++) {
					char c = inputString.charAt(i);
					if (map.containsKey(c)) {
						map.put(c, (map.get(c)) + 1);
					} else {
						map.put(c, 1);
					}
				}
				System.out.println(map);
			}
	}


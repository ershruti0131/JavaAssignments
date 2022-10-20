import java.util.HashMap;

public class CountWordsInString {

	public void CountWords(String string)

	{
		String str = string;

		String[] Split = str.split(" ");
		HashMap<String, Integer> map = new HashMap<>();
		for (int i = 0; i < Split.length; i++) {
			if (map.containsKey(Split[i])) {
				int count = map.get(Split[i]);
				map.put(Split[i], count + 1);
			} else
				map.put(Split[i], 1);

		}
		System.out.println(map);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountWordsInString obj = new CountWordsInString();
		obj.CountWords("hey ram hey ram hey krishana hari hari");

	}

}

public class Application {

	public static void main(String args[]) {

		Item<String> stringItem = new Item<>();

		stringItem.setE("Jose");

		Item<Integer> integerItem = new Item<>();

		integerItem.setE(25);

		SmallBag<Item> smallBagItem = new SmallBag<>();

		smallBagItem.setItem(stringItem);

		System.out.println(smallBagItem.getItem().getE());

		smallBagItem.setItem(integerItem);

		System.out.println(smallBagItem.getItem().getE());

	}
}
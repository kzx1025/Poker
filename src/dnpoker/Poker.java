package dnpoker;
public class Poker {
	public int color, value;
	//int flag;
	private static String[] colors = { "方块", "樱花", "红桃", "黑桃" };
	private static String[] values = { "1", "2", "3", "4", "5", "6", "7", "8",
			"9", "10", "J", "Q", "K" };

	Poker(int color, int value) {
		this.color = color;
		this.value = value;
	}

	public int getcolor() {
		return color;
	}

	public int getvalue() {

		return value;
	}

	public String result() {
		return colors[color] + values[value];
	}

	static int changeJQK(Poker poker) {
		if (poker.getvalue() > 9)// 返回该值大小
		{
			return 9;
		}
		return poker.getvalue();
	}

	static boolean comparesingle(Poker a, Poker b)// 判断单张牌大小
	{
		if (a.getvalue() == b.getvalue()) {
			return a.getcolor() > b.getcolor();
		} else {
			return a.getvalue() > b.getvalue();
		}
	}

}

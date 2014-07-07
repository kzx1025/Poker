 public class Card{
	private int color,value;
	private static String[] colors={"·½¿é","Ó£»¨","ºìÌÒ","ºÚÌÒ"};
	private static String[] values={"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
    Card(int color,int value)
    {
    	this.color=color;
    	this.value=value;
    }
    public int getcolor()
    {
    	return color;
    }
    public int getvalue()
    {

    	return value;
    }
    public String result()
    {
    	return colors[color]+""+values[value];
    }
}

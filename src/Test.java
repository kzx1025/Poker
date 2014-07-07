
public class Test {
	
	
	
	public static void main(String args[])
	{
		Xipai xipai=new Xipai();
		
		Poker fapai=new Poker(xipai);
		fapai.display();
		fapai.findmaxcard(fapai);
		fapai.compare(fapai);
		System.out.println("第一家牌");
		fapai.findcow(fapai.cards[0]);
		System.out.println("第二家牌");
		fapai.findcow(fapai.cards[1]);
	}

}

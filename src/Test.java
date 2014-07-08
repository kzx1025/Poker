
public class Test {
	
public static int win=-1;
	public static void main(String args[])
	{
		Xipai xipai=new Xipai();
		
		Poker poker=new Poker(xipai);
		poker.display();
		//fapai.findmaxcard(fapai);
		//fapai.compare(fapai);
		System.out.println("第一家牌:");
		poker.findcow(poker.cards[0]);
		System.out.println("第二家牌:");
		poker.findcow(poker.cards[1]);
		win=poker.compare(poker.cards[0],poker.cards[1]);
		if(win==0){
			System.out.println("第一家赢");
		}else if(win==1){
			System.out.println("第二家赢");
		}else{
			System.out.println("出错，无法判断！");
		}
	}

}


public class Test {
	
public static int win=-1;
	public static void main(String args[])
	{
		Xipai xipai=new Xipai();
		
		Poker poker=new Poker(xipai);
		poker.display();
		//fapai.findmaxcard(fapai);
		//fapai.compare(fapai);
		System.out.println("��һ����:");
		poker.findcow(poker.cards[0]);
		System.out.println("�ڶ�����:");
		poker.findcow(poker.cards[1]);
		win=poker.compare(poker.cards[0],poker.cards[1]);
		if(win==0){
			System.out.println("��һ��Ӯ");
		}else if(win==1){
			System.out.println("�ڶ���Ӯ");
		}else{
			System.out.println("�����޷��жϣ�");
		}
	}

}

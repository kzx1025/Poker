import java.util.Scanner;

import org.slf4j.Logger;
//import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Test {
	
public static int win=-1;
	public static void main(String args[])
	{
		Logger logger = LoggerFactory.getLogger(Test.class);
		  // logger.info();
		Xipai xipai=new Xipai();
		Card[]cards=new Card[5];
		
		//比较大小测试
		Poker poker=new Poker(xipai);
		
		poker.display();
		System.out.println("第一家牌:");
		poker.findcow(poker.cards[0]);
		System.out.println("第二家牌:");
		poker.findcow(poker.cards[1]);
		win=poker.compare(poker.cards[0],poker.cards[1]);
		if(win==0){
			System.out.println("第一家赢!");
		}else if(win==1){
			System.out.println("第二家赢!");
		}else{
			System.out.println("出错，无法判断！");
		}
		
		
		//按特定类型发牌测试
		System.out.println("请输入你想要的牛型(所给数字对应牛型):");
		System.out.println("0:牛牛； 1:1牛； 2:2牛； 3:3牛； 4:4牛； 5:5牛； 6:6牛； 7:7牛； 8:8牛； 9:9牛； 10:无牛； 11:四炸； 12:五花牛； 13:五小牛；");
		Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        Fapai fapai=new Fapai();
        switch (a) {
		case 0:
			cards=fapai.niu(xipai, 0);
			break;
		case 1:
			cards=fapai.niu(xipai, 1);
			break;
		case 2:
			cards=fapai.niu(xipai, 2);
			break;
		case 3:
			cards=fapai.niu(xipai, 3);
			break;
		case 4:
			cards=fapai.niu(xipai, 4);
			break;
		case 5:
			cards=fapai.niu(xipai, 5);
			break;
		case 6:
			cards=fapai.niu(xipai, 6);
			break;
		case 7:
			cards=fapai.niu(xipai, 7);
			break;
		case 8:
			cards=fapai.niu(xipai, 8);
			break;
		case 9:
			cards=fapai.niu(xipai, 9);
			break;
		case 10:
			cards=fapai.wuniu(xipai);
			break;
		case 11:
			cards=fapai.sizha(xipai);
			break;
		case 12:
			cards=fapai.wuhuaniu(xipai);
			break;
		case 13:
			cards=fapai.wuxiaoniu(xipai);
			break;

		default:
			break;
		}
		logger.info(cards.toString());
		//cards=fapai.sizha(xipai);
		//cards=fapai.niu(xipai,2);
	//System.out.println(xipai.getamount());
		
		if(cards==null)
		{
			System.out.println("抱歉，剩余的牌凑不出该牌型");
		}
		else{
		for (int i=0;i<5;i++)
		{
			System.out.println(cards[i].result());
		}
		}
		
	}

}

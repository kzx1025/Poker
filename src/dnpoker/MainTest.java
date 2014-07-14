package dnpoker;

import java.util.Scanner;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainTest {

	public static void main(String args[]) {
		int win = -1;
		PokerSuit pokerSuit = new PokerSuit();
		pokerSuit.shuffle();
		DNpoker adnpoker = pokerSuit.getDNpoker();
		System.out.println(pokerSuit.getamount());
		DNpoker bdnpoker = pokerSuit.getDNpoker();

		System.out.println(pokerSuit.getamount());
		// 比较大小测试
		adnpoker.display();
		bdnpoker.display();
		System.out.println("第一家牌:");
		int t1 = adnpoker.findcow();
		System.out.println(t1);
		System.out.println("第二家牌:");
		int t2 = bdnpoker.findcow();
		System.out.println(t2);
		win = DNpoker.compare(adnpoker, bdnpoker);
		if (win == 0) {
			System.out.println("第一家赢!");
		} else if (win == 1) {
			System.out.println("第二家赢!");
		} else {
			System.out.println("出错，无法判断！");
		}

		// 按特定类型发牌测试
		System.out.println("请输入你想要的牛型(所给数字对应牛型):");
		System.out
				.println("0:牛牛； 1:1牛； 2:2牛； 3:3牛； 4:4牛； 5:5牛； 6:6牛； 7:7牛； 8:8牛； 9:9牛； 10:无牛； 11:四炸； 12:五花牛； 13:五小牛；");
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		PokerSuit suit = new PokerSuit();
		suit.shuffle();
		DNpoker testdnpoker = null;
		switch (a) {
		case 0:
			testdnpoker = suit.niu(0);
			testdnpoker.display();
			break;
		case 1:
			testdnpoker = suit.niu(1);
			testdnpoker.display();
			break;
		case 2:
			testdnpoker = suit.niu(2);
			testdnpoker.display();
			break;
		case 3:
			testdnpoker = suit.niu(3);
			testdnpoker.display();
			break;
		case 4:
			testdnpoker = suit.niu(4);
			testdnpoker.display();
			break;
		case 5:
			testdnpoker = suit.niu(5);
			testdnpoker.display();
			break;
		case 6:
			testdnpoker = suit.niu(6);
			testdnpoker.display();
			;
			break;
		case 7:
			testdnpoker = suit.niu(7);
			testdnpoker.display();
			break;
		case 8:
			testdnpoker = suit.niu(8);
			testdnpoker.display();
			break;
		case 9:
			testdnpoker = suit.niu(9);
			testdnpoker.display();
			break;
		case 10:
			testdnpoker = suit.wuniu();
			testdnpoker.display();
			break;
		case 11:
			testdnpoker = suit.sizha();
			testdnpoker.display();
			break;
		case 12:
			testdnpoker = suit.wuhuaniu();
			testdnpoker.display();
			break;
		case 13:
			testdnpoker = suit.wuxiaoniu();
			testdnpoker.display();
			break;

		default:
			System.out.println("请输入合理字符!");
			break;
		}

		if (testdnpoker == null) {
			System.out.println("抱歉，剩余的牌凑不出该牌型");
		}

	}

}

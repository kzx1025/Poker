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
		// �Ƚϴ�С����
		adnpoker.display();
		bdnpoker.display();
		System.out.println("��һ����:");
		int t1 = adnpoker.findcow();
		System.out.println(t1);
		System.out.println("�ڶ�����:");
		int t2 = bdnpoker.findcow();
		System.out.println(t2);
		win = DNpoker.compare(adnpoker, bdnpoker);
		if (win == 0) {
			System.out.println("��һ��Ӯ!");
		} else if (win == 1) {
			System.out.println("�ڶ���Ӯ!");
		} else {
			System.out.println("�����޷��жϣ�");
		}

		// ���ض����ͷ��Ʋ���
		System.out.println("����������Ҫ��ţ��(�������ֶ�Ӧţ��):");
		System.out
				.println("0:ţţ�� 1:1ţ�� 2:2ţ�� 3:3ţ�� 4:4ţ�� 5:5ţ�� 6:6ţ�� 7:7ţ�� 8:8ţ�� 9:9ţ�� 10:��ţ�� 11:��ը�� 12:�廨ţ�� 13:��Сţ��");
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
			System.out.println("����������ַ�!");
			break;
		}

		if (testdnpoker == null) {
			System.out.println("��Ǹ��ʣ����ƴղ���������");
		}

	}

}

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
		
		//�Ƚϴ�С����
		Poker poker=new Poker(xipai);
		
		poker.display();
		System.out.println("��һ����:");
		poker.findcow(poker.cards[0]);
		System.out.println("�ڶ�����:");
		poker.findcow(poker.cards[1]);
		win=poker.compare(poker.cards[0],poker.cards[1]);
		if(win==0){
			System.out.println("��һ��Ӯ!");
		}else if(win==1){
			System.out.println("�ڶ���Ӯ!");
		}else{
			System.out.println("�����޷��жϣ�");
		}
		
		
		//���ض����ͷ��Ʋ���
		System.out.println("����������Ҫ��ţ��(�������ֶ�Ӧţ��):");
		System.out.println("0:ţţ�� 1:1ţ�� 2:2ţ�� 3:3ţ�� 4:4ţ�� 5:5ţ�� 6:6ţ�� 7:7ţ�� 8:8ţ�� 9:9ţ�� 10:��ţ�� 11:��ը�� 12:�廨ţ�� 13:��Сţ��");
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
			System.out.println("��Ǹ��ʣ����ƴղ���������");
		}
		else{
		for (int i=0;i<5;i++)
		{
			System.out.println(cards[i].result());
		}
		}
		
	}

}

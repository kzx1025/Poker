import java.util.ArrayList;
import java.util.Random;


public class Xipai {
	private ArrayList<Card> cards;
	
	Xipai(){
		cards=new ArrayList<Card>();
		int index1,index2;
		Random example=new Random();
		Card temp;
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<13;b++)
			{
				cards.add(new Card(a,b));//��list����������п��ܵ���
				//System.out.println(cards.size());
			}
		}
		//��ʼģ��ϴ��
		for(int i=0;i<100;i++)
		{
		index1=example.nextInt(cards.size()-1);
		index2=example.nextInt(cards.size()-1);
		temp=cards.get(index1);
		cards.set(index1,cards.get(index2));
		cards.set(index2,temp);
		}
	}
	
	public int getamount()
	{
		return cards.size();
	}
	public Card removeonecard()
	{
		return cards.remove(0);//�Ƶ�������һ����
	}
	
	public ArrayList<Card> getcards()
	{
		return  cards;
	}
	public Card getunique(int m)
	{
		return cards.get(m);
	}
	public Card removeunique(int m)
	{
		return cards.remove(m);
	}


}

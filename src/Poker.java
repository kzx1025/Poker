
public class Poker {
	public int niu_type=0;

	public Card[][] cards;
	public Poker(Xipai d){
		// TODO Auto-generated constructor stub
		cards=new Card[2][5];
	for(int i=0;i<2;i++)
	{
		for (int j=0;j<5;j++)
		{
			cards[i][j]=d.removeonecard();
		}
	}
		
	}
	
	void display()
	{
		for(int i=0;i<2;i++)
		{
		for(int j=0;j<5;j++)
		{
			System.out.print(cards[i][j].result());
			System.out.print(",");
		}
		System.out.println();
		}
	}
     Card findmaxcard(Poker a) //�ҳ�һ������������
	{
		Card maxcard=a.cards[0][0];
		for(int i=1;i<5;i++)
		{
			Card currentcard=a.cards[0][i];
			if(maxcard.getvalue()<currentcard.getvalue()||(maxcard.getvalue()==currentcard.getvalue()&&maxcard.getcolor()<currentcard.getcolor()))
			{
				maxcard=currentcard;
			}
		}
		System.out.println(maxcard.result());
		return maxcard;
		
	}
	void compare(Poker a)
	{
		if(a.cards[0][0].getvalue()>a.cards[1][0].getvalue())
		{
			System.out.println("you win");
		}
	}
    int changeJQK(Card card)
    {
    	if (card.getvalue()>9)//���ظ�ֵ��С
    	{
    		return 9;
    	}
    	return card.getvalue();
    }
	void findcow(Card[] cards)
	{
		int wuxiao_num=0;
		int wuxiao_sum=0;
		int wuhua_num=0;
		int all_poker_sum=0;
		//�ж��Ƿ�Ϊ5Сţ
		for(int i=0;i<5;i++)
		{
			all_poker_sum+=changeJQK(cards[i])+1;
			if(cards[i].getvalue()+1<5)//��1��ԭ����������ʵ��ֵ֮�����1
			{
				++wuxiao_num;
				wuxiao_sum+=cards[i].getvalue()+1;
			}else if(cards[i].getvalue()+1>10)
			{
				++wuhua_num;
			}
		}

			if ((wuxiao_num == 5)&&(wuxiao_sum <= 10)) {
				// �ж��Ƿ�Ϊ��Сţ
				niu_type=13;
				System.out.println("��Сţ");

			} else if (wuhua_num == 5) {
				//�ж��Ƿ�Ϊ�廨ţ
				niu_type=12;
				System.out.println("�廨ţ");
			}
		
			int sizha_count=0;
			for(int i=0;i<5;i++)
			{
				for(int j=0;j<5;j++){
				if(cards[i].getvalue()==cards[j].getvalue())
				{
					sizha_count++;
				}
				}
				if(sizha_count==4){
					niu_type=11;
					System.out.println("��ը");
					break;
				}
				sizha_count=0;
			
			}
			
			//�жϼ�ţ
		int niusum[]=new int[10];
		niusum[0]=cards[0].getvalue()+cards[1].getvalue()+cards[2].getvalue()+3;
		niusum[1]=cards[0].getvalue()+cards[1].getvalue()+cards[3].getvalue()+3;
		niusum[2]=cards[0].getvalue()+cards[1].getvalue()+cards[4].getvalue()+3;
		niusum[3]=cards[0].getvalue()+cards[2].getvalue()+cards[3].getvalue()+3;
		niusum[4]=cards[0].getvalue()+cards[2].getvalue()+cards[4].getvalue()+3;
		niusum[5]=cards[1].getvalue()+cards[2].getvalue()+cards[3].getvalue()+3;
		niusum[6]=cards[1].getvalue()+cards[2].getvalue()+cards[4].getvalue()+3;
		niusum[7]=cards[1].getvalue()+cards[3].getvalue()+cards[4].getvalue()+3;
		niusum[8]=cards[0].getvalue()+cards[3].getvalue()+cards[4].getvalue()+3;
		niusum[9]=cards[2].getvalue()+cards[3].getvalue()+cards[4].getvalue()+3;
		for(int i=0;i<10;i++)
		{
			if(niusum[i]%10==0){
				int s=all_poker_sum%10;
				if(s==0)
				{
					niu_type=10;
					System.out.println("ţţ");
					break;
				}else{
					niu_type=s;
					System.out.println(s+"ţ");
					break;
				}
			}
		}
	
		//System.out.print(all_poker_sum);
			if(niu_type==0)
			System.out.println("ûţ");
		}
	void compare(Card[] cards1,Card[] cards2)
	{
		
	}

}

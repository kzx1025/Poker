
public class DNpoker {
	
	public Poker pokers[]=new Poker[5];
	        public int cow_type=0;
			public DNpoker(){
				// TODO Auto-generated constructor stub
				//pokers=new Poker[5];
				
			}
	 
			void display()//������ʾ
			{
			
				for(int j=0;j<5;j++)
				{
					System.out.print(pokers[j].result());
					System.out.print(",");
				}
				System.out.println();

			}
		public int findcow()
		{
			int wuxiao_num=0;
			int wuxiao_sum=0;
			int wuhua_num=0;
			int all_poker_sum=0;
			//�ж��Ƿ�Ϊ5Сţ
			for(int i=0;i<5;i++)
			{
				all_poker_sum+=Poker.changeJQK(pokers[i])+1;
				if(pokers[i].getvalue()+1<5)//��1��ԭ����������ʵ��ֵ֮�����1
				{
					++wuxiao_num;
					wuxiao_sum+=pokers[i].getvalue()+1;
				}else if(pokers[i].getvalue()+1>10)
				{
					++wuhua_num;
				}
			}

				if ((wuxiao_num == 5)&&(wuxiao_sum <= 10)) {
					// �ж��Ƿ�Ϊ��Сţ
					cow_type=13;
					//System.out.println("��Сţ");
					return cow_type;

				} else if (wuhua_num == 5) {
					//�ж��Ƿ�Ϊ�廨ţ
					cow_type=12;
					
					//System.out.println("�廨ţ");
					return cow_type;
				}
				else{
			
					int sizha_count=0;
					for(int i=0;i<5;i++)
					{
						for(int j=0;j<5;j++){
						if((pokers[i].getvalue()==pokers[j].getvalue())&&(i!=j))
						{
							sizha_count++;
						}
						}
						if(sizha_count==3){
							cow_type=11;
							//System.out.println("��ը");
							return cow_type;
						}
						sizha_count=0;
					
					}
				//�жϼ�ţ
			int niusum[]=new int[10];
			niusum[0]=Poker.changeJQK(pokers[0])+Poker.changeJQK(pokers[1])+Poker.changeJQK(pokers[2])+3;
			niusum[1]=Poker.changeJQK(pokers[0])+Poker.changeJQK(pokers[1])+Poker.changeJQK(pokers[3])+3;
			niusum[2]=Poker.changeJQK(pokers[0])+Poker.changeJQK(pokers[1])+Poker.changeJQK(pokers[4])+3;
			niusum[3]=Poker.changeJQK(pokers[0])+Poker.changeJQK(pokers[2])+Poker.changeJQK(pokers[3])+3;
			niusum[4]=Poker.changeJQK(pokers[0])+Poker.changeJQK(pokers[2])+Poker.changeJQK(pokers[4])+3;
			niusum[5]=Poker.changeJQK(pokers[1])+Poker.changeJQK(pokers[2])+Poker.changeJQK(pokers[3])+3;
			niusum[6]=Poker.changeJQK(pokers[1])+Poker.changeJQK(pokers[2])+Poker.changeJQK(pokers[4])+3;
			niusum[7]=Poker.changeJQK(pokers[1])+Poker.changeJQK(pokers[3])+Poker.changeJQK(pokers[4])+3;
			niusum[8]=Poker.changeJQK(pokers[0])+Poker.changeJQK(pokers[3])+Poker.changeJQK(pokers[4])+3;
			niusum[9]=Poker.changeJQK(pokers[2])+Poker.changeJQK(pokers[3])+Poker.changeJQK(pokers[4])+3;
			for(int i=0;i<10;i++)
			{
				//System.out.println("ֵ��"+niusum[i]);
				if(niusum[i]%10==0){
					int s=all_poker_sum%10;
					if(s==0)
					{
						cow_type=10;
						//System.out.println("ţţ");
						return cow_type;
					}else{
						cow_type=s;
						//System.out.println(s+"ţ");
						return cow_type;
					}
				}
			}
	
			//System.out.print(all_poker_sum);
				if(cow_type==0)
			//	System.out.println("ûţ");
				return cow_type;
				}
				return 0;
			
		}
		
		static int compare(DNpoker dnpoker1,DNpoker dnpoker2)
		{
			if(dnpoker1.cow_type>dnpoker2.cow_type)
			{
				//System.out.println("��һ��Ӯ");
				return 0;
			}else if(dnpoker1.cow_type<dnpoker2.cow_type)
			{
				//System.out.println("�ڶ���Ӯ");
				return 1;
			}else{
				
				//��������ͬʱ���������´���Ƚ�
				Poker apoker=dnpoker1.findmaxcard();//�ҳ�ÿһ���������
				Poker bpoker=dnpoker2.findmaxcard();
				if(Poker.comparesingle(apoker, bpoker))
				{
					//System.out.println("��һ��Ӯ");
					return 0;
				}else {
					//System.out.println("�ڶ���Ӯ");
					return 1;
				}
			}
			
      }
		
		Poker findmaxcard() //�ҳ�һ������������
		{
			Poker maxcard=pokers[0];
			for(int i=1;i<5;i++)
			{
				Poker currentcard=pokers[i];
				if(maxcard.getvalue()<currentcard.getvalue()||(maxcard.getvalue()==currentcard.getvalue()&&maxcard.getcolor()<currentcard.getcolor()))
				{
					maxcard=currentcard;
				}
			}
			//System.out.println(maxcard.result());
			return maxcard;
			
		}
}

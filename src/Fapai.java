import java.util.Iterator;



public class Fapai {
	
	public Card[] cards;
	Card temp;
	public Fapai(){
		// TODO Auto-generated constructor stub
		cards=new Card[5];
		
	
		/**for (int i=0;i<5;i++)
		{
			cards[i]=d.removeonecard();
		}
		**/
	}
	void display()
	{
	
		for(int j=0;j<5;j++)
		{
			System.out.print(cards[j].result());
			System.out.print(",");
		}
		System.out.println();
	}
	//五小牛
	Card[] wuxiaoniu(Xipai d)
	{
		cards=new Card[5];
		int a1,a2,a3,a4,a5=0;
		int card_num=d.getamount();
		//System.out.println("数量:"+card_num);
		 //temp=d.removeonecard();

		
		for(a1=0;a1<card_num-4;a1++){
			if(d.getunique(a1).getvalue()+1>=5)
				continue;
			for(a2=a1+1;a2<card_num-3;a2++){
				if(d.getunique(a2).getvalue()+1>=5)
					continue;
				for(a3=a2+1;a3<card_num-2;a3++)
				{
					if(d.getunique(a3).getvalue()+1>=5)
						continue;
					for(a4=a3+1;a4<card_num-1;a4++)
					{
						if(d.getunique(a4).getvalue()+1>=5)
							continue;
						for(a5=a4+1;a5<card_num;a5++)
						{
							if(d.getunique(a5).getvalue()+1>=5)
								continue;
							else if(d.getunique(a1).getvalue()+d.getunique(a2).getvalue()+d.getunique(a3).getvalue()+d.getunique(a4).getvalue()+d.getunique(a5).getvalue()+5<=10){
								cards[0]=d.getunique(a1);
							
			    				cards[1]=d.getunique(a2);
			    				cards[2]=d.getunique(a3);
			    				cards[3]=d.getunique(a4);
			    				cards[4]=d.getunique(a5);
			    				Iterator<Card> iter = d.getcards().iterator(); 
			    				while(iter.hasNext())
			    				{
			    					Card sCard=iter.next();
			    					if(sCard==cards[0]||sCard==cards[1]||sCard==cards[2]||sCard==cards[3]||sCard==cards[4])
			    						iter.remove();
			    				}
			    				return cards;
							}
						}
						
					}
					
				}
				
			}
		
		}
		//hs++;
		
	return null;
			
			
			
	/**	//System.out.println(temp.getvalue());
		if(temp.getvalue()+1<5)
		{
			cards[i]=temp;
			//System.out.println(cards[i].getvalue()+"!"+i);
			i++;
			m++;
			if(i>4)
			{
				break;
			}
		}
		else {
			m++;
		}
		if(m>52)
		{
			return null;
			//break;
		}	
	}
	return cards;**/
		
		
	}
	
	//五花牛
    Card[] wuhuaniu(Xipai d)
	{
		cards=new Card[5];
		int i=0;
		int m=0;
		int card_num=d.getamount();
		while(true)
		{
			temp=d.getunique(m);
			if(temp.getvalue()+1>10){//牌值大于10
				cards[i]=temp;
				i++;
				m++;
				if(i>4){
					Iterator<Card> iter = d.getcards().iterator(); 
				while(iter.hasNext())
				{
					Card sCard=iter.next();
					if(sCard==cards[0]||sCard==cards[1]||sCard==cards[2]||sCard==cards[3]||sCard==cards[4])
						iter.remove();
				}
					break;
				}
			}
			else{
				m++;
			}
			if(m>card_num){
				return null;
			}
		}
		return cards;
	}
    
   static boolean isequal(int a,int b,int c,int d)
   {
	   if((a==b)&&(a==c)&&(a==d))
	   {
		   return true;
	   }else{
		   return false;
	   }
   }
    Card[] sizha(Xipai d)
    {
    	cards=new Card[5];
		//int i=1;
		//int m=0;
    	int card_num=d.getamount();
		int a1=0,a2=0,a3=0,a4=0;
		for(a1=0;a1<card_num-4;a1++){
			for(a2=a1+1;a2<card_num-3;a2++)
			{
				for(a3=a2+1;a3<card_num-2;a3++)
				{
					for(a4=a3+1;a4<card_num-1;a4++)
					{
						if(isequal(d.getunique(a1).getvalue(), d.getunique(a2).getvalue(), d.getunique(a3).getvalue(),d.getunique(a4).getvalue()))
			    		{
							cards[0]=d.getunique(a1);
		    				cards[1]=d.getunique(a2);
		    				cards[2]=d.getunique(a3);
		    				cards[3]=d.getunique(a4);
		    				
		    				Iterator<Card> iter = d.getcards().iterator(); 
		    				while(iter.hasNext())
		    				{
		    					Card sCard=iter.next();
		    					if(sCard==cards[0]||sCard==cards[1]||sCard==cards[2]||sCard==cards[3])
		    						iter.remove();
		    				}
		    				cards[4]=d.removeonecard();
		    			return cards;
					}
				}
			}
		}
		}
		return null;
		/**cards[0]=d.removeonecard();
	//System.out.println(cards[0].getvalue()+"!");
		while(true){
			//System.out.println(cards[0].getvalue());
		  temp=d.removeonecard();
			//System.out.println(temp.getvalue());
			if(temp.getvalue()==cards[0].getvalue()){
				
				cards[i]=temp;
				//System.out.println(cards[i].getvalue());
				i++;
			
			
				m++;
				if(i>3){
					
					break;
				}
			}else{
			m++;
			
			}
			if(m>=51){
				return null;
			}
			
		}
		cards[4]=d.removeonecard();
		
		return cards;**/
			
			
    }
    
    Card[] niu(Xipai d,int niu_num)
    {
    	//int i=1;
    	int n=2;
    	int m=0;
    	int flag=0;
    	int a1=0,a2=0,a3=0;
    	int hs=0;
    	cards=new Card[5];
    	int card_num=d.getamount();
    	//cards[0]=d.removeonecard();
    	//cards[1]=d.removeonecard();
    	while(true)
    	{
    	a1=hs;
    			for(;a1<card_num-2;a1++)
    			{
    				for(a2=a1+1;a1<card_num-1;a2++)
    				{
    					for(a3=a2+1;a3<card_num;a3++){
    						if((Poker.changeJQK(d.getunique(a1))+Poker.changeJQK(d.getunique(a2))+Poker.changeJQK(d.getunique(a3))+3)%10==0)
    			    		{
    							cards[0]=d.getunique(a1);
    		    				cards[1]=d.getunique(a2);
    		    				cards[2]=d.getunique(a3);
    		    				hs=a1;
    		    				flag=1;
    		    				break;
    			    		}
    					}
    					if(flag==1)
    						break;
    				}
    				if(flag==1)
    					break;
    				
    			}
    			if(hs>50){
    				break;
    			}
    		/**while(true){
    		temp=d.getunique(n);
    		
    		if((Poker.changeJQK(cards[0])+Poker.changeJQK(cards[1])+Poker.changeJQK(temp)+3)%10==0)
    		{
    			cards[2]=temp;
    			break;
    		}
    		n++;
    		if(n>49)
    		{
    			return null;//没找到和为3的情况
    		}
    		}**/

    	for(int i=2;i<card_num-4;i++)
    	{
    		for(int j=i+1;j<card_num-3;j++){
    			if((i!=n-1)&&(j!=n-1)){
    				//System.out.println(d.getunique(i).getvalue()+"!"+i+"and"+j+"!"+d.getamount());
    			if((Poker.changeJQK(d.getunique(i))+Poker.changeJQK(d.getunique(j))+2)%10==niu_num){
    				cards[3]=d.getunique(i);
    				cards[4]=d.getunique(j);
    				Iterator<Card> iter = d.getcards().iterator(); 
    				while(iter.hasNext())
    				{
    					Card sCard=iter.next();
    					if(sCard==cards[0]||sCard==cards[1]||sCard==cards[2]||sCard==cards[3]||sCard==cards[4])
    						iter.remove();
    				}
    		

    				
    				return cards;
    			}
    			}
    			}
    		
    	}
    	flag=0;
    	}//while 循环
    return null;
    }
    Card[] wuniu(Xipai d)
    {
    	Card[] test=new Card[5];
    	test[0]=new Card(1, 2);
    	test[1]=new Card(2, 3);
    	test[2]=new Card(1, 7);
    	test[3]=new Card(2, 4);
    	test[4]=new Card(1, 4);
    	return test;
    } 
}



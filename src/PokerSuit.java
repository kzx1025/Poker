import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;


public class PokerSuit {
public ArrayList<Poker> pokers;
	
	PokerSuit(){
		pokers=new ArrayList<Poker>();
		int index1,index2;
		Random example=new Random();
		Poker temp;
		for(int a=0;a<4;a++)
		{
			for(int b=0;b<13;b++)
			{
				pokers.add(new Poker(a,b));//在list里面添加所有可能的牌
				//System.out.println(pokers.size());
			}
		}
		//开始模拟洗牌
		for(int i=0;i<100;i++)
		{
		index1=example.nextInt(pokers.size()-1);
		index2=example.nextInt(pokers.size()-1);
		temp=pokers.get(index1);
		pokers.set(index1,pokers.get(index2));
		pokers.set(index2,temp);
		}
	}
	
	public DNpoker getDNpoker()
	{
		DNpoker dnpoker=new DNpoker();
		for (int i=0;i<5;i++)
		{
		dnpoker.pokers[i]=removeonecard();
		}
		return dnpoker;
	}
	
	DNpoker wuxiaoniu()
	{
		DNpoker dnpoker=new DNpoker();
		int a1=0,a2=0,a3=0,a4=0,a5=0;
		int poker_num=getamount();
		//System.out.println("数量:"+card_num);
		 //temp=d.removeonecard();
        if(poker_num<5)
        {
        	return null;
        }
		
		for(;a1<poker_num-4;a1++){
		
			if(getunique(a1).getvalue()+1>=5)
				continue;
			for(a2=a1+1;a2<poker_num-3;a2++){
				
				if(getunique(a2).getvalue()+1>=5)
					continue;
				for(a3=a2+1;a3<poker_num-2;a3++)
				{
					
					if(getunique(a3).getvalue()+1>=5)
						continue;
					for(a4=a3+1;a4<poker_num-1;a4++)
					{
						if(getunique(a4).getvalue()+1>=5)
							continue;
						for(a5=a4+1;a5<poker_num;a5++)
						{
							if(getunique(a5).getvalue()+1>=5)
								continue;
							else if(getunique(a1).getvalue()+getunique(a2).getvalue()+getunique(a3).getvalue()+getunique(a4).getvalue()+ getunique(a5).getvalue()+5<=10){
								dnpoker.pokers[0]=getunique(a1);
							
								dnpoker.pokers[1]=getunique(a2);
								dnpoker.pokers[2]=getunique(a3);
								dnpoker.pokers[3]=getunique(a4);
								dnpoker.pokers[4]=getunique(a5);
			    				Iterator<Poker> iter = getpokers().iterator(); 
			    				while(iter.hasNext())
			    				{
			    					Poker sCard=iter.next();
			    					if(sCard==dnpoker.pokers[0]||sCard==dnpoker.pokers[1]||sCard==dnpoker.pokers[2]||sCard==dnpoker.pokers[3]||sCard==dnpoker.pokers[4])
			    						iter.remove();
			    				}
			    				return dnpoker;
							}
						}
						
						
					}
				
					
				}
				
				
			}
		
		}
		//hs++;	
	return null;	
    }
	
	//五花牛
	DNpoker wuhuaniu()
	{
		DNpoker dnpoker=new DNpoker();
		int i=0;
		int m=0;
		Poker temp;
		int poker_num=getamount();
	      if(poker_num<5)
	        {
	        	return null;
	        }
		while(true)
		{
			temp=getunique(m);
			if(temp.getvalue()+1>10){//牌值大于10
				dnpoker.pokers[i]=temp;
				i++;
				m++;
				if(i>4){
					Iterator<Poker> iter = getpokers().iterator(); 
				while(iter.hasNext())
				{
					Poker sCard=iter.next();
					if(sCard==dnpoker.pokers[0]||sCard==dnpoker.pokers[1]||sCard==dnpoker.pokers[2]||sCard==dnpoker.pokers[3]||sCard==dnpoker.pokers[4])
						iter.remove();
				}
					break;
				}
			}
			else{
				m++;
			}
			if(m>poker_num){
				return null;
			}
		}
		return dnpoker;
	}
    
	public DNpoker sizha()
    {
		DNpoker dnpoker=new DNpoker();
		//int i=1;
		//int m=0;
    	int pork_num=getamount();
        if(pork_num<5)
        {
        	return null;
        }
		int a1=0,a2=0,a3=0,a4=0,a5=0;
		for(a1=0;a1<pork_num-4;a1++){
			for(a2=a1+1;a2<pork_num-3;a2++)
			{
				for(a3=a2+1;a3<pork_num-2;a3++)
				{
					for(a4=a3+1;a4<pork_num-1;a4++)
					{
						for(a5=0;a5<pork_num;a5++)
						if((isequal(getunique(a1).getvalue(), getunique(a2).getvalue(), getunique(a3).getvalue(),getunique(a4).getvalue()))
								&&(a5!=a1)&&(a5!=a2)&&(a5!=a3)&&(a5!=a4)&&(getunique(a1).getvalue()+1<11)&&(getunique(a1).getvalue()+getunique(a2).getvalue()+getunique(a3).getvalue()+getunique(a4).getvalue()+getunique(a5).getvalue()+5>10))//待优化，需要调整防止是五花牛类型和五小类型的
			    		{
							dnpoker.pokers[0]=getunique(a1);
							dnpoker.pokers[1]=getunique(a2);
							dnpoker.pokers[2]=getunique(a3);
							dnpoker.pokers[3]=getunique(a4);
							dnpoker.pokers[4]=getunique(a5);
		    				Iterator<Poker> iter = getpokers().iterator(); 
		    				while(iter.hasNext())
		    				{
		    					Poker sCard=iter.next();
		    					if(sCard==dnpoker.pokers[0]||sCard==dnpoker.pokers[1]||sCard==dnpoker.pokers[2]||sCard==dnpoker.pokers[3]||sCard==dnpoker.pokers[4])
		    						iter.remove();
		    				}
		    				//cards[4]=d.removeonecard();
		    			return dnpoker;
					}
				}
			}
		}
		}
		return null;
    }
	
	  DNpoker niu(int niu_num)
	    {
	    	//int i=1;
	    	int n=2;
	    	int m=0;
	    	int flag=0;
	    	int a1=0,a2=0,a3=0;
	    	int hs=0;
	    	DNpoker dnpoker=new DNpoker();
	    	int poker_num=getamount();
	        if(poker_num<5)
	        {
	        	return null;
	        }

	    	while(true)
	    	{
	    	a1=hs;
	    			for(;a1<poker_num-2;a1++)
	    			{
	    				for(a2=a1+1;a1<poker_num-1;a2++)
	    				{
	    					for(a3=a2+1;a3<poker_num;a3++){
	    						if((Poker.changeJQK(getunique(a1))+Poker.changeJQK(getunique(a2))+Poker.changeJQK(getunique(a3))+3)%10==0)
	    			    		{
	    							dnpoker.pokers[0]=getunique(a1);
	    							dnpoker.pokers[1]=getunique(a2);
	    							dnpoker.pokers[2]=getunique(a3);
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


	    	for(int i=2;i<poker_num-4;i++)
	    	{
	    		for(int j=i+1;j<poker_num-3;j++){
	    			if((i!=n-1)&&(j!=n-1)){
	    				//System.out.println(d.getunique(i).getvalue()+"!"+i+"and"+j+"!"+d.getamount());
	    			if((Poker.changeJQK(getunique(i))+Poker.changeJQK(getunique(j))+2)%10==niu_num){
	    				dnpoker.pokers[3]=getunique(i);
	    				dnpoker.pokers[4]=getunique(j);
	    				Iterator<Poker> iter = getpokers().iterator(); 
	    				while(iter.hasNext())
	    				{
	    					Poker sCard=iter.next();
	    					if(sCard==dnpoker.pokers[0]||sCard==dnpoker.pokers[1]||sCard==dnpoker.pokers[2]||sCard==dnpoker.pokers[3]||sCard==dnpoker.pokers[4])
	    						iter.remove();
	    				}
	    		

	    				
	    				return dnpoker;
	    			}
	    			}
	    			}
	    		
	    	}
	    	flag=0;
	    	}//while 循环
	    return null;
	    }	
	
	  DNpoker wuniu()
	    {
		  DNpoker dnpoker=new DNpoker();
			int a1,a2,a3,a4,a5=0;
			int poker_num=getamount();
		    if(poker_num<5)
		    {
		       return null;
		    }
			//System.out.println("数量:"+card_num);
			 //temp=d.removeonecard();

			
			for(a1=0;a1<poker_num-4;a1++){
				for(a2=a1+1;a2<poker_num-3;a2++){

					for(a3=a2+1;a3<poker_num-2;a3++)
					{

						for(a4=a3+1;a4<poker_num-1;a4++)
						{

							for(a5=a4+1;a5<poker_num;a5++)
							{
								dnpoker.pokers[0]=getunique(a1);
								dnpoker.pokers[1]=getunique(a2);
								dnpoker.pokers[2]=getunique(a3);
								dnpoker.pokers[3]=getunique(a4);
								dnpoker.pokers[4]=getunique(a5);
								if(dnpoker.findcow()==0){
				    				Iterator<Poker> iter = getpokers().iterator(); 
				    				while(iter.hasNext())
				    				{
				    					Poker sCard=iter.next();
				    					if(sCard==dnpoker.pokers[0]||sCard==dnpoker.pokers[1]||sCard==dnpoker.pokers[2]||sCard==dnpoker.pokers[3]||sCard==dnpoker.pokers[4])
				    						iter.remove();
				    				}
				    				return dnpoker;
								}
								}
							}
							
						}
						
					}
					
				}
			
			
			//hs++;
			
		return null;
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
	
	public int getamount()
	{
		return pokers.size();
	}
	public Poker removeonecard()
	{
		return pokers.remove(0);//移掉最上面一张牌
	}
	
	public ArrayList<Poker> getpokers()
	{
		return  pokers;
	}
	public Poker getunique(int m)
	{
		return pokers.get(m);
	}
	public Poker removeunique(int m)
	{
		return pokers.remove(m);
	}


}
